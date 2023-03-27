package com.einfo.spring.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.einfo.spring.model.User;
import com.einfo.spring.service.UserService;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Controller
public class UserController {

	private final UserService userService;

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerUser(User user) {
		User newUser = userService.registerUser(user);
		
		if (newUser == null) return "notAdded";
		
		return "addSuccess";
	}

	@RequestMapping(value = "api/v1/user/register", method = RequestMethod.POST)
	public ResponseEntity<String> registerUserFromApi(@RequestBody User user) {

		User newUser = userService.registerUser(user);

		if (newUser == null)
			return ResponseEntity.ok("Not registered");

		return ResponseEntity.ok("Registered User");
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginUser(User cred, Model model) {
		
		User user = userService.verifyLogin(cred.getEmail(), cred.getPassword());
		if (user != null) {
			System.out.println(user);
			model.addAttribute("firstName", user.getFirstName());
			return "success";
		}
		else return "invalid";
	}

	@RequestMapping(value = "api/v1/user/login", method = RequestMethod.POST)
	public ResponseEntity<String> loginUserFromUser(@RequestBody User cred, Model model) {

		if (userService.verifyLogin(cred.getEmail(), cred.getPassword()) != null) return ResponseEntity.ok("Login success");
		else
			return ResponseEntity.ok("Not logged in");
	
	}
}
