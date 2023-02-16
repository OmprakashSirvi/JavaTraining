package com.javacourse.ques1;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		HashMap<String, Integer> players = new HashMap<>();

		String name, cont = "yes";
		int wickets;

		Scanner sc = new Scanner(System.in);

		while (cont.equals("yes")) {

			System.out.println("Enter player name");
			name = sc.nextLine();

			System.out.println("Enter wickets - seperated by \"|\" symbol. ");
			 wickets = sc.next().split("\\|").length;

			players.put(name, wickets);
			System.out.println("Do you want to add another player (yes/no)\r\n");
			cont = sc.next();
		}

		cont = "yes";
		while (cont.equals("yes")) {
			System.out.println("Enter the player name to search : ");
			name = sc.next();

			if (players.containsKey(name)) {
				System.out.println("Wicket count : " + players.get(name));
			} else
				System.out.println("No player found with name " + name);

			System.out.println("Do you want to search another player(yes/no)");
			cont = sc.next();

		}
		sc.close();

	}
}
