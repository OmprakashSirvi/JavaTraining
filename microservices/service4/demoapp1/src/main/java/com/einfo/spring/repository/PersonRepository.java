package com.einfo.spring.repository;

import org.springframework.data.repository.CrudRepository;

import com.einfo.spring.model.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {

}
