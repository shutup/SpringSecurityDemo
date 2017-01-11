package com.example.security;

import com.example.model.SystemUser;
import com.example.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by Tom on 12/22/16.
 */
@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SystemUser user = userRepo.findByUsername(username);
        if (user != null) {
            return new User(user.getUsername(),user.getPassword(),user.getRoles());
        }else {
            throw new UsernameNotFoundException("user select failed");
        }
    }
}
