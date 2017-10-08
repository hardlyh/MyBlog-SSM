package lyh.blog.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lyh.blog.common.pojo.PaginatorResult;
import lyh.blog.service.ArticleService;

/**
 * @ClassName: ArticleController
 * @Description: 文章Controller
 * @author student.lyh
 * @date 2017年10月6日 下午12:12:19
 */
@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/article/listArticle.do")
    @ResponseBody
    public PaginatorResult listArticle(Integer page, Integer row) {
        if (page != null && row != null) {
            PaginatorResult result = articleService.listAll(page, row);
            return result;
        }
        return null;
    }

    /**
     * @Description: 根据分类id返回对应的文章
     * @return PaginatorResult 返回类型
     */
    @RequestMapping("/web/getCategoryArticle.do")
    @ResponseBody
    public PaginatorResult listCategoryArticle(String tagName, Integer page, Integer row) {
        if (tagName != null && page != null && row != null) {
            PaginatorResult list = articleService.listCategoryArticle(tagName, page, row  );
            return list;
        }
        return null;
    }
    
    /**
    * @Description: 返回全部文章,不分页 用于文章归档
    * @return String    返回类型
     */
    @RequestMapping("/web/timelineArticle.do")
    @ResponseBody
    public String listAllArticle(){
        return articleService.listAllNotPaginator();
    }
    

}
