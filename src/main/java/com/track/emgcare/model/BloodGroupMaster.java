package com.track.emgcare.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("bloodgroupMaster")
public class BloodGroupMaster {
	
	private String bloodGroupId;
	private String bloodGroup;
}
