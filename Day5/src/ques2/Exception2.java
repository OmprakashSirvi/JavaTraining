package ques2;

import java.util.Scanner;

public class Exception2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of overs : ");
		if (!sc.hasNextInt()) {
			System.out.println("Enter valid overs");
			sc.close();
			return;
		}
		int overs = sc.nextInt();

		if (overs < 0) {
			System.out.println("Enter positive overs");
			sc.close();
			return;
		}

		int[] runs = new int[overs];

		System.out.println("Enter runs scored in each over : ");
		for (int i = 0; i < overs; i++) {
			if (!sc.hasNextInt()) {
				System.out.println("Enter valid score");
				sc.close();
				return;
			}
			runs[i] = sc.nextInt();
		}

		System.out.println("Enter over number : ");
		if (!sc.hasNextInt()) {
			System.out.println("Enter valid over");
			sc.close();
			return;
		}
		int index = sc.nextInt();

		try {
			System.out.println("Runs is  : " + runs[index - 1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter valid over");
			System.out.println(e);
		} finally {
			sc.close();
		}
	}
}
