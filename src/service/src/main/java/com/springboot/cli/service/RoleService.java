package com.springboot.cli.service;

import com.springboot.cli.pojo.Role;
import com.springboot.cli.pojo.RoleAction;

import java.util.List;

public interface RoleService {
     List<Role> getRoleList();
     void saveRole(Role role);
    void saveRoleAction(RoleAction action);
    void delete(long id);
    void deleteByRoleId(long roleId);
}
