package com.jpa.RegisterandLogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.RegisterandLogin.entities.Benificiary;
import com.jpa.RegisterandLogin.service.BenificiaryService;

@RestController
@RequestMapping("/benificiary")
public class BenificiaryController {

	@Autowired
	BenificiaryService benificiaryService;
	
	
	@PostMapping("/save")
	Benificiary saveBenificiary(@RequestBody Benificiary benificiary) {
		return benificiaryService.saveBenificiary(benificiary);
		
	}

}
