package com.springboot.cli.controller;

import java.util.List;
import java.util.Map;

import com.springboot.cli.pojo.User;
import com.springboot.cli.pojo.UserModel;
import com.springboot.cli.pojo.UserRole;
import com.springboot.cli.service.ifs.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/api/user")
public class UserController {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Resource
    UserService userService;

    @RequestMapping("/list")
    public List<User> list() {
        List<User> users=userService.getUserList();
        return users;
    }

    @RequestMapping("/add")
    public String add(@RequestBody User user) {
        userService.save(user);
        List<UserRole> userRoles=user.getUserRoles();
        for(UserRole userRole : userRoles) {
            userRole.setUserId(user.getId());
            userService.saveUserRole(userRole);
        }
        return "success";
    }

    @RequestMapping("/edit")
    public String edit(@RequestBody User user) {
        userService.deleteByUserId(user.getId());
       List<UserRole> userRoles=user.getUserRoles();
        for(UserRole userRole : userRoles) {
            userRole.setUserId(user.getId());
            userService.saveUserRole(userRole);
        }
        userService.edit(user);
        return "success";
    }


    @RequestMapping("/delete")
    public String delete(@RequestBody Map<String,String> paras) {
        long id=Long.parseLong(paras.get("id"));
        logger.info(paras.get("id"));
        userService.delete(id);
        return "success";
    }
    @RequestMapping("/login")
    public UserModel login(@RequestBody Map<String,String> paras) {
        String account=paras.get("username");
        String password=paras.get("password");
        return userService.queryUserByLogin(account,password);
    }
}