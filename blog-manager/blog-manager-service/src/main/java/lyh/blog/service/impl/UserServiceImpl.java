package lyh.blog.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lyh.blog.common.pojo.ResultBO;
import lyh.blog.mapper.BlogAdminMapper;
import lyh.blog.pojo.BlogAdmin;
import lyh.blog.pojo.BlogAdminQuery;
import lyh.blog.pojo.BlogAdminQuery.Criteria;
import lyh.blog.service.UserService;

/**
* @ClassName: UserServiceImpl
* @Description: 用户Service
* @author student.lyh
* @date 2017年10月6日 上午9:50:30
*/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private BlogAdminMapper adminMapper;
    
    /* 
     * 通过username查找对象
     */
    public BlogAdmin getByUsername(String username) {
        BlogAdminQuery adminQuery = new BlogAdminQuery();
        Criteria createCriteria = adminQuery.createCriteria();
        Criteria user = createCriteria.andUsernameEqualTo(username);
        List<BlogAdmin> list = adminMapper.selectByExample(adminQuery);
        if(list.size()==1){
            return list.get(0);
        }
        return null;
    }

    /* 
     * 更新密码
     */
    public ResultBO updatePassword(String username, String password) {
        try{
            System.out.println("user"+username+"pa"+password);
            Map map = new HashMap(); 
            map.put("username", username);
            map.put("password", password);
            adminMapper.updatePasswordById(map);
            return ResultBO.ok();
        }catch (Exception e) {
            e.printStackTrace();
            return ResultBO.error(e.getMessage());
        }
    }

}
