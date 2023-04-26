package com.track.emgcare.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.track.emgcare.repository.PatientRepository;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("/api/emr/patient")
@RestController
public class PatientController {

	private PatientRepository patientRepo;
	
	public PatientController(PatientRepository patRepo) {
	  this.patientRepo=patRepo;	
	}
	
	@GetMapping("/list")
	public ResponseEntity<Object> findAllPatient(){
		return ResponseEntity.ok(patientRepo.listAll());
	}
	
}
