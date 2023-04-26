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
//@Document("users")
public class User {
	
	//@Id
	private String id;
	
	//@Field(name="name")
	private String name;
	
	//@Field(name="age")
	private int age;
	/*
	 * public int getAge() { return age; }
	 * 
	 * public void setAge(int age) { this.age = age; }
	 * 
	 * public String getId() { return id; }
	 * 
	 * public void setId(String id) { this.id = id; }
	 * 
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public User() {
	 * 
	 * }
	 * 
	 * public User(String id, String name) { super(); this.id = id; this.name =
	 * name; }
	 * 
	 * @Override public int hashCode() { return Objects.hash(id, name); }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; User other = (User) obj; return Objects.equals(id, other.id) &&
	 * Objects.equals(name, other.name); }
	 */

	
}
