package com.javacourse.ques3;

public class Player {
	private String name;
	private String team;
	private String skills;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public Player(String name, String team, String skills) {
		super();
		this.name = name;
		this.team = team;
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "--" + name + ", --" + team + ", --" + skills;
	}
	
	

}
