package com.springboot.cli.service;

import com.springboot.cli.dao.UserRepository;
import com.springboot.cli.dao.UserRoleRepository;
import com.springboot.cli.pojo.RoleAction;
import com.springboot.cli.pojo.User;
import com.springboot.cli.pojo.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserRoleRepository userRoleRepository;

    @Override
    public List<User> getUserList() {
        return userRepository.findAll();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void edit(User user) {
        userRepository.save(user);
    }

    @Override
    public void delete(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void deleteByUserId(long userId) {
        userRoleRepository.deleteByUserId(userId);
    }

    @Override
    public void saveUserRole(UserRole userRole) {
        userRoleRepository.save(userRole);
    }
}
