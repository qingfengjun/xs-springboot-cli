package com.springboot.cli.pojo;

import com.springboot.cli.pojo.base.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="cli_role_action")
public class RoleAction extends BaseEntity {
    @Column(nullable = false)
    private String roleId;
    @Column(nullable = false)
    private String actionName;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }
}
