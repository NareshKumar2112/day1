package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Appcontroller {
	
	@RequestMapping("url")
	public String handlerMethod()
	{
		return "welcome";
	}

}
