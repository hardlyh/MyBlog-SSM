package lyh.blog.controller;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lyh.blog.common.pojo.ResultBO;
import lyh.blog.pojo.BlogAdmin;
import lyh.blog.service.UserService;

/**
 * @ClassName: UserController
 * @Description: 用户Controller
 * @author student.lyh
 * @date 2017年10月5日 下午9:57:50
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/admin/login")
    public String login(Model model, BlogAdmin blogAdmin, HttpSession httpSession) {
        System.out.println("contro" + blogAdmin);
        Subject subject = SecurityUtils.getSubject();
        AuthenticationToken token = new UsernamePasswordToken(blogAdmin.getUsername(), blogAdmin.getPassword());// 创建用户名密码令牌对象
        try {
            subject.login(token); // 调用内置的登录方法来实现检验
        } catch (UnknownAccountException | IncorrectCredentialsException e) {
            System.out.println("UnknownAccountException");
            e.printStackTrace();
            model.addAttribute("flag", "账号密码错误,请重新输入");
            return "login";
        } catch (Exception e2) {
            System.out.println("IncorrectCredentialsException");
            e2.printStackTrace();
            model.addAttribute("flag", "请进行登录操作");
            return "login";
        }
        BlogAdmin user2 = (BlogAdmin) subject.getPrincipal();
        model.addAttribute("flag", "欢迎" + user2.getUsername() + "登陆成功");
        httpSession.setAttribute("admin", user2);
        return "index";
    }

    @RequestMapping("/admin/updatePassword")
    @ResponseBody
    public ResultBO updatePassword(String password,HttpSession session) {
        BlogAdmin user = (BlogAdmin) session.getAttribute("admin");
        ResultBO result = userService.updatePassword(user.getUsername(), password);
        return result;
    }

}
