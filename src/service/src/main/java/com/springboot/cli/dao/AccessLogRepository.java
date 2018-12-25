package com.springboot.cli.dao;

import com.springboot.cli.pojo.AccessLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccessLogRepository extends JpaRepository<AccessLog, String> {

}
