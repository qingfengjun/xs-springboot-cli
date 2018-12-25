package com.springboot.cli.service.ifs;

import com.springboot.cli.pojo.Role;
import com.springboot.cli.pojo.RoleAction;

import java.util.List;

public interface RoleService {
     List<Role> getRoleList();
     void saveRole(Role role);
    void saveRoleAction(RoleAction action);
    void delete(String id);
    void deleteByRoleId(String roleId);
}
