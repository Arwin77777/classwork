package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
	@GetMapping("/")
	public String world()
	{
		return "Hello World";
	}
}
