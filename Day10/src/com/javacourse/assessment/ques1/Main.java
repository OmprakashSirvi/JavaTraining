package com.javacourse.assessment.ques1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter name of the team");
		Scanner sc = new Scanner(System.in);

		String name = sc.nextLine();
		Team t = new Team(name, null);
		int index = 0;

		while (index != 4) {
			System.out.println("1: Add players");
			System.out.println("2: Delete Players");
			System.out.println("3: Display Players");
			System.out.println("4: Exit");
			System.out.println("Enter your choice");
			sc.nextLine();
			index = sc.nextInt();
			switch (index) {
			case 1:
				System.out.println("Enter the detail of player in csv format");
				String details = sc.nextLine();

				t.addPlayerToTeam(Player.createPlayer(details));
				break;
			case 2:
				System.out.println("Enter the name of the player to be deleted");
				String remPlayer = sc.nextLine();
				if (t.removePlayerFromTeam(remPlayer))
					System.out.println("Player successfully deleted");

				else
					System.out.println("Player not found");

				break;

			case 3:
				t.displayPlayers();
				break;
			case 4:
				sc.close();
				return;

			default:
				System.out.println("Enter a valid choice");
			}
		}

		sc.close();
	}

}
