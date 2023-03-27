package com.einfo.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.einfo.spring.model.Person;
import com.einfo.spring.service.PersonService;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Controller
@AllArgsConstructor
@Getter
@RequestMapping("/api/v1/person")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonController {

	private final PersonService personService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Person>> hello() {
		Iterable<Person> persons = personService.getAllPersons();
		List<Person> personList = new ArrayList<>();
		
		for (Person person : persons) {
			personList.add(person);
		}
		
		System.out.println(personList);
		
		return ResponseEntity.ok(personList);
		
	}

	@PostMapping("/create-person")
	public ResponseEntity<String> createPerson(@RequestBody Person person) {
		personService.createPerson(person);
		return ResponseEntity.ok("created new person");
	}
}
