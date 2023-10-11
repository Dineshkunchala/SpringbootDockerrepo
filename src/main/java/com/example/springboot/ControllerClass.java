package com.example.springboot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
	
	@GetMapping("/welcome")
	public String welcome1() {
		
		return "Welcome to JRTP";
	}

}
