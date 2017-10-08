package lyh.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.rpc.Result;

import lyh.blog.common.pojo.PaginatorResult;
import lyh.blog.common.pojo.ResultBO;
import lyh.blog.pojo.BlogCategory;
import lyh.blog.service.CategoryService;

/**
 * @ClassName: CategoryController
 * @Description: 文章类别Controller
 * @author student.lyh
 * @date 2017年10月3日 上午1:09:17
 */
@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * @Description: 查询是父类的category
     * @return List<BlogCategory> 返回类型
     */
    @RequestMapping("/admin/listIsParent")
    @ResponseBody
    public List<BlogCategory> listIsParent() {
        return categoryService.listByParentId(0);
    }

    /**
     * @Description: 保存category
     * @return ResultBO 返回类型
     */
    @RequestMapping("/admin/saveCategory")
    @ResponseBody
    public ResultBO saveCategory(BlogCategory blogCategory) {
        return categoryService.saveCategory(blogCategory);
    }

    /**
     * @Description:     返回分页完成后的List<category>
     * @return PaginatorResult 返回类型
     */
    @RequestMapping("/admin/AllCategory")
    @ResponseBody
    public PaginatorResult listAllCategory(int row, int page, int parentId) {
        return categoryService.listCategory(page, row, parentId);
    }
   
    @RequestMapping("/ admin/deleteCategory")
    @ResponseBody
    public ResultBO deleteCategory(Integer id){
        if(id!=null){
            return categoryService.deleteCategory(id);
        }
        return ResultBO.error(null);
    }
  
    /**
    * @Description: 更新Catgory
    * @return ResultBO    返回类型
     */
    @RequestMapping("/admin/updateCategory")
    @ResponseBody
    public ResultBO updateCategory(BlogCategory blogCategory){
        System.out.println(blogCategory);
        return categoryService.updateCategory(blogCategory);
    }
    
    @RequestMapping("/admin/listAllCategory")
    @ResponseBody
    public List<BlogCategory> listAll(){
        return categoryService.listAll();
    }

}
