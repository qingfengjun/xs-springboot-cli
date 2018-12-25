package com.springboot.cli.pojo;

        import com.springboot.cli.pojo.base.BaseEntity;

        import javax.persistence.*;
        import java.io.Serializable;

@Entity
@Table(name="cli_user_role")
public class UserRole extends BaseEntity {

    private String roleId;
    private String userId;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
