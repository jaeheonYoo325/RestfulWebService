package com.restful.restfulwebservice.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jpa")
public class UserJpaController {

	@Autowired
	private UserRepository userRepository;
	
	// http:localhost:8088/jpa/users
	@GetMapping("/users")
	public List<User> retrieveAllUser() {
		return userRepository.findAll();
	}
}
