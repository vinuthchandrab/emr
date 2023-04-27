package com.track.emgcare.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.track.emgcare.model.HospitalMaster;

@Repository
public interface HospitalMasterRepository extends MongoRepository<HospitalMaster, String>{

}
