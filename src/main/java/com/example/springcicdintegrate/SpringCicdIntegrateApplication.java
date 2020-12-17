package com.example.springcicdintegrate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCicdIntegrateApplication {

	@GetMapping("/app")
	public String message() {
		return "hello";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringCicdIntegrateApplication.class, args);
	}

}
