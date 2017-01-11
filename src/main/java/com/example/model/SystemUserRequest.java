package com.example.model;

import java.util.List;

/**
 * Created by Tom on 12/22/16.
 */
public class SystemUserRequest {
    private String username;
    private String password;
    private List<Role> roles;

    protected SystemUserRequest() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
