package com.javacourse.assessment.ques1;

import java.util.LinkedList;

public class Team {
	private String name;
	private LinkedList<Player> playerList;

	public Team(String name, LinkedList<Player> playerList) {
		super();
		this.name = name;
		this.playerList = playerList;
	}

	public void addPlayerToTeam(Player player) {
		this.playerList.add(player);
	}

	public Boolean removePlayerFromTeam(String name) {
		int i = 0;
		for (Player player : playerList) {
			if (player.getName().equals(name)) {
				playerList.remove(i);
				return true;
			}
			i++;
		}
		return false;
	}
	
	public void displayPlayers() {
		if (this.playerList.isEmpty()) {
			System.out.println("No Players to show");
			return ;
		}
		System.out.println("Players in : " + this.name);
		System.out.println("Name\t\tDateofBirth\t\tSkill\t\tNoOfMatches\t\tRuns\t\tWickets\t\tNationality\t\tRating");
		for (Player player : playerList) {
			System.out.print(player.getName() + "\t");
			System.out.print(player.getDateOfBirth() + "\t");
			System.out.print(player.getSkill() + "\t");
			System.out.print(player.getNumberOfMatches() + "\t");
			System.out.print(player.getRuns() + "\t");
			System.out.print(player.getWickets() + "\t");
			System.out.print(player.getNationality() + "\t");
			System.out.print(String.format("%.1f", player.getPowerRating()) + "\t");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LinkedList<Player> getPlayerList() {
		return playerList;
	}

	public void setPlayerList(LinkedList<Player> playerList) {
		this.playerList = playerList;
	}

}
