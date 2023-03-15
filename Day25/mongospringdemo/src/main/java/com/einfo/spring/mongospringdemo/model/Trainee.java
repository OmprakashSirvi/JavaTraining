package com.einfo.spring.mongospringdemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Trainee {

	@Id
	private int id;
	private String traineeName;
	private String location;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Trainee [id=" + id + ", traineeName=" + traineeName + ", location=" + location + "]";
	}

	public Trainee(int id, String traineeName, String location) {
		super();
		this.id = id;
		this.traineeName = traineeName;
		this.location = location;
	}

}
