package com.javacourse.ques1;

public class Player {
	private String name;
	private String skill;

	public Player(String name, String skill) {
		super();
		this.name = name;
		this.skill = skill;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "Player : name=" + name + ", skill=" + skill;
	}

}
