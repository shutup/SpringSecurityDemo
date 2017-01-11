package com.example.repo;

import com.example.model.SystemUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Tom on 12/22/16.
 */
public interface UserRepo extends JpaRepository<SystemUser,Long> {
    SystemUser findByUsername(String username);
}
