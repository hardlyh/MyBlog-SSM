package lyh.blog.service;

import java.util.Date;
import java.util.List;

import lyh.blog.pojo.BlogWebinformation;

public interface WebInfomationService {

    void insert(BlogWebinformation blogWebinformation);

    BlogWebinformation getInfoByDate(Date date);

    List<BlogWebinformation> getLastFiveView(Date begin, Date end);

}
