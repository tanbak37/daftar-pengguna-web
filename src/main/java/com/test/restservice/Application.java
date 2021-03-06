package com.test.restservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.google.common.util.concurrent.Service.State;
import com.test.restservice.entity.User;
import com.test.restservice.repository.UserRepository;
import com.test.restservice.entity.UserRole;
import com.test.restservice.entity.UserWebList;
import com.test.restservice.repository.UserRoleRepository;
import com.test.restservice.repository.UserWebRepository;

@Component

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	protected CommandLineRunner init(final UserRepository userRepository) {

		return args -> {
			User user = new User();
			user.setUsername("admin");
			user.setPassword("admin");
			user.setName("Administrator");
			user.setEmail("admin@learn.com");
			userRepository.save(user);

		};
		
	}
	

	
	
	

}
