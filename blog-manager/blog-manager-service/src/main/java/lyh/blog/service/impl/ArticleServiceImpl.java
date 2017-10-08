package lyh.blog.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import lyh.blog.common.pojo.ArticleDO;
import lyh.blog.common.pojo.PaginatorResult;
import lyh.blog.common.pojo.ResultBO;
import lyh.blog.mapper.BlogPageContentMapper;
import lyh.blog.mapper.BlogPageMapper;
import lyh.blog.pojo.BlogPage;
import lyh.blog.pojo.BlogPageContent;
import lyh.blog.pojo.BlogPageQuery;
import lyh.blog.pojo.BlogPageQuery.Criteria;
import lyh.blog.service.ArticleService;
import lyh.blog.service.redis.JedisClient;
import lyh.blog.util.JsonUtils;
import lyh.blog.util.StrUtlis;

/**
 * @ClassName: ArticleServiceImpl
 * @Description: 文章操作Service
 * @author student.lyh
 * @date 2017年10月2日 下午9:50:13
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private BlogPageMapper blogPageMapper;

    @Autowired
    private BlogPageContentMapper blogPageContentMapper;

    @Autowired
    private JedisClient jedisClient;

    @Value("${pagelist}")
    private String PAGE_LIST;   // redis 分页缓存key
    
    @Value("${categorypage}")
    private String CATEGORY_ARTICLE;  // redis 分类文章缓存
    
    @Value("${categorypage}")
    private String ALL_ARITICLE;  // 全部文章缓存

    /*
     * 保存文章,返回insert后id
     */
    public ResultBO saveArticle(BlogPage blogPage, String content) {
        try {
            jedisClient.del(PAGE_LIST);
            jedisClient.del(CATEGORY_ARTICLE);
            jedisClient.del(ALL_ARITICLE);
            blogPage.setPageDescription(StrUtlis.substringByContent(content));
            blogPageMapper.insert(blogPage);
            BlogPageContent blogPageContent = new BlogPageContent();
            blogPageContent.setId(blogPage.getId());
            blogPageContent.setPageContent(content.trim());
            blogPageContentMapper.insert(blogPageContent);
            return ResultBO.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return ResultBO.error(e.getMessage());
        }
    }

    /*
     * 得到文章的分页对象
     */
    public PaginatorResult listAll(Integer page, Integer row) {
        // 查看redis中是否有对应的key
        try {
            String json = jedisClient.hget(PAGE_LIST, page + ":" + row);
            if (StringUtils.isNotBlank(json)) {
                // 把json转换成list
                PaginatorResult pojo = JsonUtils.jsonToPojo(json, PaginatorResult.class);
                System.out.println("redis");
                return pojo;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        PageHelper.startPage(page, row);
        BlogPageQuery blogPageQuery = new BlogPageQuery();
        blogPageQuery.setOrderByClause("id desc");
        Criteria createCriteria = blogPageQuery.createCriteria();
        List<BlogPage> list = blogPageMapper.selectByExample(blogPageQuery);
        PageInfo<BlogPage> info = new PageInfo<BlogPage>(list);
        PaginatorResult result = new PaginatorResult();
        result.setTotal(info.getTotal());
        result.setRows(list);
        try {
            jedisClient.hset(PAGE_LIST, page + ":" + row, JsonUtils.objectToJson(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /* 
     * 根据id查找文章信息
     */
    public ArticleDO<BlogPage> toUpdate(Integer id) {
        BlogPage article = blogPageMapper.selectByPrimaryKey(id);
        BlogPageContent content = blogPageContentMapper.selectByPrimaryKey(id);
        System.out.println(article + "ar");
        System.out.println(content + "co");
        ArticleDO articleDO = new ArticleDO<BlogPage>();
        articleDO.setObj(article);
        articleDO.setMessage(content.getPageContent());
        return articleDO;
    }

    public ResultBO updateArticle(BlogPage blogPage, String content) {
        try {
            jedisClient.del(PAGE_LIST);
            jedisClient.del(CATEGORY_ARTICLE);
            jedisClient.del(ALL_ARITICLE);
            blogPage.setPageDescription(StrUtlis.substringByContent(content));
            blogPageMapper.updateByPrimaryKeySelective(blogPage);
            BlogPageContent blogPageContent = new BlogPageContent();
            blogPageContent.setId(blogPage.getId());
            blogPageContent.setPageContent(content);
            blogPageContentMapper.updateByPrimaryKeyWithBLOBs(blogPageContent);
            return ResultBO.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return ResultBO.error(e.getMessage());
        }
    }

    /* 
     * 根据分页对象返回
     */
    public PaginatorResult listCategoryArticle(String categoryName,Integer page,Integer row) {
        try {
            String json = jedisClient.hget(CATEGORY_ARTICLE, categoryName+page+row);
            if (StringUtils.isNotBlank(json)) {
                // 把json转换成list
                PaginatorResult pojo = JsonUtils.jsonToPojo(json, PaginatorResult.class);
                return pojo;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        PageHelper.startPage(page, row);
        BlogPageQuery blogPageQuery = new BlogPageQuery();
        blogPageQuery.setOrderByClause("id desc");
        Criteria createCriteria = blogPageQuery.createCriteria();
        createCriteria.andPageTagEqualTo(categoryName);
        List<BlogPage> list = blogPageMapper.selectByExample(blogPageQuery);
        PageInfo<BlogPage> info = new PageInfo<BlogPage>(list);
        PaginatorResult result = new PaginatorResult();
        result.setTotal(info.getTotal());
        result.setRows(list);
        try {
            jedisClient.hset(CATEGORY_ARTICLE, categoryName+page+row , JsonUtils.objectToJson(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /* 
     * 获取全部文章,没有分页
     */
    public String listAllNotPaginator() {
        try {
            String json = jedisClient.hget(ALL_ARITICLE, "all");
            if (StringUtils.isNotBlank(json)) {
                return json;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        BlogPageQuery blogPageQuery = new BlogPageQuery();
        blogPageQuery.createCriteria();
        List<BlogPage> list = blogPageMapper.selectByExample(blogPageQuery);
        String str = JsonUtils.objectToJson(list);
        try {
            jedisClient.hset(ALL_ARITICLE, "all" , str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }
    
    
}
