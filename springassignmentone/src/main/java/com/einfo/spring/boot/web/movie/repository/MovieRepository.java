package com.einfo.spring.boot.web.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.einfo.spring.boot.web.movie.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

}
