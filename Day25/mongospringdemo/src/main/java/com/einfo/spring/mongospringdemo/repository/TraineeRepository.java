package com.einfo.spring.mongospringdemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.einfo.spring.mongospringdemo.model.Trainee;

@Repository
public interface TraineeRepository extends MongoRepository<Trainee, String> {
	
}
