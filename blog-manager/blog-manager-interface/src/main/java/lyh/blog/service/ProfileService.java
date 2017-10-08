package lyh.blog.service;

import lyh.blog.common.pojo.ResultBO;
import lyh.blog.pojo.BlogMyprofile;

public interface ProfileService {
    BlogMyprofile getProfileById(Byte id);
    ResultBO updateProfile(BlogMyprofile blogMyprofile);
}
