package com.assignment.jdbc.ques1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.assignment.jdbc.ques1.config.ConnectionConfig;
import com.assignment.jdbc.ques1.model.Player;

public class PlayerDAO {
	public ArrayList<Player> getAllPlayers() throws SQLException {
		SkillDAO skilldao = new SkillDAO();
		Connection connect = ConnectionConfig.connect();

		PreparedStatement prepareStatement = connect.prepareStatement("select * from player");

		ResultSet resultSet = prepareStatement.executeQuery();

		ArrayList<Player> playerList = new ArrayList<>();

		while (resultSet.next()) {
			playerList.add(new Player(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
					skilldao.getSkillById(resultSet.getInt(4))));
		}

		prepareStatement.close();
		connect.close();
		return playerList;
	}
}
