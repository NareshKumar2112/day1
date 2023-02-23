package com.example.demo;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class pro2 {
	String str="naresh";

	@GetMapping("/")
	public String getName() {
	return "Welcome "+str+" !";
	}
}
