package com.springboot.cli.service.ifs;

import com.springboot.cli.pojo.User;
import com.springboot.cli.pojo.UserModel;
import com.springboot.cli.pojo.UserRole;

import java.util.List;

public interface UserService {
    List<User> getUserList();

    void save(User user);

    void edit(User user);

    void delete(long id);
    void deleteByUserId(long userId);
    void saveUserRole(UserRole userRole);
    UserModel queryUserByLogin(String account, String password);
}
