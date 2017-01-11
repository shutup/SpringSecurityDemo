package com.example.model;

import org.springframework.context.annotation.Primary;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

/**
 * Created by Tom on 12/22/16.
 */
@Entity
public class Role implements GrantedAuthority{
    private String role_name;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    protected Role(){

    }
    public Role(String role_name) {
        this.role_name = role_name;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getAuthority() {
        return role_name;
    }
}
