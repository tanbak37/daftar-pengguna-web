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

import com.test.restservice.entity.User;
import com.test.restservice.entity.UserRole;
import com.test.restservice.entity.UserWebList;
import com.test.restservice.repository.UserWebRepository;

import javassist.tools.web.BadHttpRequest;



@RestController
@RequestMapping(path = "/web")
public class UserWebController {
	
	@Autowired
	private UserWebRepository repository;
	

	@GetMapping
	public Iterable<UserWebList> findAll() {
		return repository.findAll();
	}
	
	
	@PostMapping(consumes = "application/json")
	public UserWebList create(@RequestBody UserWebList userWebList) {
		return repository.save(userWebList);
	}

	@DeleteMapping(path = "/{idWeb}")
	public void delete(@PathVariable("idWeb") String idWeb) {
		repository.delete(idWeb);
	}
	
	
	@PutMapping(path = "/{idWeb}")
	public UserWebList update(@PathVariable("idWeb") String idWeb, @RequestBody UserWebList userWeb) throws BadHttpRequest {
		if (repository.exists(idWeb)) {
			userWeb.setIdWeb(idWeb);
			return repository.save(userWeb);
		} else {
			throw new BadHttpRequest();
		}
	}
	
	
}
