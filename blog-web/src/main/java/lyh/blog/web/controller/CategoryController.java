package lyh.blog.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lyh.blog.pojo.BlogCategory;
import lyh.blog.service.CategoryService;

/**
* @ClassName: CategoryController
* @Description: 
* @author student.lyh
* @date 2017年10月7日 上午11:37:42
*/
@Controller
public class CategoryController {
    
    @Autowired
    private CategoryService categoryService;
    
    @RequestMapping("/web/listAllCategory.do")
    @ResponseBody
    public List<BlogCategory> listAllCategory(){
        List<BlogCategory> list = categoryService.listAll();
        return list;
    }

}
