package com.einfo.spring.boot.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloController {
	public ResponseEntity<String> hello() {
		return ResponseEntity.ok("Hello");
	}

}
