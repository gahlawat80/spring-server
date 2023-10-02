package com.luv2code.spring.boot.api.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringServerApplication {
	int count;
	@GetMapping("/greet")
	public String greet(){
		count++;
		return "Welcome to spring boot app deployment to AWS!!! ";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringServerApplication.class, args);
	}

}
