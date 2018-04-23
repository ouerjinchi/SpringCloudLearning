package com.forezp.entity;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private Integer userId;

    public User() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public User(String name, Integer userId) {

        this.name = name;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
