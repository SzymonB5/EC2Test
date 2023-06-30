package com.example.EC2Test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Ec2TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ec2TestApplication.class, args);
	}

	@GetMapping("")
	public String test1() {
		return "12345";
	}

	@GetMapping("/test")
	public String test2() {
		return "testHere";
	}

}
