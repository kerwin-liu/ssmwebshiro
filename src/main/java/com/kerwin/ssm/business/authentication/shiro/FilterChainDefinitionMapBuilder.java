package com.kerwin.ssm.business.authentication.shiro;


import com.kerwin.ssm.business.management.model.Permission;
import com.kerwin.ssm.business.management.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/11/1.
 */
public class FilterChainDefinitionMapBuilder {
    @Autowired
    private PermissionService permissionService;
    private static final String ANON = "anon";
    private static final String AUTHC = "authc";
    private static final String ROLE = "roles";
    private static final String PERMS = "perms";
    public LinkedHashMap<String, String> buildFilterChainDefinitionMap() {
        LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
        List<Permission> authorities = permissionService.selectPermissionAll();
        for (Permission authority : authorities) {
            if (ANON.equals(authority.getAuthorityType())) {
                map.put(authority.getUrl(), ANON);
            } else if (AUTHC.equals(authority.getAuthorityType())) {
                map.put(authority.getUrl(), AUTHC);
            } else if (ROLE.equals(authority.getAuthorityType())) {
                map.put(authority.getUrl(), ROLE+"[" + authority.getAuthorityKey() + "]");
            }else if (PERMS.equals(authority.getAuthorityType())) {
                map.put(authority.getUrl(), PERMS+"[" + authority.getAuthorityKey() + "]");
            }
        }
        return map;

    }
}
