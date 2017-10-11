package lyh.blog.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lyh.blog.pojo.BlogWebinformation;
import lyh.blog.service.ArticleService;
import lyh.blog.service.WebInfomationService;
import lyh.blog.util.ConverseTime;
import lyh.blog.util.JsonUtils;

@Controller
public class BaseJumpController {

    @Autowired
    private WebInfomationService webInfomationService;

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/")
    public String toIndex(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Long privates = articleService.countPrivate();
        BlogWebinformation infor = webInfomationService.getInfoByDate(new Date());
        System.out.println("infor : " + infor);
        session.setAttribute("infor", infor);
        session.setAttribute("privates", privates);
        return "index";
    }

    @RequestMapping("/admin/indexInfor")
    @ResponseBody
    public Map<String, List> lastFiveView() {
        List<String> time = new ArrayList<String>();
        List<Integer> amount = new ArrayList<Integer>();
        List<BlogWebinformation> fiveList = webInfomationService.getLastFiveView(ConverseTime.getLastFiveDay(),
                new Date());
        System.out.println("conver "+ConverseTime.getLastFiveDay());
        for (BlogWebinformation infor : fiveList) {
            time.add(ConverseTime.dateToString(infor.getTime()));
            amount.add(infor.getTodaycount());
        }
        Map<String,List> map = new HashMap<String, List>();
        map.put("time", time);
        map.put("amount", amount);
        return map;
    }

    @RequestMapping("/admin/{page}.html")
    public String toIndex(@PathVariable String page) {
        return page;
    }

}
