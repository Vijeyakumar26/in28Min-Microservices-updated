package com.minutes.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.minutes.DAO.UserDAOService;
import com.minutes.beans.User;

@RestController
public class UserController {
	
	@Autowired 
	private UserDAOService service;
	
	@GetMapping(path = "/users")
	public List<User> retrieveAllUsers(){
		return service.findAll();
	}
	
	@GetMapping(path = "/users/{userId}")
	public User retrieveUser(@PathVariable int userId){
		return service.findUser(userId);
	}
	
	@PostMapping(path = "/users")
	public ResponseEntity<User> saveUser(@RequestBody User user){
		User savedUser = service.saveUser(user);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedUser.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
	}
}
