package com.mit.lab1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Hello {
	@GetMapping("/")
	public String hello() {
		return "Welcome to MIT-FIS lab --Dhruva Deepak";
	}
}
