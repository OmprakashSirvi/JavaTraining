package com.einfo.spring.boot.web.show.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.einfo.spring.boot.web.movie.entity.Movie;
import com.einfo.spring.boot.web.movie.service.MovieService;
import com.einfo.spring.boot.web.show.entity.Show;
import com.einfo.spring.boot.web.show.service.ShowService;

@Controller
@RequestMapping("/api/v1/show")
public class ShowController {

	@Autowired
	private ShowService showService;

	@Autowired
	private MovieService movieService;

	public ShowService getShowService() {
		return showService;
	}

	public void setShowService(ShowService showService) {
		this.showService = showService;
	}

	public MovieService getMovieService() {
		return movieService;
	}

	public void setMovieService(MovieService movieService) {
		this.movieService = movieService;
	}

	@PostMapping("create-show")
	public ResponseEntity<String> createService() {
		Show newShow = new Show();
		Movie movie = movieService.findById(1);
		newShow.setId(1);
		newShow.setMovie(movie);
		newShow.setScreen_num(1);
		newShow.setTime("morning");
		
		showService.create(newShow);
		
		return ResponseEntity.ok("New show created");
	}
}
