package com.example.Microservice1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Microservice1.repo.AddressRepo;

import shared.modal.AppUser;
import shared.repo.AppUserRepo;

@Service
public class UserSevice {

	@Autowired
	AddressRepo addressRepo;
	
//	@Autowired
//	AppUserRepo appUserRepo;
//	
	public void getUsers() {
			AppUser appUser = new AppUser();
//		
//		if(appUserRepo.findAll().size() != 0) {
//			
//			appUser.setName("Running Microservice : 1");
//			appUser.setEmail("Microservice1@gmail.com");
//			
//			appUserRepo.save(appUser);
//		}
//		
		//return appUserRepo.findAll();
		
	}
	
}
