package com.track.emgcare.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.track.emgcare.model.User;

@Repository
public interface UserRepository extends MongoRepository<User,String> {

	@Query(value= "{name:?0}",fields = "{id:0}")
	Object findbyName(String name);
	
	

}
