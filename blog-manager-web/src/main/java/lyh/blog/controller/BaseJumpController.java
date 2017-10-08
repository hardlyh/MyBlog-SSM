package lyh.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BaseJumpController {
    
    @RequestMapping("/")
    public String toIndex()
    {
        return "index";
    }
    
    @RequestMapping("/admin/{page}.html")
    public String toIndex(@PathVariable String page)
    {
        return page;
    }
    
 

}
