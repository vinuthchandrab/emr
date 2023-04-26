package com.track.emgcare.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("hospFacCol")
public class HospFac {

	
	@Field(name="hospitalId")
	private String hid;
	
	@Field(name="name")
	private String hospName;

	@Field(name="contactNo")
	private String contactNo;
	
	@Field(name="address")
	private String address;
	
	
	@Field(name="facilities")
	private Object facilities;
}
