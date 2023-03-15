package com.einfo.spring.mongospringdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.einfo.spring.mongospringdemo.model.Trainee;
import com.einfo.spring.mongospringdemo.repository.TraineeRepository;

@RestController
public class TraineeController {
	@Autowired
	TraineeRepository traineeRepository;

	@RequestMapping("/")
	public ModelAndView viewHome() {

		return new ModelAndView("index");
	}

	@RequestMapping("/insertTrainee")
	public ModelAndView insertTrainee() {
		Trainee trainee = new Trainee(1, "op", "india");

		traineeRepository.save(trainee);

		return new ModelAndView("success");
	}

	@RequestMapping("/viewTrainees")
	public List<Trainee> viewTrainees() {
		return traineeRepository.findAll();
	}

	public Trainee updateTrainee() {
		// traineeRepository
		//
		// return new ModelAndView("home");
		return null;
	}
}
