package com.einfo.demodatajpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int movieId;
	private String movieName;
	private String director;
	private String language;

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Movie() {
		super();
	}

	public Movie(String movieName, String director, String language) {
		super();
		this.movieName = movieName;
		this.director = director;
		this.language = language;
	}

	@Override
	public String toString() {
		return "movieId=" + movieId + ", movieName=" + movieName + ", director=" + director + ", language="
				+ language;
	}
	

}
