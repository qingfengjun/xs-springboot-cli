package com.springboot.cli.controller;

import com.springboot.cli.pojo.AccessLog;
import com.springboot.cli.pojo.Role;
import com.springboot.cli.pojo.RoleAction;
import com.springboot.cli.service.ifs.LogService;
import com.springboot.cli.util.R;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/common")
public class CommonController {
    @Resource
    LogService logService;

    @RequestMapping("/accessloglist")
    public R list(@RequestBody Map<String,String> paras) {
        Integer size=Integer.parseInt(paras.get("size"));
        Integer page=Integer.parseInt(paras.get("page"));
        Page<AccessLog> roles=logService.getAccessLogList(page,size);
        return R.ok(roles);
    }

    @RequestMapping("/log")
    public R add(@RequestBody AccessLog log) {
        logService.log(log);
        return R.ok();
    }
}
