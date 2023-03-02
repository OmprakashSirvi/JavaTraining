package com.javacourse.mysql.dbo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.javacourse.mysql.config.ConnectionConfig;
import com.javacourse.mysql.model.Team;

public class TeamDBO {
	public ArrayList<Team> getAllTeam() throws SQLException {

		java.sql.Connection connection = ConnectionConfig.connect();
		PreparedStatement prepareStatement = connection.prepareStatement("select * from team");
		ResultSet resultSet = prepareStatement.executeQuery();

		ArrayList<Team> teamList = new ArrayList<>();

		while (resultSet.next()) {
			teamList.add(new Team(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
					resultSet.getString(4)));
		}
		connection.close();
		return teamList;
	}

	public Team getTeamById(int team_id) throws SQLException {
		java.sql.Connection connection = ConnectionConfig.connect();
		PreparedStatement prepareStatement = connection.prepareStatement("select * from team where team_id=?");
		prepareStatement.setInt(1, team_id);

		ResultSet resultSet = prepareStatement.executeQuery();

		if (resultSet.next()) {
			Team retTeam = new Team(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
					resultSet.getString(4));
			
			connection.close();
			return retTeam;
		}
		connection.close();
		return null;
	}

	public Team updateTeamById(int team_id, Team team) throws SQLException {
		java.sql.Connection connection = ConnectionConfig.connect();
		PreparedStatement prepareStatement = connection
				.prepareStatement("update team set team_id=?, team_name=?, shortname=?, owner=?");
		prepareStatement.setInt(1, team.getTeam_id());
		prepareStatement.setString(2, team.getTeam_name());
		prepareStatement.setString(3, team.getShort_name());
		prepareStatement.setString(4, team.getOwner_name());

		ResultSet resultSet = prepareStatement.executeQuery();

		while (resultSet.next()) {

			Team updatedTeam = new Team(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
					resultSet.getString(4));
			connection.close();
			return updatedTeam;
		}

		connection.close();
		return null;
	}

	public boolean createTeam(Team newTeam) throws SQLException {
		java.sql.Connection connection = ConnectionConfig.connect();
		PreparedStatement prepareStatement = connection.prepareStatement("insert into team values(?, ?, ?, ?)");

		prepareStatement.setInt(1, newTeam.getTeam_id());
		prepareStatement.setString(2, newTeam.getTeam_name());
		prepareStatement.setString(3, newTeam.getShort_name());
		prepareStatement.setString(4, newTeam.getOwner_name());
		
		if (prepareStatement.execute()) {
			connection.close();
			return true;
		}
		
		return false;
	}
	
	public boolean deleteTeam(int team_id) throws SQLException {
		java.sql.Connection connection = ConnectionConfig.connect();

		PreparedStatement preparedStatement = connection.prepareStatement("delete from team where team_id=?");
		preparedStatement.setInt(1, team_id);
		
		if (preparedStatement.execute()) {
			connection.close();
			return true;
		}
		
		return false;
		
	}
}
