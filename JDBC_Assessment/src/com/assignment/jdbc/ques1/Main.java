package com.assignment.jdbc.ques1;

import java.sql.SQLException;
import java.util.ArrayList;

import com.assignment.jdbc.ques1.dao.PlayerDAO;
import com.assignment.jdbc.ques1.model.Player;

public class Main {

	public static void main(String[] args) {
		ArrayList<Player> playerList = new ArrayList<>();
		System.out.println("All the players are : ");
		PlayerDAO playerdao = new PlayerDAO();

		try {
			playerList = playerdao.getAllPlayers();
		} catch (SQLException e) {
			System.out.println("Sql Exception : " + e);
			return;
		}
		
		for (Player player : playerList) {
			System.out.println(player);
		}
	}

}
