package com.track.emgcare.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.track.emgcare.model.BloodRequest;
import com.track.emgcare.repository.BloodGroupMasterRepository;
import com.track.emgcare.repository.BloodRequestRepository;
import com.track.emgcare.repository.HospitalMasterRepository;

@CrossOrigin(origins="http://localhost:4200",maxAge=3600)
@RestController
@RequestMapping("/api/emr/request")
public class EmrRequestController {
	
	public static final String PENDING = "PENDING";
	private BloodRequestRepository bloodReqRepo;
	private HospitalMasterRepository hospMasterRepo;
	private BloodGroupMasterRepository bgMasterRepo;
	
	public Map<String,String> hospMap = new HashMap<>();
	public Map<String,String> bloodMap = new HashMap<>();
	
	public EmrRequestController(BloodRequestRepository bRepo,HospitalMasterRepository hospMasterRepo,BloodGroupMasterRepository bgMasterRepo){
		this.bgMasterRepo=bgMasterRepo;
		this.hospMasterRepo=hospMasterRepo;
		this.bloodReqRepo=bRepo;
	}
	
	@PostConstruct
	private void populateMasterData() {
		this.bgMasterRepo.findAll().forEach(b -> bloodMap.put(b.getBloodGroupId(), b.getBloodGroup()));
		this.hospMasterRepo.findAll().forEach(h -> hospMap.put(h.getHospitalId(), h.getHospName()));
	}
	
	@PostMapping("/blood")
	public ResponseEntity<Object> saveRequest(@RequestBody BloodRequest bloodReq){
		BloodRequest br= new BloodRequest();
		br.setBloodGroupID(bloodReq.getBloodGroupID());
		br.setBloodGroupName(bloodMap.get(br.getBloodGroupID()));
		br.setRequestedByHosId(bloodReq.getRequestedByHosId());
		br.setRequestedByHosName(hospMap.get(bloodReq.getRequestedByHosId()));
		br.setRequestedToHosId(bloodReq.getRequestedToHosId());
		br.setRequestedToHosName(hospMap.get(bloodReq.getRequestedToHosId()));
		br.setRequestedUnit(bloodReq.getRequestedUnit());
		br.setRequestState(PENDING);
		
		bloodReqRepo.save(br);
		return ResponseEntity.status(HttpStatus.CREATED).build();
		
	}
	
	@GetMapping("/requestList")
	public ResponseEntity<Object> getRequestForHospital(@RequestParam("hospitalId") String hospitalId ){
		return ResponseEntity.ok(bloodReqRepo.findAll());
	}

}
