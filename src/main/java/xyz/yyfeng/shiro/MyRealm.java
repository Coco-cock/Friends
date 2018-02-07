package xyz.yyfeng.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;

import org.apache.shiro.subject.PrincipalCollection;
import xyz.yyfeng.mapper.Realm.MyRealmMapper;
import xyz.yyfeng.po.User;

import javax.annotation.Resource;


public class MyRealm extends AuthorizingRealm {
    @Resource
    private MyRealmMapper myRealmMapper;

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        String username = (String) token.getPrincipal();
        User user = myRealmMapper.findUserByUsername(username);
        if (user == null) {
            if(user == null) {
                throw new UnknownAccountException();
            }
        }
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                user.getName(), //用户名
                user.getPasswd(),
                getName()  //realm name
        );

        return authenticationInfo;
    }
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }


}

