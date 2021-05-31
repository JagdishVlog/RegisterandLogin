package com.jpa.RegisterandLogin.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.RegisterandLogin.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	

	User findOneByEmailAndUserName(String email, String userName);

	User findByEmailAndPassword(String email, String password);
	

}
