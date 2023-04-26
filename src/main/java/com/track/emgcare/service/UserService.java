package com.track.emgcare.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.track.emgcare.model.User;
import com.track.emgcare.repository.UserRepository;

@Service
public class UserService {
	
	UserRepository userRepository;
	
	
	public UserService(UserRepository userRepository) {
		this.userRepository= userRepository;
	}
	
	public void addUser(User user) {
		userRepository.save(user);
	}
	
	public List<User> getUsers() {
		List<User> users = userRepository.findAll();
		 return users;
	}
	
	public Object getUser(String name) {
		
		return userRepository.findbyName(name);
	}

}
