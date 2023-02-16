package com.collectionframework.ques1;

import java.util.*;

public class Main {
	static LinkedList<String> details = new LinkedList<String>();

	static public void printDetails() {
		System.out.println("\nPlayer details : ");
		for (String detail : details) {
			System.out.println(detail);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		System.out.println("Enter the player details");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter player name : ");
		Main.details.add(sc.next());

		System.out.println("Enter player age : ");
		Main.details.add(sc.next());

		System.out.println("Enter player country : ");
		Main.details.add(sc.next());

		Main.printDetails();

		System.out.println("Enter skill");
		String skill = sc.next();

		System.out.println("Enter position to add the skill");
		
		try {
			Main.details.add(sc.nextInt(), skill);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error occured : " + e);
		}
		
		Main.printDetails();
		
		System.out.println("Enter the position of skill to be removed");
		
		try {
			Main.details.remove(sc.nextInt());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error occured : " + e);
		}
		
		Main.printDetails();

		sc.close();
	}
}
