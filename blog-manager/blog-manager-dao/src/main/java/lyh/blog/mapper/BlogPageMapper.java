package lyh.blog.mapper;

import java.util.List;
import lyh.blog.pojo.BlogPage;
import lyh.blog.pojo.BlogPageQuery;
import org.apache.ibatis.annotations.Param;

public interface BlogPageMapper {
    long countByExample(BlogPageQuery example);

    int deleteByExample(BlogPageQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(BlogPage record);

    int insertSelective(BlogPage record);

    List<BlogPage> selectByExample(BlogPageQuery example);

    BlogPage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BlogPage record, @Param("example") BlogPageQuery example);

    int updateByExample(@Param("record") BlogPage record, @Param("example") BlogPageQuery example);

    int updateByPrimaryKeySelective(BlogPage record);

    int updateByPrimaryKey(BlogPage record);
    
    List<BlogPage> selectByCountview();
}