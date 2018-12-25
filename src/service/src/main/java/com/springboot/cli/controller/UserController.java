package com.springboot.cli.controller;

import java.util.List;
import java.util.Map;

import com.springboot.cli.pojo.User;
import com.springboot.cli.pojo.UserModel;
import com.springboot.cli.pojo.UserRole;
import com.springboot.cli.service.ifs.UserService;
import com.springboot.cli.util.R;
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
    public R list() {
        List<User> users=userService.getUserList();
        return R.ok(users);
    }

    @RequestMapping("/add")
    public R add(@RequestBody User user) {
        userService.save(user);
        List<UserRole> userRoles=user.getUserRoles();
        for(UserRole userRole : userRoles) {
            userRole.setUserId(user.getId());
            userService.saveUserRole(userRole);
        }
        return R.ok();
    }

    @RequestMapping("/edit")
    public R edit(@RequestBody User user) {
        userService.deleteByUserId(user.getId());
       List<UserRole> userRoles=user.getUserRoles();
        for(UserRole userRole : userRoles) {
            userRole.setUserId(user.getId());
            userService.saveUserRole(userRole);
        }
        userService.edit(user);
        return R.ok();
    }


    @RequestMapping("/delete")
    public R delete(@RequestBody Map<String,String> paras) {
        String id=paras.get("id");
        logger.info(paras.get("id"));
        userService.delete(id);
        return R.ok();
    }
    @RequestMapping("/login")
    public R login(@RequestBody Map<String,String> paras) {
        String account=paras.get("username");
        String password=paras.get("password");
        return R.ok(userService.queryUserByLogin(account,password));
    }
}