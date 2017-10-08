package lyh.blog.mapper;

import java.util.List;
import lyh.blog.pojo.BlogCategory;
import lyh.blog.pojo.BlogCategoryQuery;
import org.apache.ibatis.annotations.Param;

public interface BlogCategoryMapper {
    long countByExample(BlogCategoryQuery example);

    int deleteByExample(BlogCategoryQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(BlogCategory record);

    int insertSelective(BlogCategory record);

    List<BlogCategory> selectByExample(BlogCategoryQuery example);

    BlogCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BlogCategory record, @Param("example") BlogCategoryQuery example);

    int updateByExample(@Param("record") BlogCategory record, @Param("example") BlogCategoryQuery example);

    int updateByPrimaryKeySelective(BlogCategory record);

    int updateByPrimaryKey(BlogCategory record);
}