package com.javacourse.assessment.ques5;

import java.time.LocalDate;
import java.util.ArrayList;
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

		System.out.println("\nThe nationality with maximum players : " + Player.highestCount(playerList));

		sc.close();

	}

}
