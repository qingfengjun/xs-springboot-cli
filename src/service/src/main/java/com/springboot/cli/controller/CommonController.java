package com.springboot.cli.controller;

import com.springboot.cli.pojo.AccessLog;
import com.springboot.cli.pojo.Role;
import com.springboot.cli.pojo.RoleAction;
import com.springboot.cli.service.ifs.LogService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/common")
public class CommonController {
    @Resource
    LogService logService;

    @RequestMapping("/accessloglist")
    public List<AccessLog> list() {
        List<AccessLog> roles=logService.getAccessLogList();
        return roles;
    }

    @RequestMapping("/log")
    public String add(@RequestBody AccessLog log) {
        log.setLastUpdateTime(new Date());
        logService.log(log);
        return "success";
    }
}
