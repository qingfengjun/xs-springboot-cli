package com.springboot.cli.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="cli_role_action")
public class RoleAction implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private long roleId;
    @Column(nullable = false)
    private String actionName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }
}
