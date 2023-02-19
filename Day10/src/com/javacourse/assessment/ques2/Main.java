package com.javacourse.assessment.ques2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static ArrayList<Player> playerList = new ArrayList<>();

	public static void main(String[] args) {
		PlayerBO search = new PlayerBO();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of players");

		int num = sc.nextInt();
		String[] details;
		while (num > 0) {
			details = sc.nextLine().split(",");
			playerList.add(new Player(details[0], LocalDate.parse(details[1]), details[2], Integer.parseInt(details[3]),
					Integer.parseInt(details[4]), Integer.parseInt(details[5]), details[6],
					Double.parseDouble(details[7])));
			num--;
		}

		System.out.println("Enter the search type");
		num = sc.nextInt();

		System.out.println("1: By nationality");
		System.out.println("1: By Date of Birth");
		System.out.println("1: By power rating");

		switch (num) {
		case 1:
			System.out.println("Enter nationality");
			search.findPlayer(playerList, sc.next());
			break;
		case 2:
			System.out.println("Enter Date of birth");
			search.findPlayer(playerList, LocalDate.parse(sc.next()));
			break;
		case 3:
			System.out.println("Enter power rating");
			search.findPlayer(playerList, sc.nextDouble());
			break;
		default:
			System.out.println("Enter a valid index");
		}

		sc.close();
	}

}
