package lyh.blog.mapper;

import java.util.List;
import lyh.blog.pojo.BlogMyprofile;
import lyh.blog.pojo.BlogMyprofileQuery;
import org.apache.ibatis.annotations.Param;

public interface BlogMyprofileMapper {
    long countByExample(BlogMyprofileQuery example);

    int deleteByExample(BlogMyprofileQuery example);

    int deleteByPrimaryKey(Byte id);

    int insert(BlogMyprofile record);

    int insertSelective(BlogMyprofile record);

    List<BlogMyprofile> selectByExample(BlogMyprofileQuery example);

    BlogMyprofile selectByPrimaryKey(Byte id);

    int updateByExampleSelective(@Param("record") BlogMyprofile record, @Param("example") BlogMyprofileQuery example);

    int updateByExample(@Param("record") BlogMyprofile record, @Param("example") BlogMyprofileQuery example);

    int updateByPrimaryKeySelective(BlogMyprofile record);

    int updateByPrimaryKey(BlogMyprofile record);
}