package lyh.blog.service;

import java.util.List;

import lyh.blog.common.pojo.ArticleDO;
import lyh.blog.common.pojo.PaginatorResult;
import lyh.blog.common.pojo.ResultBO;
import lyh.blog.pojo.BlogPage;

public interface ArticleService {
    ResultBO saveArticle(BlogPage blogPage, String content);

    PaginatorResult listAll(Integer page, Integer row);

    ArticleDO<BlogPage> toUpdate(Integer id);

    ResultBO updateArticle(BlogPage blogPage, String content);

    PaginatorResult listCategoryArticle(String categoryName, Integer page, Integer row);

    String listAllNotPaginator();

    void addPageview(Integer id);

    List<BlogPage> listRankByConutview();
    
    PaginatorResult listPrivate(Integer page, Integer row);
    
    Long countAll();
    
    Long countPrivate();

}
