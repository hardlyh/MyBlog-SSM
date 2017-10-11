package lyh.blog.controller;

import java.io.InputStream;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import lyh.blog.common.pojo.ArticleDO;
import lyh.blog.common.pojo.PaginatorResult;
import lyh.blog.common.pojo.ResultBO;
import lyh.blog.pojo.BlogPage;
import lyh.blog.service.ArticleService;
import lyh.blog.util.IDUtils;
import lyh.blog.util.QiniuUpload;

/**
 * @ClassName: PageController
 * @Description: 文章管理
 * @author student.lyh
 * @date 2017年10月2日 下午7:18:40
 */
@Controller
public class ArticleController {

    @Value("${qiniuUrl}")
    private String qiniuUrl;

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/admin/saveArticle")
    public String saveAtricle(Model model, BlogPage page, String pageContent, MultipartFile headFile,
            Integer pageIsPrivateToByte) {
        // 将文件上传到服务器
        String filename = headFile.getOriginalFilename();
        if (StringUtils.isNoneBlank(filename)) {
            String key = null;
            try {
                InputStream in = headFile.getInputStream();
                key = QiniuUpload.upload(in, IDUtils.genImageName());
            } catch (Exception e) {
                e.printStackTrace();
            }
            page.setPageImgurl(qiniuUrl + "/" + key);
        }
        page.setGmtCreate(new Date());
        page.setGmtModified(new Date());
        page.setPageIsPrivate(pageIsPrivateToByte.byteValue());
        articleService.saveArticle(page, pageContent);
        model.addAttribute("flag", "o");
        return "edit";
    }

    @RequestMapping("/admin/articleList")
    @ResponseBody
    public PaginatorResult listAllArticle(Integer page, Integer row) {
        if (page != null && row != null) {
            return articleService.listAll(page, row);
        }
        return null;
    }

    @RequestMapping("/admin/toUpdateArticle")
    public String toUpdate(Model model, Integer id) {
        if (id != null) {
            ArticleDO<BlogPage> articleDO = articleService.toUpdate(id);
            model.addAttribute("article", articleDO.getObj());
            model.addAttribute("content", articleDO.getMessage());
            return "updatePage";
        }
        return null;
    }

    @RequestMapping("/admin/updateArticle")
    public String updateArticle(Model model,BlogPage page, String content, MultipartFile headFile) {
        String filename = headFile.getOriginalFilename();
        if (StringUtils.isNoneBlank(filename)) {
            String key = null;
            try {
                InputStream in = headFile.getInputStream();
                key = QiniuUpload.upload(in, IDUtils.genImageName());
            } catch (Exception e) {
                e.printStackTrace();
            }
            page.setPageImgurl(qiniuUrl + "/" + key);
        }
        articleService.updateArticle(page, content);
        model.addAttribute("flag", "o");
        return "pageList";
    }
    
    
    
    
    
    @RequestMapping("/admin/privateArticle")
    @ResponseBody
    public PaginatorResult listPrivateArticle(Integer page, Integer row) {
        if (page != null && row != null) {
            return articleService.listPrivate(page, row);
        }
        return null;
    }
}
