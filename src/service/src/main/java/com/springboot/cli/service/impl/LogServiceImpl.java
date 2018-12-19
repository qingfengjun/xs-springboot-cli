package com.springboot.cli.service.impl;

import com.springboot.cli.dao.AccessLogRepository;
import com.springboot.cli.pojo.AccessLog;
import com.springboot.cli.pojo.Role;
import com.springboot.cli.service.ifs.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogServiceImpl  implements LogService {
    @Autowired
    private AccessLogRepository accessLogRepository;

    @Override
    public void log(AccessLog log) {
        accessLogRepository.save(log);
    }
    @Override
    public List<AccessLog> getAccessLogList() {
        return accessLogRepository.findAll();
    }
}
