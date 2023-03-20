package com.einfo.spring.boot.web.movie.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.einfo.spring.boot.web.movie.dao.MovieDao;
import com.einfo.spring.boot.web.movie.entity.Movie;
import com.einfo.spring.boot.web.movie.repository.MovieRepository;

@Component
public class MovieDaoImpl implements MovieDao {

	@Autowired
	private MovieRepository movieRepository;

	public MovieRepository getMovieRepository() {
		return movieRepository;
	}

	public void setMovieRepository(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}

	@Override
	public Movie create(Movie movie) {
		Movie newMovie = movieRepository.save(movie);
		return newMovie;
	}

	@Override
	public Movie getById(int id) {
		movieRepository.findById(id);
		return movieRepository.findById(id).orElse(null);
	}

}
