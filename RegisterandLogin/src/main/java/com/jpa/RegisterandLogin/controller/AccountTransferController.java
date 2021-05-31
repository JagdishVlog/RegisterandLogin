package com.jpa.RegisterandLogin.controller;

import com.jpa.RegisterandLogin.DTO.FundTransferDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.RegisterandLogin.entities.AccountTransfer;
import com.jpa.RegisterandLogin.entities.Benificiary;
import com.jpa.RegisterandLogin.service.AccountTransferService;

@RestController
@RequestMapping("/fundtransfer")
public class AccountTransferController {

	@Autowired 
	AccountTransferService accountTransferService;


	
	@PostMapping("/addaccount")
	public AccountTransfer createAccount(@RequestBody AccountTransfer accounttransfer) {
		return accountTransferService.addAccountInfo(accounttransfer);
	}
	
	@PutMapping("/fundtransfer")
	public ResponseEntity fundTransfer(@RequestBody FundTransferDTO fundTransferDTO) {
		return accountTransferService.fundTransfer(fundTransferDTO);
		
	}
	
	
	
	
	
	
	
}
