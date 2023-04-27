package com.track.emgcare.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.track.emgcare.exception.ResourceNotFoundException;
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
	
	public User getUser(User user) throws ResourceNotFoundException {
		if(user.getUserid()==null) {
			//return new User(user.getUserid(),"","","", "");
			throw new ResourceNotFoundException("User not found");
		}

				Optional<User> u = userRepository.findByUserid(user.getUserid());
		if(u.isEmpty() || (u.isPresent() && !(u.get().getPassword().equals(user.getPassword())))) {
			//return new User(user.getUserid(),"","","", "");
			throw new ResourceNotFoundException("User not found");
		}
		return u.get();
	}

}
