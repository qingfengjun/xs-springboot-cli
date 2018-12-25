package com.springboot.cli.pojo;

import com.springboot.cli.pojo.base.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="cli_role")
public class Role extends BaseEntity  {
    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy="roleId",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    private List<RoleAction> roleActions=new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RoleAction> getRoleActions() {
        return roleActions;
    }

    public void setRoleActions(List<RoleAction> roleActions) {
        this.roleActions = roleActions;
    }
}
