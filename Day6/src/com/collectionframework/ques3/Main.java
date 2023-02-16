package com.collectionframework.ques3;

import java.util.*;

public class Main {
	static ArrayList<String> s14 = new ArrayList<String>();
	static ArrayList<String> s15 = new ArrayList<String>();
	
	
	public static void printList(ArrayList<String> al) {
		for (String player : al) {
			System.out.println(player);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the top 5 scorers in IPL season 14");
		for (int i = 0; i < 5; i++) {
			s14.add(sc.nextLine());
		}

		System.out.println("Enter the top 5 scorers in IPL season 15");
		for (int i = 0; i < 5; i++) {
			s15.add(sc.nextLine());
		}
		
		s14.retainAll(s15);
		
		System.out.println("Consitent players are : ");
		Main.printList(s14);

		sc.close();
	}
}
