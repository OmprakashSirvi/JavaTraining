package com.einfo.spring.service;

import com.einfo.spring.model.Person;

public interface PersonService {

	Iterable<Person> getAllPersons();
	Person createPerson(Person person);
	Person getPersonById(int id);
}
