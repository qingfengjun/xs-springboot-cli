package com.springboot.cli.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserModel extends User {
    //用户角色
    private List<RoleAction> roleActions=new ArrayList<>();
    public List<RoleAction> getRoleActions() {
        return roleActions;
    }

    public void setRoleActions(List<RoleAction> roleActions) {
        this.roleActions = roleActions;
    }
}
