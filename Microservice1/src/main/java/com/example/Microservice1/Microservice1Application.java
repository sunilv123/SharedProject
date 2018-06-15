package com.example.Microservice1;

import org.springframework.boot.SpringApplication;

import com.example.Microservice1.config.AppConfig;

public class Microservice1Application {
	
	public static void main(String[] args) {
		SpringApplication.run(AppConfig.class, args);
		System.out.println("Microservice : 1 running");
	}
	
	
	
}
