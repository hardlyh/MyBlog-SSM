package lyh.blog.mapper;

import java.util.List;
import lyh.blog.pojo.BlogPageContent;
import lyh.blog.pojo.BlogPageContentQuery;
import org.apache.ibatis.annotations.Param;

public interface BlogPageContentMapper {
    long countByExample(BlogPageContentQuery example);

    int deleteByExample(BlogPageContentQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(BlogPageContent record);

    int insertSelective(BlogPageContent record);

    List<BlogPageContent> selectByExampleWithBLOBs(BlogPageContentQuery example);

    List<BlogPageContent> selectByExample(BlogPageContentQuery example);

    BlogPageContent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BlogPageContent record, @Param("example") BlogPageContentQuery example);

    int updateByExampleWithBLOBs(@Param("record") BlogPageContent record, @Param("example") BlogPageContentQuery example);

    int updateByExample(@Param("record") BlogPageContent record, @Param("example") BlogPageContentQuery example);

    int updateByPrimaryKeySelective(BlogPageContent record);

    int updateByPrimaryKeyWithBLOBs(BlogPageContent record);
}