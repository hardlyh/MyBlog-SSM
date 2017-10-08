package lyh.blog.controller;

import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import lyh.blog.common.pojo.ResultBO;
import lyh.blog.pojo.BlogMyprofile;
import lyh.blog.service.ProfileService;
import lyh.blog.util.IDUtils;
import lyh.blog.util.QiniuUpload;

/**
 * @ClassName: ProfileController
 * @Description: 个人简介Controller
 * @author student.lyh
 * @date 2017年10月5日 下午5:49:20
 */
@Controller
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @RequestMapping("/admin/getProfile")
    public String getProfileById(Model model, Byte id, Integer promptT) {
        BlogMyprofile profile = profileService.getProfileById((byte) 1);
        model.addAttribute("mp", profile);
        if (promptT != null && promptT == 1) {
            model.addAttribute("flag", "o");
        }
        return "myprofile";
    }

    @RequestMapping("/admin/updateProfile")
    public String updateProfile(Model model, BlogMyprofile blogMyprofile, MultipartFile headImg) {
        String fileName = headImg.getOriginalFilename();
        if (fileName != null && !("").equals(fileName)) {
            String key = null;
            try {
                InputStream in = headImg.getInputStream();
                key = QiniuUpload.upload(in, IDUtils.genImageName());
            } catch (Exception e) {
                e.printStackTrace();
            }
            blogMyprofile.setHeadPortraitUrl(key);
        }
        profileService.updateProfile(blogMyprofile);
        // promptT 显示提示操作成功窗口标志
        return "redirect:/admin/getProfile?promptT=1";

    }

}
