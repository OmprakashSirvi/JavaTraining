package com.einfo.spring.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.einfo.spring.model.Score;
import com.einfo.spring.service.ScoreService;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Controller
@AllArgsConstructor
@Getter
public class ScoreController {
	private final ScoreService scoreService;
	
	@PostMapping("/create-score")
	public ResponseEntity<String> createScore(@RequestBody Score score) {
		scoreService.createScore(score);
		return ResponseEntity.ok("New Score Created");
	}
	
}
