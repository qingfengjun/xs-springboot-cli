package com.springboot.cli.service.ifs;

import com.springboot.cli.pojo.AccessLog;
import org.springframework.data.domain.Page;

import java.util.List;

public interface LogService  {
     void log(AccessLog log);
    Page<AccessLog> getAccessLogList(Integer page,Integer size);
}
