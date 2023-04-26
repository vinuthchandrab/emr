package com.track.emgcare.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.track.emgcare.model.HospFac;

public interface HospFacRepository1 {//extends MongoRepository<HospFac,String> {

	//@Query(value= "{}",fields="{dynamicparams:0,id:0}")
	public List<Object> listAll();
}
