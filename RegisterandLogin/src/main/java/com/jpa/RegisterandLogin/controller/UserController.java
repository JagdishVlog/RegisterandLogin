package com.jpa.RegisterandLogin.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.RegisterandLogin.entities.User;
import com.jpa.RegisterandLogin.exception.EmailAndUserNameValidationException;
import com.jpa.RegisterandLogin.service.UserService;



@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/signUp")
	public ResponseEntity signUpNewUser(@Valid @RequestBody User user) throws EmailAndUserNameValidationException {
		return userService.signUpNewUser(user);
	}

	@GetMapping("/login")
	public ResponseEntity loginUser(@RequestParam(required = true, value = "email") String email,
									@RequestParam(required = true, value = "password")String password ){
		return userService.loginUser(email,password);
	}

	@GetMapping("/getall")
	public ResponseEntity getAllUsers(){
		return userService.getAllUsers();
	}

}

