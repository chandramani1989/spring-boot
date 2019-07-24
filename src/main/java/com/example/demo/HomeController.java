package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "hi....";
	}
	
	@GetMapping("/{home}")
	public String home(@PathVariable String home) {
		String s1="Applicatin is running"+home;
		return s1;
	}
	
}
