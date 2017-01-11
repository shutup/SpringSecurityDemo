package com.example.init;

import com.example.common.Constants;
import com.example.model.Role;
import com.example.model.SystemUser;
import com.example.repo.RoleRepo;
import com.example.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tom on 12/22/16.
 */
@Component
public class StartupRunner implements CommandLineRunner ,Constants{

    @Autowired
    RoleRepo roleRepo;
    @Autowired
    UserRepo userRepo;

    @Override
    public void run(String... args) throws Exception {
        //add roles

        Role role = new Role(Role_Administrator);
        Role role1 = new Role(Role_Club_Owner);
        Role role2 = new Role(Role_SalesMan);

        roleRepo.save(role);
        roleRepo.save(role1);
        roleRepo.save(role2);

        List<Role> roles = new ArrayList<>();
        roles.add(new Role(Role_Administrator));
        SystemUser systemUser = new SystemUser("admin","admin", roles);
        userRepo.save(systemUser);
        roles.clear();

        roles.add(new Role(Role_Club_Owner));
        systemUser = new SystemUser("club","club",roles);
        userRepo.save(systemUser);
        roles.clear();

        roles.add(new Role(Role_SalesMan));
        systemUser = new SystemUser("saler","saler",roles);
        userRepo.save(systemUser);
        roles.clear();

    }
}
