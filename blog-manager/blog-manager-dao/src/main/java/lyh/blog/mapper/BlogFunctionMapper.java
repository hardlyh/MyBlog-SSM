package lyh.blog.mapper;

import java.util.List;
import lyh.blog.pojo.BlogFunction;
import lyh.blog.pojo.BlogFunctionQuery;
import org.apache.ibatis.annotations.Param;

public interface BlogFunctionMapper {
    long countByExample(BlogFunctionQuery example);

    int deleteByExample(BlogFunctionQuery example);

    int deleteByPrimaryKey(Short id);

    int insert(BlogFunction record);

    int insertSelective(BlogFunction record);

    List<BlogFunction> selectByExample(BlogFunctionQuery example);

    BlogFunction selectByPrimaryKey(Short id);

    int updateByExampleSelective(@Param("record") BlogFunction record, @Param("example") BlogFunctionQuery example);

    int updateByExample(@Param("record") BlogFunction record, @Param("example") BlogFunctionQuery example);

    int updateByPrimaryKeySelective(BlogFunction record);

    int updateByPrimaryKey(BlogFunction record);
}