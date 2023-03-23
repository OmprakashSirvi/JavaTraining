package com.einfo.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.einfo.spring.model.Person;
import com.einfo.spring.repository.PersonRepository;
import com.einfo.spring.service.PersonService;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Service
@Getter
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

	@Autowired
	private final PersonRepository personRepository;
	
	@Override
	public Iterable<Person> getAllPersons() {
		return  personRepository.findAll();
	}

	@Override
	public Person createPerson( Person person) {
		return personRepository.save(person);
	}

	@Override
	public Person getPersonById(int id) {
		return personRepository.findById(id).orElse(null);
	}

}
