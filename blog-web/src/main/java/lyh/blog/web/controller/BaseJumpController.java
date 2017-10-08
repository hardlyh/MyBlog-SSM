package lyh.blog.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @ClassName: BaseJumpController
* @Description: 基本跳转页面Controller
* @author student.lyh
* @date 2017年10月6日 上午11:59:16
*/
@Controller
public class BaseJumpController {
    
    @RequestMapping("/{page}.html")
    public String jump(@PathVariable String page){
        return page;
    }

}
