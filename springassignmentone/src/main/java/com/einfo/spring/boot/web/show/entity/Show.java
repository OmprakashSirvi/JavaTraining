package com.einfo.spring.boot.web.show.entity;


import com.einfo.spring.boot.web.movie.entity.Movie;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="show")
public class Show {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String time;
	private int screen_num;
	
	@Column(name="seats_left")
	private int seats_left;

	@ManyToOne
	@JoinColumn(name="movie_id", referencedColumnName = "id")
	private Movie movie;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getScreen_num() {
		return screen_num;
	}

	public void setScreen_num(int screen_num) {
		this.screen_num = screen_num;
	}

	public int getSeats_left() {
		return seats_left;
	}

	public void setSeats_left(int seats_left) {
		this.seats_left = seats_left;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	
}
