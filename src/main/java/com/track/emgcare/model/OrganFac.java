package com.track.emgcare.model;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Document("organAvailCol")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrganFac {

	
	//@Id
	private String id;
	
	//@Field(name="HospitalName")
	private String hospName;
		
	//@Field(name="params")
	private Object params;
	
	
	//@Field(name="dyanamicparams")
	private Object dynparams;
}
