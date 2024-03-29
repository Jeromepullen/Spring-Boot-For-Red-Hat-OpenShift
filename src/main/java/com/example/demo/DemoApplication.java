package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@GetMapping("/")
	public String test() {
		return "This is Jerome Pullen's test Spring Boot App for Red Hat OpenShift";
	}

	@GetMapping("/{input}")
	public String deployed(@PathVariable String input) {
		return "Hey " + input + " your application deployed successfully!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
