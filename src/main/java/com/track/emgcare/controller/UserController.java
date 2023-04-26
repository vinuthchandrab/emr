package com.track.emgcare.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.track.emgcare.model.User;
import com.track.emgcare.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	UserService userService;
	
	public UserController(UserService userService) {
		this.userService=userService;
	}
	
	@PostMapping("/add")
	public ResponseEntity addUser(@RequestBody User user) {
		userService.addUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@GetMapping("/users")
	public List<User> getUsers() {
		System.out.println("coming to getUsers... page");
		return userService.getUsers();
	}
	
	@GetMapping("/user/{name}")
	public ResponseEntity<Object> getUser(@PathVariable String name) {
		return ResponseEntity.ok(userService.getUser(name));
	}

}
