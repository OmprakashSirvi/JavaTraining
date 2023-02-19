package com.javacourse.assesment.ques3;

import java.time.LocalDate;
import java.util.List;

public class Player implements Comparable<Player> {
	private String name;
	private LocalDate dateOfBirth;
	private String skill;
	private int numberOfMatches;
	private int runs;
	private int wickets;
	private String nationality;
	private double powerRating;

	public Player(String name, LocalDate dateOfBirth, String skill, int numberOfMatches, int runs, int wickets,
			String nationality, double powerRating) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.skill = skill;
		this.numberOfMatches = numberOfMatches;
		this.runs = runs;
		this.wickets = wickets;
		this.nationality = nationality;
		this.powerRating = powerRating;
	}

	public static Player createPlayer(String detail) {
		String[] details = detail.split(",");
		LocalDate dateOfBirth = LocalDate.parse(details[1]);
		int numberOfMatches = Integer.parseInt(details[3]);
		int runs = Integer.parseInt(details[4]);
		int wickets = Integer.parseInt(details[5]);
		double powerRating = Double.parseDouble(details[7]);

		return new Player(details[0], dateOfBirth, details[2], numberOfMatches, runs, wickets, details[6], powerRating);
	}
	
	static public void displayPlayers(List<Player> playerList) {
		System.out.println("Name\tDateofBirth\tSkill\tNoOfMatches\tRuns\tWickets\tNationality\tRating");
		for (Player player : playerList) {
			System.out.print(player.getName() + "\t");
			System.out.print(player.getDateOfBirth() + "\t");
			System.out.print(player.getSkill() + "\t");
			System.out.print(player.getNumberOfMatches() + "\t");
			System.out.print(player.getRuns() + "\t");
			System.out.print(player.getWickets() + "\t");
			System.out.print(player.getNationality() + "\t");
			System.out.println(String.format("%.1f", player.getPowerRating()) + "\t");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public int getNumberOfMatches() {
		return numberOfMatches;
	}

	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public double getPowerRating() {
		return powerRating;
	}

	public void setPowerRating(double powerRating) {
		this.powerRating = powerRating;
	}
	
	

	@Override
	public String toString() {
		return "name=" + name + ", dateOfBirth=" + dateOfBirth + ", skill=" + skill + ", numberOfMatches="
				+ numberOfMatches + ", runs=" + runs + ", wickets=" + wickets + ", nationality=" + nationality
				+ ", powerRating=" + powerRating;
	}

	@Override
	public int compareTo(Player o) {
		if (this.getNumberOfMatches() > o.getNumberOfMatches()) return 1;
		else if (this.getNumberOfMatches() < o.getNumberOfMatches()) return -1;
		return 0;
	}

}
