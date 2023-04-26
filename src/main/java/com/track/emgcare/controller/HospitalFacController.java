package com.track.emgcare.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.track.emgcare.repository.HospFacRepository;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/api/emr/hospFac")
public class HospitalFacController {
	
	HospFacRepository hospFacRepo;
	
	public HospitalFacController(HospFacRepository hospRepo) {
		this.hospFacRepo=hospRepo;
	}
	
	@GetMapping("/list")
	public ResponseEntity<Object> findAllHospFac() {
		return ResponseEntity.ok(hospFacRepo.listAll());
	}


	@GetMapping("/liver")
	public ResponseEntity<List<Object>> findLiver() {
		return ResponseEntity.ok(hospFacRepo.findliver());
	}

	@GetMapping("/heart")
	public ResponseEntity<?> findByHeart() {
		return ResponseEntity.ok(hospFacRepo.findHeart());
	}
	
	@GetMapping("/blood")
	public ResponseEntity<?> findByBlood() {
		return ResponseEntity.ok(hospFacRepo.findBlood());
	}

}
