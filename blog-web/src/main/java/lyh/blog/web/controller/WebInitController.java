package lyh.blog.web.controller;

import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ServletContextAware;

import lyh.blog.pojo.BlogWebinformation;
import lyh.blog.service.ArticleService;
import lyh.blog.service.WebInfomationService;

@Controller
public class WebInitController implements ServletContextAware {
    @Autowired
    private ArticleService articleService;

    @Autowired
    private WebInfomationService infomationService;

    private ServletContext servletContext;

    @RequestMapping("/web/countWebView.do")
    @ResponseBody
    public void countWebView(HttpServletResponse response, HttpServletRequest request) {
        Integer total = (Integer) servletContext.getAttribute("totalView");
        Integer today = (Integer) servletContext.getAttribute("tadayView");
        if (total == null) {
            total = 1;
        }
        if (today == null) {
            today = 1;
        }
        if (total != null && today != null) {
            total++;
            today++;
        }
        System.out.println("total : " + total);
        System.out.println("today : " + today);
        servletContext.setAttribute("totalView", total);
        servletContext.setAttribute("tadayView", today);
    }

    public void saveWebView() {
        Long all = articleService.countAll();
        BlogWebinformation blogWebinformation = new BlogWebinformation();
        Integer total = (Integer) servletContext.getAttribute("totalView");
        Integer today = (Integer) servletContext.getAttribute("tadayView");
        blogWebinformation.setTime(new Date());
        blogWebinformation.setTodaycount(today);
        blogWebinformation.setTotalcount(total);
        blogWebinformation.setArticlecount(all.intValue());
        infomationService.insert(blogWebinformation);
        servletContext.setAttribute("tadayView", 0);
        System.out.println("定时调用 成功");
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }

}
