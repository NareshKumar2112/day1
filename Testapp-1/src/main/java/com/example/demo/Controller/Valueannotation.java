package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Valueannotation {
	
	@Value("${value:Pranesh}")
	private String name;
	
	@GetMapping("/")
	public String display() {
		return "Hey... "+name;
	}
}