package com.springboot.cli.controller;

import com.springboot.cli.pojo.Role;
import com.springboot.cli.pojo.RoleAction;
import com.springboot.cli.pojo.User;
import com.springboot.cli.service.RoleService;
import com.springboot.cli.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/role")
public class RoleController {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Resource
    RoleService roleService;

    @RequestMapping("/list")
    public List<Role> list() {
        List<Role> roles=roleService.getRoleList();
        return roles;
    }

    @RequestMapping("/add")
    public Role add(@RequestBody Role role) {
        roleService.saveRole(role);
        List<RoleAction> roleActionsrole=role.getRoleActions();
        for(RoleAction roleActionsrol : roleActionsrole) {
            roleActionsrol.setRoleId(role.getId());
            roleService.saveRoleAction(roleActionsrol);
        }
        return role;
    }

    @RequestMapping("/edit")
    public String edit(@RequestBody Role role) {

        roleService.deleteByRoleId(role.getId());
        List<RoleAction> roleActionsrole=role.getRoleActions();
        for(RoleAction roleActionsrol : roleActionsrole) {
            roleActionsrol.setRoleId(role.getId());
            roleService.saveRoleAction(roleActionsrol);
        }
        roleService.saveRole(role);
        return "success";
    }
    @RequestMapping("/delete")
    public String delete(@RequestBody Map<String,String> paras) {
        long id=Long.parseLong(paras.get("id"));
        logger.info(paras.get("id"));
        roleService.delete(id);
        roleService.deleteByRoleId(id);
        return "success";
    }
}
