package com.einfo.api.contorllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.einfo.api.model.User;
import com.einfo.api.services.UserService;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Controller
@RequestMapping("api/v1/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	private final UserService userService;

	@GetMapping
	public ResponseEntity<String> hello() {
		return new ResponseEntity<String>(HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<String> registerUser(@RequestBody User user) {
		User newUser = userService.registerUser(user);
		System.out.println(newUser);
		return new ResponseEntity<String>(HttpStatus.CREATED);
	}

}