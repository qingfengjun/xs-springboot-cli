package com.springboot.cli.service.impl;

import com.springboot.cli.dao.RoleActionRepository;
import com.springboot.cli.dao.RoleRepository;
import com.springboot.cli.pojo.Role;
import com.springboot.cli.pojo.RoleAction;
import com.springboot.cli.service.ifs.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private RoleActionRepository roleActionRepository;
    @Override
    public List<Role> getRoleList() {
        return roleRepository.findAll();
    }

    @Override
    public void saveRole(Role role) {
        roleRepository.save(role);
    }

    @Override
    public void saveRoleAction(RoleAction action) {
        roleActionRepository.save(action);
    }

    @Override
    public void delete(String id) {
        roleRepository.deleteById(id);
    }
    @Override
    public void deleteByRoleId(String roleId) {
        roleActionRepository.deleteByRoleId(roleId);
    }
}
