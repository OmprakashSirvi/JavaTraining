package com.javaCourse.ques1;

import java.util.*;

public class Main {
	static TreeSet<String> players = new TreeSet<String>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of matches");
		int matches = sc.nextInt();
		for (int i = 0; i < matches; i++) {
			players.add(sc.nextLine());
		}
		
		System.out.println("Unique players");

		for (String player : players) {
			System.out.println(player);
		}

		sc.close();
	}
}
