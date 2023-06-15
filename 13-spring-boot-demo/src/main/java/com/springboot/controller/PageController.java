package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {
	
	@GetMapping("/start")
	public String startPage() {
		return "Welcome to Start Page - 2023";
	}
	
	@GetMapping("/welcome")
	public String welcomePage() {
		return "Welcome to Spring Page - 2023";
	}
	
}
