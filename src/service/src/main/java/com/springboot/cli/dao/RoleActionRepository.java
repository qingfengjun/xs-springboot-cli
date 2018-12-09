package com.springboot.cli.dao;

import com.springboot.cli.pojo.RoleAction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


public interface RoleActionRepository extends JpaRepository<RoleAction, Integer> {
        @Transactional
        Long deleteByRoleId(Long roleId);
}
