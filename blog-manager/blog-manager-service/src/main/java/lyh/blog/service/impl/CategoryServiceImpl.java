package lyh.blog.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import lyh.blog.common.pojo.PaginatorResult;
import lyh.blog.common.pojo.ResultBO;
import lyh.blog.mapper.BlogCategoryMapper;
import lyh.blog.pojo.BlogCategory;
import lyh.blog.pojo.BlogCategoryQuery;
import lyh.blog.pojo.BlogCategoryQuery.Criteria;
import lyh.blog.service.CategoryService;

/**
 * @ClassName: CategoryServiceImpl
 * @Description: 标签Service
 * @author student.lyh
 * @date 2017年10月3日 上午1:03:01
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private BlogCategoryMapper blogCategoryMapper;

    /*
     * 根据父id查询对应的category
     */
    public List<BlogCategory> listByParentId(Integer parentId) {
        BlogCategoryQuery blogCategoryQuery = new BlogCategoryQuery();
        Criteria createCriteria = blogCategoryQuery.createCriteria();
        createCriteria.andParentIdEqualTo(parentId);
        List<BlogCategory> list = blogCategoryMapper.selectByExample(blogCategoryQuery);
        return list;
    }

    public List<BlogCategory> listAll() {
        BlogCategoryQuery blogCategoryQuery = new BlogCategoryQuery();
        Criteria createCriteria = blogCategoryQuery.createCriteria();
        List<BlogCategory> list = blogCategoryMapper.selectByExample(blogCategoryQuery);
        return list;
    }

    /*
     * 保存分类
     */
    public ResultBO saveCategory(BlogCategory blogCategory) {
        blogCategory.setGmtCreate(new Date());
        blogCategory.setGmtModified(new Date());
        blogCategory.setIsParent(blogCategory.getParentId() == 0 ? (byte) 1 : (byte) 0);
        try {
            blogCategoryMapper.insert(blogCategory);
            return ResultBO.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return ResultBO.error(e.getMessage());
        }

    }

    // PageHelper.startPage(page, rows);
    // TbItemExample example = new TbItemExample();
    // List<TbItem> list = ItemMapper.selectByExample(example);
    // PageInfo<TbItem> info = new PageInfo<TbItem>(list);
    // EasyUiGridResult easyUiGridResult = new EasyUiGridResult();
    // easyUiGridResult.setRows(list);
    // easyUiGridResult.setTotal(info.getTotal());
    // return easyUiGridResult;

    /*
     * 得到Category分页对象
     */
    public PaginatorResult listCategory(int page, int rows, int parentId) {
        PageHelper.startPage(page, rows);
        BlogCategoryQuery query = new BlogCategoryQuery();
        Criteria createCriteria = query.createCriteria();
        createCriteria.andParentIdEqualTo(parentId);
        List<BlogCategory> list = blogCategoryMapper.selectByExample(query);
        PageInfo<BlogCategory> info = new PageInfo<BlogCategory>(list);
        PaginatorResult result = new PaginatorResult();
        result.setTotal(info.getTotal());
        result.setRows(list);
        return result;
    }

    /*
     * 根据id返回查询对象
     */
    public ResultBO deleteCategory(Integer id) {
        try{
            BlogCategory catgory = blogCategoryMapper.selectByPrimaryKey(id);
            if(catgory.getIsParent() != 0){
                BlogCategoryQuery blogCategoryQuery = new BlogCategoryQuery();
                Criteria createCriteria = blogCategoryQuery.createCriteria();
                createCriteria.andParentIdEqualTo(id);
                blogCategoryMapper.deleteByExample(blogCategoryQuery);
            }
            blogCategoryMapper.deleteByPrimaryKey(id);
            return ResultBO.ok();
        }catch(Exception e){
            return ResultBO.error(e.getMessage());
        }
    }

    /* 
     * 更新操作
     */
    public ResultBO updateCategory(BlogCategory blogCategory) {
        try{
            blogCategory.setGmtModified(new Date());
            blogCategoryMapper.updateByPrimaryKeySelective(blogCategory);
            return ResultBO.ok();
        }catch (Exception e) {
            e.printStackTrace();
            return ResultBO.error(e.getMessage());
        }
    }

}
