package com.einfo.spring.boot.web.movie.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.einfo.spring.boot.web.movie.dao.MovieDao;
import com.einfo.spring.boot.web.movie.entity.Movie;
import com.einfo.spring.boot.web.movie.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {
	@Autowired
	private MovieDao movieDao;

	public MovieDao getMovieDao() {
		return movieDao;
	}

	public void setMovieDao(MovieDao movieDao) {
		this.movieDao = movieDao;
	}

	@Override
	public Movie create(Movie movie) {
		Movie newMovie = movieDao.create(movie);
		return newMovie;
	}

	@Override
	public Movie findById(int id) {
		Movie movie = movieDao.getById(id);
		return movie;
	}

}
