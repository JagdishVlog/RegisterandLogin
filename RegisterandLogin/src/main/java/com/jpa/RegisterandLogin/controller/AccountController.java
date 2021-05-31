package com.jpa.RegisterandLogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.RegisterandLogin.entities.Account;
import com.jpa.RegisterandLogin.service.AccountService;

@RestController
@RequestMapping("/fundtransfer")
public class AccountController {

	@Autowired
	AccountService accountService;
	
	@PostMapping("/saveaccinfo")
	public ResponseEntity saveAccountInfo(@RequestBody Account account) {
		return accountService.saveAccountInfo(account);
	}

	
	
	
	
}
