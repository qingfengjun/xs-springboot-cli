package com.springboot.cli.pojo;

        import javax.persistence.*;
        import java.io.Serializable;

@Entity
@Table(name="cli_user_role")
public class UserRole implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private long roleId;
    private long userId;
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


    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
