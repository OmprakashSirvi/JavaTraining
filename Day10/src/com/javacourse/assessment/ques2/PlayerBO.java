package com.javacourse.assessment.ques2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PlayerBO {
	public List<Player> findPlayer(List<Player> playerList, String nationality) {
		ArrayList<Player> retPlayers = new ArrayList<>();
		for (Player player : playerList) {
			if (player.getNationality().equals(nationality)) {
				retPlayers.add(player);
			}
		}
		return retPlayers;
	}

	public List<Player> findPlayer(List<Player> playerList, LocalDate dateOfBirth) {
		ArrayList<Player> retPlayers = new ArrayList<>();
		for (Player player : playerList) {
			if (player.getDateOfBirth().equals(dateOfBirth)) {
				retPlayers.add(player);
			}
		}

		return null;
	}

	public List<Player> findPlayer(List<Player> playerList, double powerRating) {
		ArrayList<Player> retPlayers = new ArrayList<>();

		for (Player player : playerList) {
			if (player.getPowerRating() == powerRating) {
				retPlayers.add(player);
			}
		}

		return null;
	}
}
