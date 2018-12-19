package com.springboot.cli.service.impl;

import com.springboot.cli.dao.RoleActionRepository;
import com.springboot.cli.dao.UserRepository;
import com.springboot.cli.dao.UserRoleRepository;
import com.springboot.cli.pojo.User;
import com.springboot.cli.pojo.UserModel;
import com.springboot.cli.pojo.UserRole;
import com.springboot.cli.service.ifs.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserRoleRepository userRoleRepository;
    @Autowired
    private RoleActionRepository roleActionRepository;

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

    @Override
    public UserModel queryUserByLogin(String account, String password){
        UserModel user=new UserModel();
        List<User> users= userRepository.queryUserByLogin(account,password);
        if (users.size()>0){
            User userBase= users.get(0);
            user.setId(userBase.getId());
            user.setAccount(userBase.getAccount());
            user.setName(userBase.getName());
            user.setUserRoles(userBase.getUserRoles());
            user.setFace(userBase.getFace());
            user.setRoleActions(roleActionRepository.queryRoleActionByUser(user.getId()));
        }
        return  user;
    }
}
