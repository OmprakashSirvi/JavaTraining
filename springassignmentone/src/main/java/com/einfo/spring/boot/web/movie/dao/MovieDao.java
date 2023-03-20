package com.einfo.spring.boot.web.movie.dao;

import com.einfo.spring.boot.web.movie.entity.Movie;

public interface MovieDao {
	Movie create(Movie movie);
	Movie getById(int id);
}
