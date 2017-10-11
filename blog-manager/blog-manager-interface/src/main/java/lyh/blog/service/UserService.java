package lyh.blog.service;

import lyh.blog.common.pojo.ResultBO;
import lyh.blog.pojo.BlogAdmin;

public interface UserService {
    
    BlogAdmin getByUsername(String username);
    ResultBO updatePassword(String username,String password);
   
}

