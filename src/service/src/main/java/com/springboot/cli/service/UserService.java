package com.springboot.cli.service;

import com.springboot.cli.pojo.User;
import com.springboot.cli.pojo.UserRole;

import java.util.List;

public interface UserService {
    List<User> getUserList();

    void save(User user);

    void edit(User user);

    void delete(long id);
    void deleteByUserId(long userId);
    void saveUserRole(UserRole userRole);
}
