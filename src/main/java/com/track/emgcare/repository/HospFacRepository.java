package com.track.emgcare.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.track.emgcare.model.HospFac;

@Repository
public interface HospFacRepository extends MongoRepository<HospFac,String>{

	@Query(value= "{'facilities.organAvailability.liverSize' : { $exists : true } }",fields="{_id:0,hospitalId:1,name:1,contactNo:1,address:1,'facilities.organAvailability.bloodGroup':1,'facilities.organAvailability.donorAge':1,'facilities.organAvailability.liverSize':1,'facilities.organAvailability.liverWeight':1}")
	List<Object> findliver();
	
	@Query(value= "{'facilities.organAvailability.heartWeight' : { $exists : true } }",fields="{_id:0,hospitalId:1,name:1,contactNo:1,address:1,'facilities.organAvailability.bloodGroup':1,'facilities.organAvailability.donorAge':1,'facilities.organAvailability.heartWeight':1}")
	List<Object> findHeart();
	
	@Query(value= "{'facilities.bloodAvailability.bloodGroup' : { $exists : true } }",fields="{_id:0,hospitalId:1,name:1,contactNo:1,address:1,'facilities.bloodAvailability.bloodGroup':1,'facilities.bloodAvailability.AvailableUnit':1}")
	List<Object> findBlood();
	
	@Query(value= "{}",fields="{'_id':0}")
	public List<Object> listAll();

}
