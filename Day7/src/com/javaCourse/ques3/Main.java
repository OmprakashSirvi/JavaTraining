package com.javaCourse.ques3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static ArrayList<Team> teamList = new ArrayList<>();

	static public Team teamExists(String name) {
		for (Team team : Main.teamList) {
			if (team.getName().equals(name))
				return team;
		}
		return null;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);

		System.out.println("Enter number of inputs");

		String[] inp;

		int index = Integer.parseInt(br.readLine());

		for (int i = 0; i < index; i++) {
			System.out.print("Current Input : " + i + " => ");

			inp = br.readLine().split("\\|");

			Team currTeam = Main.teamExists(inp[0]);

			if (currTeam != null) {
				currTeam.addPlayer(inp[1]);
			} else {
				Team team2 = new Team(inp[0]);
				team2.addPlayer(inp[1]);
				teamList.add(team2);
			}
		}

		System.out.println("Team and players in ascending order");
		for (Team team : Main.teamList) {
			System.out.println(team);
		}

		try {
			r.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
