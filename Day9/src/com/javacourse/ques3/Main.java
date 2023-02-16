package com.javacourse.ques3;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		HashMap<Integer, Player> players = new HashMap<>();

		System.out.println("Enter number of players");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(), capNumber;
		String name, team, skills;

		for (int i = 0; i < num; i++) {
			System.out.println("Enter detaisl of player " + i);
			capNumber = sc.nextInt();
			name = sc.nextLine();
			team = sc.nextLine();
			skills = sc.nextLine();

			players.put(capNumber, new Player(name, team, skills));
		}
		
		System.out.println("\nPlayer details ---");
		System.out.println(players);

		sc.close();
	}
}
