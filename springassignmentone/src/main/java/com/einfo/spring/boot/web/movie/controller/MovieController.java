package com.einfo.spring.boot.web.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.einfo.spring.boot.web.movie.entity.Movie;
import com.einfo.spring.boot.web.movie.service.MovieService;

@Controller
@RequestMapping("/api/v1/movie")
public class MovieController {
	@Autowired
	private MovieService movieService;

	public MovieService getMovieService() {
		return movieService;
	}

	public void setMovieService(MovieService movieService) {
		this.movieService = movieService;
	}

	@PostMapping("/create-movie")
	public ResponseEntity<String> newMovie() {
		Movie newMovie = new Movie();
		newMovie.setId(1);
		newMovie.setName("Test Movie");
		
		movieService.create(newMovie);
		
		return ResponseEntity.ok("New movie Created");
	}

}
