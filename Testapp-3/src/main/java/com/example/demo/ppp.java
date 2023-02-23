package com.example.demo;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class ppp {
	String str="naresh";

	@GetMapping("/")
	public String getName() {
	return "Welcome "+str+" !";
	}
	String str1="Green";
	@GetMapping("/game")
	public String getMyFav() {
	return "My favourite color is "+str1;
	}
}
