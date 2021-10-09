package com.simplilearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDeploymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDeploymentApplication.class, args);
	}
	
	@GetMapping("/")
	public String home() {
		return "Spring Deployment Project using Jenkins";
	}

}
