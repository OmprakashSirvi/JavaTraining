package com.javaCourse.ques1;

import java.util.*;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		
		String scores, matchType;
		ArrayList<SortScore> matches = new ArrayList<SortScore>();
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter the Matchtype : ");
			matchType = sc.next();
			
			System.out.println("Enter the scores");
			scores = sc.next();
			SortScore ss = new SortScore(matchType, scores);
			
			matches.add(ss);
			ss.start();
		}
		
		for (SortScore ss: matches) {
			ss.join();
			System.out.println(ss.getScores());
		}
		
		sc.close();
	}
}
