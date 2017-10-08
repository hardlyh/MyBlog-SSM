package lyh.blog.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import lyh.blog.pojo.BlogAdmin;
import lyh.blog.service.UserService;

public class BOSRealm extends AuthorizingRealm{
    
    @Autowired
    private UserService userService;

    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
        return null;
    }

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
        UsernamePasswordToken passwordToken = (UsernamePasswordToken) arg0;
        String username = passwordToken.getUsername();
        System.out.println("info"+username);
        BlogAdmin user = userService.getByUsername(username);
        if (user == null) {
            return null;
        }
        AuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user, user.getPassword(), this.getName());
        return authenticationInfo;
    }

}
