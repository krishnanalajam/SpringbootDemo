package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class LoginController {
	
	@RequestMapping("/login")
	public String login() {
		return "login successful";
	}
	
	@RequestMapping("/reg")
	public String reg() {
		return "login successful";
	}
	
	@RequestMapping("/reg1")
	public String reg1() {
		return "login successful";
	}
	
	@RequestMapping("/reg2")
	public String reg2() {
		return "login successful";
	}
}
