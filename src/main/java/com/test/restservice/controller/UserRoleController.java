package com.test.restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.restservice.entity.UserRole;
import com.test.restservice.repository.UserRoleRepository;

import javassist.tools.web.BadHttpRequest;



@RestController
@RequestMapping(path = "/roles")
public class UserRoleController {
	
	@Autowired
	private UserRoleRepository repository;
	

	@GetMapping
	public Iterable<UserRole> findAll() {
		return repository.findAll();
	}
	
	
	@PostMapping(consumes = "application/json")
	public UserRole create(@RequestBody UserRole userRole) {
		return repository.save(userRole);
	}
	
}
