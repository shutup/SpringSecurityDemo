package com.example.repo;

import com.example.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Tom on 12/22/16.
 */
public interface RoleRepo extends JpaRepository <Role,Long>{
}
