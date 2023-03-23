package com.einfo.spring.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.einfo.spring.model.Person;
import com.einfo.spring.service.PersonService;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Controller
@AllArgsConstructor
@Getter
public class PersonController {

	private final PersonService personService;

	@GetMapping("/")
	public ResponseEntity<String> hello() {
		return ResponseEntity.ok("hello");
	}

	@PostMapping("/create-person")
	public ResponseEntity<String> createPerson(@RequestBody Person person) {
		personService.createPerson(person);
		return ResponseEntity.ok("created new person");
	}
}
