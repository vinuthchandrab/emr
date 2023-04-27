package com.track.emgcare.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.track.emgcare.model.BloodGroupMaster;

@Repository
public interface BloodGroupMasterRepository extends MongoRepository<BloodGroupMaster, String>{

}
