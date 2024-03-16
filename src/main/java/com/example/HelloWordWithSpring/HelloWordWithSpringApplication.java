package com.example.HelloWordWithSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWordWithSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWordWithSpringApplication.class, args);
	}

	@GetMapping
	public String get(){
		return "Hello World";
	}

}
