package com.springboot.cli.dao;

import com.springboot.cli.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String>{
    @Transactional
    void deleteById(String id);

    @Query(nativeQuery = true,value ="select p.* from cli_user p where p.account=?1 and p.password=?2")
    List<User> queryUserByLogin(String account, String password);

}