package com.example.Microservice1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Microservice1.service.UserSevice;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserSevice userSevice;
	
	@RequestMapping("/get-users")
	public void checkMehod() {
		//return userSevice.getUsers();
	}
	
}
