package com.assessment.final2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		if (!sc.hasNextInt()) {
			System.out.println("Invalid Input");
			sc.close();
			return;
		}

		int index = sc.nextInt();

		if (index < 3) {
			System.out.println("Invalid Input");
			sc.close();
			return;
		}

		ArrayList<Integer> nums = new ArrayList<>();
		
		for (int i = 0; i < index; i++) {
			if (!sc.hasNextInt()) {
				System.out.println("Invalid Input");
				sc.close();
				return;
			}
			int num = sc.nextInt();
			if (num < 0) {
				System.out.println("Invalid Input");
				sc.close();
				return;
			}
			nums.add(num);
		}
		
		Collections.sort(nums, Collections.reverseOrder());
		System.out.println(nums.get(0) * nums.get(2));

		sc.close();
	}

}
