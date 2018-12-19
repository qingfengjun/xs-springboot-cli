package com.springboot.cli.service.ifs;

import com.springboot.cli.pojo.AccessLog;

import java.util.List;

public interface LogService  {
     void log(AccessLog log);
    List<AccessLog> getAccessLogList();
}
