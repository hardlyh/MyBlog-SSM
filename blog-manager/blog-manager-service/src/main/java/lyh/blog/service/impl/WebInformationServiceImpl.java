package lyh.blog.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lyh.blog.mapper.BlogWebinformationMapper;
import lyh.blog.pojo.BlogWebinformation;
import lyh.blog.pojo.BlogWebinformationQuery;
import lyh.blog.pojo.BlogWebinformationQuery.Criteria;
import lyh.blog.service.WebInfomationService;
import lyh.blog.util.ConverseTime;

@Service
public class WebInformationServiceImpl implements WebInfomationService {

    @Autowired
    private BlogWebinformationMapper mapper;

    /*
     * 保存一条数据
     */
    public void insert(BlogWebinformation blogWebinformation) {
        mapper.insert(blogWebinformation);
    }

    /* 
     * 根据日期查询BlogWebinformation
     */
    public BlogWebinformation getInfoByDate(Date date) {
        BlogWebinformationQuery blogWebinformationQuery = new BlogWebinformationQuery();
        Criteria createCriteria = blogWebinformationQuery.createCriteria();
        createCriteria.andTimeEqualTo(new Date());
        List<BlogWebinformation> list = mapper.selectByExample(blogWebinformationQuery);
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    /* 
     * 根据begin-end查询数据
     */
    public List<BlogWebinformation> getLastFiveView(Date begin, Date end) {
        System.out.println("end : "+end);
        System.out.println("begin : "+begin);
        BlogWebinformationQuery query = new BlogWebinformationQuery();
        Criteria createCriteria = query.createCriteria();
        createCriteria.andTimeBetween(begin,end);
        List<BlogWebinformation> list = mapper.selectByExample(query);
        return list;
    }
    
   

}
