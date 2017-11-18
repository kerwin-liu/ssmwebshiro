package com.kerwin.ssm.business.authentication.shiro;

import com.kerwin.ssm.business.management.model.AuthUser;
import com.kerwin.ssm.business.management.service.AuthUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2017/10/27.
 */
public class MyRealm extends AuthorizingRealm {
    @Autowired
    private AuthUserService authUserService;

    //授权方式
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        AuthUser user = (AuthUser) getAvailablePrincipal(principals);
        //TODO 通过用户名获得用户的所有资源，并把资源存入info中
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        Set<String> set = new HashSet<String>();
        set.add("user_save");
        info.setStringPermissions(set);
        return info;
    }

    //认证方式
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
        AuthUser user = authUserService.getAuthUserByName(usernamePasswordToken.getUsername());
        if (user == null) {
            throw new UnknownAccountException("用户名:" + usernamePasswordToken.getUsername() + "不存在");
        }
        Object principal = user;
        Object hashedCredentials = user.getPassword();
        String realmName = getName();
        return new SimpleAuthenticationInfo(principal, hashedCredentials, realmName);
    }
}
