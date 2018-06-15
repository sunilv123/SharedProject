package com.example.Microservice1.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = { "com.example.Microservice1.*" })
@EntityScan("com.example.Microservice1.*")   
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = { "com.example.Microservice1.*"})
//@EnableAsync
public class AppConfig {

	
	
}
