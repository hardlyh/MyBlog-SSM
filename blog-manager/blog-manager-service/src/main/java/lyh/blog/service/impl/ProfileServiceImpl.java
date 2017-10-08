package lyh.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lyh.blog.common.pojo.ResultBO;
import lyh.blog.mapper.BlogMyprofileMapper;
import lyh.blog.pojo.BlogMyprofile;
import lyh.blog.service.ProfileService;

/**
* @ClassName: ProfileServiceImpl
* @Description: 个人面板Service
* @author student.lyh
* @date 2017年10月5日 下午5:46:02
*/
@Service
public class ProfileServiceImpl implements ProfileService{
    
    @Autowired
    private BlogMyprofileMapper blogMyprofileMapper;

    /* 
     * 根据登陆人员id查询对应的信息
     */
    public BlogMyprofile getProfileById(Byte id) {
        BlogMyprofile profile = blogMyprofileMapper.selectByPrimaryKey(id);
        return profile;
    }
    
    /* 
     * 更新个人信息
     */
    public ResultBO updateProfile(BlogMyprofile blogMyprofile){
        
        try{
            blogMyprofileMapper.updateByPrimaryKeySelective(blogMyprofile);
            return ResultBO.ok();
        }catch (Exception e) {
            e.printStackTrace();
            return ResultBO.error(e.getMessage());
        }
        
        
    }
    
}
