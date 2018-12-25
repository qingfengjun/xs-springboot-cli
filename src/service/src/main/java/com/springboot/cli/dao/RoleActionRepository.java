package com.springboot.cli.dao;

import com.springboot.cli.pojo.RoleAction;
import com.springboot.cli.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface RoleActionRepository extends JpaRepository<RoleAction, String> {
        @Transactional
        Long deleteByRoleId(String roleId);

        @Query(nativeQuery = true,value ="select ra.* from cli_user u\n" +
                "join cli_user_role ur on ur.user_id=u.id\n" +
                "join cli_role_action ra on ra.role_id=ur.role_id\n" +
                "where u.id=?1")
        List<RoleAction> queryRoleActionByUser( String userid);
}
