package lyh.blog.mapper;

import java.util.List;
import lyh.blog.pojo.BlogAdminFunction;
import lyh.blog.pojo.BlogAdminFunctionQuery;
import org.apache.ibatis.annotations.Param;

public interface BlogAdminFunctionMapper {
    long countByExample(BlogAdminFunctionQuery example);

    int deleteByExample(BlogAdminFunctionQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(BlogAdminFunction record);

    int insertSelective(BlogAdminFunction record);

    List<BlogAdminFunction> selectByExample(BlogAdminFunctionQuery example);

    BlogAdminFunction selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BlogAdminFunction record, @Param("example") BlogAdminFunctionQuery example);

    int updateByExample(@Param("record") BlogAdminFunction record, @Param("example") BlogAdminFunctionQuery example);

    int updateByPrimaryKeySelective(BlogAdminFunction record);

    int updateByPrimaryKey(BlogAdminFunction record);
}