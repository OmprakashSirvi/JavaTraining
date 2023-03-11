package com.einfo.demodatajpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.einfo.demodatajpa.model.Movie;

@Repository
public interface MovieDAO extends JpaRepository<Movie, Integer> {

	@Query("select m from Movie m where m.language= :lang")
	List<Movie> findMovieByLanguage(@Param("lang") String lang);

//	@Modifying
//	@Query("update Movie m set m.movieName=:candidateMovie.movieName, m.director=:candidateMovie.director, m.language=:candidateMovie.language where m.movieId=:id")
//	Movie findMovieByIdAndUpdate(@Param("id") int id, Movie candidateMovie);
}
