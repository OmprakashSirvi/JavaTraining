package com.javacourse.ques1;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<Player> players = new ArrayList<>();

		String name, skill;

		System.out.println("Provide the number of players to be added");
		Scanner sc = new Scanner(System.in);

		int index = sc.nextInt();
		for (int i = 0; i < index; i++) {

			System.out.println("Enter the player name : ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.println("Select skill of the player");
			System.out.println("All rounder");
			System.out.println("Batsman");
			System.out.println("Bowler");

			switch (sc.nextInt()) {
			case 1:
				skill = "All rounder";
				break;
			case 2:
				skill = "Batsman";
				break;
			case 3:
				skill = "Bowler";
				break;

			default:
				System.out.println("Invalid input");
				sc.close();
				return;
			}

			players.add(new Player(name, skill));
		}

		Collections.sort(players, new PlayerComparator());

		for (Player player : players) {
			System.out.println(player);
		}

		sc.close();
	}
}
