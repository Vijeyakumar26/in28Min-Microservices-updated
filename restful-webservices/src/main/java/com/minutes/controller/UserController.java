package com.minutes.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.minutes.DAO.UserDAOService;
import com.minutes.beans.User;
import com.minutes.exception.UserNotFoundException;

import jakarta.validation.Valid;

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
		User user = service.findUser(userId);
		if(user==null) {
			throw new UserNotFoundException("User not found with id: "+ userId);
		}
		return user;
	}
	
	@DeleteMapping(path = "/users/{userId}")
	public void deleteUserById(@PathVariable int userId){
		service.deleteUser(userId);
	}
	
	@PostMapping(path = "/users")
	public ResponseEntity<User> saveUser(@Valid @RequestBody User user){
		User savedUser = service.saveUser(user);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedUser.getId())
				.toUri();
		 
		return ResponseEntity.created(location).build();
	}
}
