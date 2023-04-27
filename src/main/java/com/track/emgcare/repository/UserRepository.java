package com.track.emgcare.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.track.emgcare.model.User;

@Repository
public interface UserRepository extends MongoRepository<User,String> {

	Optional<User> findByUserid(String userid);

	/*
	 * @Query(value= "{id:?0}") Object findbyId(String id);
	 */
	
	

}
