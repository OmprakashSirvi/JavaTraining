package com.javaCourse.ques3;

import java.util.ArrayList;
import java.util.Collections;

public class Team {
	private String name;
	private ArrayList<Player> playerList = new ArrayList<>();

	public Team(String name) {
		super();
		this.name = name;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPlayerList(ArrayList<Player> playerList) {
		this.playerList = playerList;
	}
	
	public void addPlayer(String name) {
		this.playerList.add(new Player(name));
	}
	
	public ArrayList<Player> getPlayerList() {
		Collections.sort(playerList);
		return playerList;
	}

	@Override
	public String toString() {
		String players = "";
		for (Player player : playerList) {
			players += "\n--" + player.getName();
		}
		return "\nTeam : name=" + name + players;
	}
	
	
	
}
