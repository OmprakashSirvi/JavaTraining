package com.javacourse.assesment.ques3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static ArrayList<Player> playerList = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of players");

		int num = sc.nextInt();
		sc.nextLine();
		String[] details;
		while (num > 0) {
			details = sc.nextLine().split(",");
			playerList.add(new Player(details[0], LocalDate.parse(details[1]), details[2], Integer.parseInt(details[3]),
					Integer.parseInt(details[4]), Integer.parseInt(details[5]), details[6],
					Double.parseDouble(details[7])));
			num--;
		}

		System.out.println("Enter the type of sort");
		System.out.println("1: Sort by number of matches played");
		System.out.println("2: Sort by runs scored");
		System.out.println("3: Sort by power rating");

		num = sc.nextInt();

		switch (num) {
		case 1:
			Collections.sort(playerList);
			break;
		case 2:
			Collections.sort(playerList, new RunComparator());
			break;
		case 3:
			Collections.sort(playerList, new PowerRatingComparator());
			break;
		default:
			System.out.println("Invalid index");
		}
		
		Player.displayPlayers(playerList);
		
		sc.close();
	}
}
