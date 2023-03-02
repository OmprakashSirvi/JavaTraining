package com.javacourse.mysql;

import java.sql.SQLException;
import java.util.Scanner;

import com.javacourse.mysql.dbo.TeamDBO;
import com.javacourse.mysql.model.Team;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TeamDBO teamDBO = new TeamDBO();

		int index = 1;

		int team_id;
		String team_name, short_name, owner_name;


		while (index > 0) {
			System.out.println(
					"1: Add team\r\n" + "2: View teams\r\n" + "3: Delete team\r\n" + "4: Update Team\r\n" + "5: Exit");
			index = sc.nextInt();
			switch (index) {

			case 1:
				System.out.println("Inserting document");
				System.out.println("Enter team id");
				team_id = sc.nextInt();
				System.out.println("Enter team name");
				team_name = sc.next();
				System.out.println("Enter team short name");
				short_name = sc.next();
				System.out.println("Enter team owner name");
				owner_name = sc.next();

				Team newTeam = new Team(team_id, team_name, short_name, owner_name);

				System.out.println(newTeam);

				try {
					teamDBO.createTeam(newTeam);
					System.out.println("New team created");
				} catch (SQLException e) {
					System.out.println("SQL Exception : " + e);
				}

				break;
			case 2:
				System.out.println("Getting document");

				try {
					System.out.println(teamDBO.getAllTeam());
				} catch (SQLException e) {
					System.out.println("SQL Exception : " + e);
				}

				break;
			case 3:
				System.out.println("Deleting document");
				System.out.println("Enter the team_id ");
				team_id = sc.nextInt();

				try {
					if (!teamDBO.deleteTeam(team_id)) {
						System.out.println("Not deleted, try again");
						break;
					}
					System.out.println("Deleted Successfully");
				} catch (SQLException e) {
					System.out.println("SQL Exception : " + e);
				}
				break;

			case 4:
				System.out.println("Updating document");
				System.out.println("Enter Id of the document to be updated");
				team_id = sc.nextInt();
				try {
					Team team = teamDBO.getTeamById(team_id);
					if (team == null) {
						System.out.println("No team found by that id ..");
						break;
					}

					System.out.println("What you want to update : \r\n" + "1: team_name\r\n" + "2: short_name\r\n"
							+ "3: owner_name");

					int updateIndex = sc.nextInt();

					switch (updateIndex) {
					case 1:
						System.out.println("Enter team_name");
						team_name = sc.next();
						team.setTeam_name(team_name);

						break;
					case 2:
						System.out.println("Enter short_name");
						short_name = sc.next();
						team.setShort_name(short_name);
						break;
					case 3:
						System.out.println("Enter owner_name");
						owner_name = sc.next();
						team.setOwner_name(owner_name);
						break;
					default:
						System.out.println("Invalid input");
					}

					teamDBO.updateTeamById(team_id, team);

				} catch (SQLException e) {
					System.out.println("SQL Exception : " + e);
				}

				break;
			default:
				System.out.println("Bye");
				sc.close();
				return;
			}
		}

//		try {
//			System.out.println(teamDBO.getAllTeam());
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}

		sc.close();
	}
}
