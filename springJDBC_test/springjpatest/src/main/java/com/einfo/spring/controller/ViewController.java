package com.einfo.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

	@RequestMapping("/")
	public String viewHome() {
		return "home";
	}

	@RequestMapping("/login")
	public String viewLogin() {
		return "login";
	}

	@RequestMapping("/register")
	public String viewRegister() {
		return "register";
	}
}
