package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/helloworld")
	public String helloworldMethod() {
		return "Helloworld!!!";
	}
	

}
