package com.track.emgcare.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.track.emgcare.model.Patient;

public interface PatientRepository extends MongoRepository<Patient,String> {

	@Query(value= "{}",fields="{_id:0}")
	public List<Object> listAll();
}
