package com.javacourse.mysql.model;

public class Team {
	private int team_id;
	private String team_name;
	private String short_name;
	private String owner_name;

	public int getTeam_id() {
		return team_id;
	}

	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	public String getShort_name() {
		return short_name;
	}

	public void setShort_name(String short_name) {
		this.short_name = short_name;
	}

	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	public Team(int team_id, String team_name, String short_name, String owner_name) {
		super();
		this.team_id = team_id;
		this.team_name = team_name;
		this.short_name = short_name;
		this.owner_name = owner_name;
	}

	public Team() {

	}

	@Override
	public String toString() {
		return "team_id=" + team_id + ", team_name=" + team_name + ", short_name=" + short_name + ", owner_name="
				+ owner_name + "\n";
	}

}
