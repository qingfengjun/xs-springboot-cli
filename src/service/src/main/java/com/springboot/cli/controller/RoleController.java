package com.springboot.cli.controller;

import com.springboot.cli.pojo.Role;
import com.springboot.cli.pojo.RoleAction;
import com.springboot.cli.service.ifs.RoleService;
import com.springboot.cli.util.R;
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
    public R list() {
        List<Role> roles=roleService.getRoleList();
        return R.ok(roles);
    }

    @RequestMapping("/add")
    public R add(@RequestBody Role role) {
        roleService.saveRole(role);
        List<RoleAction> roleActionsrole=role.getRoleActions();
        for(RoleAction roleActionsrol : roleActionsrole) {
            roleActionsrol.setRoleId(role.getId());
            roleService.saveRoleAction(roleActionsrol);
        }
        return R.ok(role);
    }

    @RequestMapping("/edit")
    public R edit(@RequestBody Role role) {
        roleService.deleteByRoleId(role.getId());
        List<RoleAction> roleActionsrole=role.getRoleActions();
        for(RoleAction roleActionsrol : roleActionsrole) {
            roleActionsrol.setRoleId(role.getId());
            roleService.saveRoleAction(roleActionsrol);
        }
        roleService.saveRole(role);
        return R.ok();
    }
    @RequestMapping("/delete")
    public R delete(@RequestBody Map<String,String> paras) {
        String id=paras.get("id").toString();
        logger.info(paras.get("id"));
        roleService.delete(id);
        roleService.deleteByRoleId(id);
        return R.ok();
    }
}
