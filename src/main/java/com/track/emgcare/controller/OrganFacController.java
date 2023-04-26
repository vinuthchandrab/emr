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
@RequestMapping("/api/emr/orgFac")
public class OrganFacController {

	private HospFacRepository orgRepo;

	public OrganFacController(HospFacRepository orgRepo) {
		this.orgRepo = orgRepo;
	}

	@GetMapping("/list")
	public ResponseEntity<Object> findAllOrgans() {
		return ResponseEntity.ok(orgRepo.listAll());
	}

	@GetMapping("/liver")
	public ResponseEntity<List<Object>> findLiver() {
		return ResponseEntity.ok(orgRepo.findliver());
	}

	@GetMapping("/heart")
	public ResponseEntity<?> findByHeart() {
		return ResponseEntity.ok(orgRepo.findHeart());
	}

	/*
	 * @GetMapping("/organ/blood/{group}") public ResponseEntity<?>
	 * findByBlood(@PathVariable String group) { return
	 * ResponseEntity.ok(orgRepo.findBlood(group)); }
	 */
	@GetMapping("/blood")
	public ResponseEntity<?> findByBlood() {
		return ResponseEntity.ok(orgRepo.findBlood());
	}

}
