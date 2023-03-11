package com.einfo.demodatajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.einfo.demodatajpa.dao.MovieDAO;
import com.einfo.demodatajpa.model.Movie;

import ch.qos.logback.core.model.Model;

@RestController
public class MovieController {
	@Autowired
	MovieDAO moviedao;

	@RequestMapping("/")
	public ModelAndView getHomePage() {
		return new ModelAndView("home");
	}

	@RequestMapping("/movieForm")
	public ModelAndView getMovieFormPage() {
		return new ModelAndView("movieForm");
	}

	@RequestMapping("/addData")
	public ModelAndView getData(@RequestParam String movieName, String language, String director) {
		ModelAndView movieModelAndView = new ModelAndView("success");

		movieModelAndView.addObject("movieName", movieName);
		movieModelAndView.addObject("director", director);
		movieModelAndView.addObject("language", language);

		moviedao.save(new Movie(movieName, director, language));

		return movieModelAndView;
	}

	@RequestMapping("/viewMovies")
	public ModelAndView getMovies() {
		ModelAndView movieModelAndView = new ModelAndView("viewmovies");

		List<Movie> movieList = moviedao.findAll();
		System.out.println(movieList);

		movieModelAndView.addObject("movies", movieList);

		return movieModelAndView;
	}

	@RequestMapping("/viewMoviesByLang")
	public ModelAndView getMoviesById(@RequestParam("lang") String lang) {
		ModelAndView movieModelAndView = new ModelAndView("viewmovies");
		List<Movie> moviesByLanguage = moviedao.findMovieByLanguage(lang);

		movieModelAndView.addObject("movies", moviesByLanguage);

		return movieModelAndView;
	}

	@RequestMapping("/editMovie")
	public ModelAndView getEditMovieByIdForm(@RequestParam("id") int id) {
		ModelAndView movieModelAndView = new ModelAndView("editMovieForm");
		
		return movieModelAndView;
	}
//	
//	@RequestMapping("/updateMovie/{id}")
//	public ModelAndView updateMovieById(@PathVariable int id) {
//		ModelAndView movieModelAndView = new ModelAndView("viewmovies");
//		Movie movie = moviedao.findMovieByIdAndUpdate(id);
//		
//		movieModelAndView.addObject(movie);
//		
//		return movieModelAndView;
//	}
//	

}
