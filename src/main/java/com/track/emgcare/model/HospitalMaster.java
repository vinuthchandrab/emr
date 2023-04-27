package com.track.emgcare.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("hospitalMaster")
public class HospitalMaster {
	@Field(name="hospitalId")
	private String hospitalId;
	
	@Field(name="name")
	private String hospName;

	@Field(name="contactNo")
	private String contactNo;
	
	@Field(name="address")
	private String address;
}
