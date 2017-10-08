package lyh.blog.service;

import java.util.List;

import lyh.blog.common.pojo.PaginatorResult;
import lyh.blog.common.pojo.ResultBO;
import lyh.blog.pojo.BlogCategory;

public interface CategoryService {
    List<BlogCategory> listByParentId(Integer parentId);
    List<BlogCategory> listAll();
    ResultBO saveCategory(BlogCategory blogCategory);
    PaginatorResult listCategory(int page,int rows,int parentId);
    ResultBO deleteCategory(Integer id);
    ResultBO updateCategory(BlogCategory blogCategory);
}
