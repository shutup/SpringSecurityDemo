package com.example.controller;

import com.example.model.Role;
import com.example.repo.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tom on 12/22/16.
 */
@RestController
@RequestMapping(path = {"/role"})
public class RoleController {

    @Autowired
    RoleRepo roleRepo;

    @RequestMapping(method = RequestMethod.POST)
    public Role createRole(@RequestParam String role_name) {
        return roleRepo.save(new Role(role_name));
    }
}
