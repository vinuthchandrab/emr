package com.track.emgcare.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.track.emgcare.model.BloodRequest;

@Repository
public interface BloodRequestRepository extends MongoRepository<BloodRequest, String>{

}
