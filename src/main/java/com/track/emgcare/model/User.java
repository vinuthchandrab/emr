package com.track.emgcare.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("users")
public class User {
	
	@Field(name="userId")
	private String userid;
	
	@Field(name="name")
	private String name;
	
	@Field(name="password")
	private String password;
	
	@Field(name="role")
	private String role;
	
	@Field(name="hospitalId")
	private String hospitalId;


	
}
