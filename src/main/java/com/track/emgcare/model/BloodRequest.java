package com.track.emgcare.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("bloodRequest")
public class BloodRequest {

	private String requestedByHosId;
	
	private String requestedByHosName;
	
	private String requestedToHosId;
	
	
	private String requestedToHosName;
	
	
	
	private String bloodGroupID;
	
	private String bloodGroupName;
	
	private Integer requestedUnit;
	
	private String requestState;
	
}
