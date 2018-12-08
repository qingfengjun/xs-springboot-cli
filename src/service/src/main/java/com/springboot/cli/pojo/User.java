package com.springboot.cli.pojo;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="cli_user")
public class User implements Serializable {

    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false)
    private String account;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String password;
    private String mail;
    private String face;



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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}