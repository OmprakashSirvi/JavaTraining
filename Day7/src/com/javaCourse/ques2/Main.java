package com.javaCourse.ques2;

import java.time.LocalDate;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		TreeSet<Match> matches = new TreeSet<Match>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of matches");
		int numMatches = sc.nextInt();

		for (int i = 0; i < numMatches; i++) {
			System.out.println("Enter match date in (yyyy-MM-dd)");
			LocalDate t = LocalDate.parse(sc.next());

			System.out.println("Enter team 1");
			String teamOne = sc.next();

			System.out.println("Enter team 2");
			String teamTwo = sc.next();

			Match m = new Match(t, teamOne, teamTwo);
			matches.add(m);
		}
		System.out.println("----------------");

		for (Match match : matches) {
			System.out.println(match);
		}

		sc.close();
	}
}
