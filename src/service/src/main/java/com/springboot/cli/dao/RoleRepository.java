package com.springboot.cli.dao;

import com.springboot.cli.pojo.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


public interface RoleRepository extends JpaRepository<Role, String> {
    @Transactional
    void deleteById(String id);
}
