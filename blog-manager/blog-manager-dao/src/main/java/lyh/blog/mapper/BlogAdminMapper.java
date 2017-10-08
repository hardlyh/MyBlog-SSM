package lyh.blog.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import lyh.blog.pojo.BlogAdmin;
import lyh.blog.pojo.BlogAdminQuery;

public interface BlogAdminMapper {
    long countByExample(BlogAdminQuery example);

    int deleteByExample(BlogAdminQuery example);

    int deleteByPrimaryKey(Byte id);

    int insert(BlogAdmin record);

    int insertSelective(BlogAdmin record);

    List<BlogAdmin> selectByExample(BlogAdminQuery example);

    BlogAdmin selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") BlogAdmin record, @Param("example") BlogAdminQuery example);

    int updateByExample(@Param("record") BlogAdmin record, @Param("example") BlogAdminQuery example);

    int updateByPrimaryKeySelective(BlogAdmin record);

    int updateByPrimaryKey(BlogAdmin record);
    
    void updatePasswordById(Map map);
}