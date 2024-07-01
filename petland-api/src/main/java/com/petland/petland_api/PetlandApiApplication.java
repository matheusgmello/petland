package com.petland.petland_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PetlandApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetlandApiApplication.class, args);
	}


	@GetMapping("/helloworld")
	public String helloWorld() {
		return "Hello Friend!, Welcome to Petland API!";
	}

}
