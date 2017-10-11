package lyh.blog.mapper;

import java.util.List;
import lyh.blog.pojo.BlogWebinformation;
import lyh.blog.pojo.BlogWebinformationQuery;
import org.apache.ibatis.annotations.Param;

public interface BlogWebinformationMapper {
    long countByExample(BlogWebinformationQuery example);

    int deleteByExample(BlogWebinformationQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(BlogWebinformation record);

    int insertSelective(BlogWebinformation record);

    List<BlogWebinformation> selectByExample(BlogWebinformationQuery example);

    BlogWebinformation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BlogWebinformation record, @Param("example") BlogWebinformationQuery example);

    int updateByExample(@Param("record") BlogWebinformation record, @Param("example") BlogWebinformationQuery example);

    int updateByPrimaryKeySelective(BlogWebinformation record);

    int updateByPrimaryKey(BlogWebinformation record);
}