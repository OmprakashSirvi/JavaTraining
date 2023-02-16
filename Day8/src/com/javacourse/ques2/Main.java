package com.javacourse.ques2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Team> teams = new ArrayList<>();
		String name;
		long numberOfMatches;
		Scanner sc = new Scanner(System.in);

		int index = sc.nextInt();
		for (int i = 0; i < index; i++) {
			System.out.println("Enter team " + i + 1 + " detail");
			System.out.println("Enter name");
			sc.nextLine();
			name = sc.nextLine();

			System.out.println("Enter number of matches");
			numberOfMatches = sc.nextLong();

			teams.add(new Team(name, numberOfMatches));
		}

		Collections.sort(teams, new TeamComparator());

		for (Team team : teams) {
			System.out.println(team);
		}

		sc.close();
	}

}
