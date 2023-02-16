package com.javacourse.ques2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		HashMap<Bowler, ArrayList<Wicket>> bWick = new HashMap<>();

		String[] wickets;

		String cont = "yes", name;
		Scanner sc = new Scanner(System.in);

		while (cont.equals("yes")) {
			ArrayList<Wicket> wicketsArr = new ArrayList<>();

			System.out.println("Enter player name : ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.println("Your name is : " + name);

			System.out.println("Enter wickets - seperated by \"|\" symbol.");
			wickets = sc.next().split("\\|");

			Bowler currBowler = new Bowler(name);
			
			for (String wicket : wickets) {
				wicketsArr.add(new Wicket(wicket, currBowler));
			}
			
			bWick.put(currBowler, wicketsArr);

			System.out.println("Do you want to continue");
			cont = sc.next();
		}

		cont = "yes";

		while (cont.equals("yes")) {
			System.out.println("Enter the player name to be searched");
			
			sc.nextLine();
			name = sc.nextLine();

			if (bWick.containsKey(new Bowler(name))) {
				
				System.out.println(bWick.get(new Bowler(name)));
				
			} else
				System.out.println("No player with that name..");

			System.out.println("Do you want to search another player(yes/no)");
			cont = sc.next();
		}

		sc.close();
	}
}
