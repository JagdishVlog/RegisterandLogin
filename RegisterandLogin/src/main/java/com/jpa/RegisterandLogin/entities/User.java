package com.jpa.RegisterandLogin.entities;

import javax.persistence.*;
import javax.validation.constraints.Email;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.http.HttpStatus;

import com.sun.istack.NotNull;

@Entity
@Table(name = "userdetails")
public class User {
	
	public User(){
		
	}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
    
    @Column
    @NotNull
	private String userName;
    
    @Column
    @NotNull
	private String password;
    
    @Column
    @Email(message="Length should not exceed more than 30")
	private String email;
    
    @Column
	private String age;
    
    @Column
	private String city;
    
    @Column
	private String state;
    
    @Column
	private String country;

    @JsonIgnore
	@Enumerated(EnumType.STRING)
	private LoginStatus loginStatus;

	public LoginStatus getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(LoginStatus loginStatus) {
		this.loginStatus = loginStatus;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password="
				+ password + ", email=" + email + ", age=" + age + ", city=" + city + ", state=" + state + ", country="
				+ country + "]";
	}

	public User(Long userId, Long accountId, String userName, String password,
			@Email(message = "Length should not exceed more than 30") String email, String age, String city,
			String state, String country,LoginStatus loginStatus) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.age = age;
		this.city = city;
		this.state = state;
		this.country = country;
		this.loginStatus=loginStatus;
	}

	

	
	
}
