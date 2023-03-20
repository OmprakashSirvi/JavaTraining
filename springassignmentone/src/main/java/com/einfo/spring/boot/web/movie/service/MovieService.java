package com.einfo.spring.boot.web.movie.service;

import com.einfo.spring.boot.web.movie.entity.Movie;

public interface MovieService {
	Movie create(Movie movie);
	Movie findById(int id);
}
