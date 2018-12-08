package com.springboot.cli.dao;

import com.springboot.cli.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface UserRepository extends JpaRepository<User, Integer>{
    User findById(long id);
    @Transactional
    Long deleteById(Long id);
}