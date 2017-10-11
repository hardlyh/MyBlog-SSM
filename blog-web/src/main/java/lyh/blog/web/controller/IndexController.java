package lyh.blog.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lyh.blog.pojo.BlogMyprofile;
import lyh.blog.service.ProfileService;

/**
* @ClassName: IndexController
* @Description: 跳转首页,并且某些信息初始化
* @author student.lyh
* @date 2017年10月8日 上午10:05:06
*/
@Controller
public class IndexController {
    
    @Autowired
    private ProfileService profileService;
    
    /**
    * @Description: 初始化某些信息,并且跳转首页 
    * @return String    返回类型
     */
    @RequestMapping("/web/indexAndInfor.do")
    public String getIndexAndSetInformation(HttpSession httpSession){
        return "redirect:/lw-index.html";
    }

}
