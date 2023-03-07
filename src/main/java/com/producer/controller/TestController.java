package com.producer.controller;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@PostConstruct
	public void init() {
		System.out.println("############TestController############");
		System.out.println("############TestController############");
		System.out.println("############TestController############");
		System.out.println("############TestController############");
		System.out.println("############TestController############");
		System.out.println("############TestController############");
		System.out.println("############TestController############");
		
	}
	
	@GetMapping("/test")
	public String test() {
		return "Java is programming language!";
	}

}
