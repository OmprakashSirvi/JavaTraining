package com.assignment.jdbc.ques1.model;

public class Player {
	private long player_id;
	private String name;
	private String country;
	private Skill skill;

	public long getPlayer_id() {
		return player_id;
	}

	public void setPlayer_id(long player_id) {
		this.player_id = player_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public Player(int player_id, String name, String country, Skill skill) {
		super();
		this.player_id = player_id;
		this.name = name;
		this.country = country;
		this.skill = skill;
	}

	public Player() {
		super();
	}

	@Override
	public String toString() {
		return player_id + "\t" + name + "\t" + country + "\t" + skill + "\n";
	}

}
