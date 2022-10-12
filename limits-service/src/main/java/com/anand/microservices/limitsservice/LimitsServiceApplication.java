package com.anand.microservices.limitsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class LimitsServiceApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(LimitsServiceApplication.class, args);
		
		
	}

}
