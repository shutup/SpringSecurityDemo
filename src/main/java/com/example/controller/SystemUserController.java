package com.example.controller;

import com.example.common.Constants;
import com.example.model.SystemUser;
import com.example.model.SystemUserRequest;
import com.example.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

/**
 * Created by Tom on 12/22/16.
 */
@RestController
@RequestMapping(path = {"/system_user"})
public class SystemUserController implements Constants{

    @Autowired
    UserRepo userRepo;

    @RolesAllowed({Role_Administrator})
    @RequestMapping(method = RequestMethod.POST)
    public SystemUser createClubUser(@RequestBody SystemUserRequest systemUserRequest) {
        SystemUser systemUser = new SystemUser(systemUserRequest.getUsername(),systemUserRequest.getPassword(),systemUserRequest.getRoles());
        return userRepo.save(systemUser);
    }


}
