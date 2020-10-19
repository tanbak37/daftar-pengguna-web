package com.test.restservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.test.restservice.entity.UserRole;

@RestResource(exported = false)
public interface UserRoleRepository extends JpaRepository<UserRole, String>{

	

	
}
