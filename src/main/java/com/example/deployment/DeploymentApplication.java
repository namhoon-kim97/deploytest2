package com.example.deployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DeploymentApplication {

	@GetMapping("/message")
	public String test(){
		return "Deploy success";
	}

	public static void main(String[] args) {
		SpringApplication.run(DeploymentApplication.class, args);
	}

}
