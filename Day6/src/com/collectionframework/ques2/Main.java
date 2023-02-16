package com.collectionframework.ques2;

import java.util.*;

public class Main {
	static ArrayList<String> teams = new ArrayList<String>();

	public static void printList() {
		for (String team : teams) {
			System.out.println(team);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter team names");
		for (int i = 0; i < 5; i++) {
			teams.add(sc.nextLine());
		}

		System.out.println("Teams are : ");
		Main.printList();

		System.out.println("Enter swap positions");
		try {
			
			Collections.swap(teams, 0, sc.nextInt());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter valid index number");
			e.printStackTrace();
		}
		Main.printList();


		sc.close();

	}
}
