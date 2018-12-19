package com.springboot.cli.dao;

import com.springboot.cli.pojo.AccessLog;
import com.springboot.cli.pojo.RoleAction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface AccessLogRepository extends JpaRepository<AccessLog, Integer> {

}
