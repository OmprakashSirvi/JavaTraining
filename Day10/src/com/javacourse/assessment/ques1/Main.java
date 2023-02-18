package com.javacourse.assessment.ques1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter name of the team");
		Scanner sc = new Scanner(System.in);

		String name = sc.nextLine();
		int index = 0;

		while (index != 4) {
			System.out.println("1: Add players");
			System.out.println("2: Delete Players");
			System.out.println("3: Display Players");
			System.out.println("4: Exit");
			System.out.println("Enter your choice");
			index = sc.nextInt();
			switch (index) {
			case 1:
				System.out.println("Enter the detail of player in csv format");
				String details = sc.nextLine();

			}
		}

		sc.close();
	}

}
