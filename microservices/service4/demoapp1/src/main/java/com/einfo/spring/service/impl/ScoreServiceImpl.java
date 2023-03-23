package com.einfo.spring.service.impl;

import org.springframework.stereotype.Service;

import com.einfo.spring.model.Person;
import com.einfo.spring.model.Score;
import com.einfo.spring.repository.PersonRepository;
import com.einfo.spring.repository.ScoreRepository;
import com.einfo.spring.service.ScoreService;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Service
@AllArgsConstructor
@Getter
public class ScoreServiceImpl implements ScoreService {

	private final ScoreRepository scoreRepository;
	private final PersonRepository personRepository;
	
	@Override
	public Score createScore(Score score) {
		Person person = personRepository.findById(1).orElse(null);
				
		score.setPerson(person);
		Score newScore = scoreRepository.save(score);
		return newScore;
	}

}
