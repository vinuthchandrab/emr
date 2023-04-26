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
@Document("patientCol")
public class Patient {
	
	
	@Field(name="patientId")
	private String pid;
	
	@Field(name="name")
	private String patName;
	
	@Field(name="age")
	private String age;
	
	@Field(name="hospitalId")
	private String hospitalId;
	
	@Field(name="contactNo")
	private String contactNo;
	
	@Field(name="medicalDetails")
	private Object params;
	
	
	@Field(name="dyanamicparams")
	private Object dynparams;

}
