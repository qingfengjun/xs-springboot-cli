package com.springboot.cli.pojo;

import com.springboot.cli.pojo.base.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="cli_user")
public class User extends BaseEntity {

    @Column(nullable = false)
    private String account;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String password;
    private String mail;
    private String face;
    @OneToMany(mappedBy="userId",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    private List<UserRole> userRoles=new ArrayList<>();



    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }


    public List<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<UserRole> userRoles) {
        this.userRoles = userRoles;
    }
}