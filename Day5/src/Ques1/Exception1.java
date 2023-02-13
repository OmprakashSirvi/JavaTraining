package Ques1;

import java.util.*;

public class Exception1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter runs : ");
		if (!sc.hasNextInt()) {
			System.out.println("Enter valid Number : ");
			sc.close();
			return;
		}
		int runs = sc.nextInt();

		System.out.println("Enter overs : ");
		if (!sc.hasNextFloat() || !sc.hasNextInt()) {
			System.out.println("Enter valid Number");
			sc.close();
			return;
		}
		float overs = sc.nextFloat();

		if (overs == 0) {
			System.out.println("Your run rate cannot be calculateds as overs is 0");
			sc.close();
			return;
		}

		float runRate = runs / overs;
		System.out.println("Your run rate is : " + String.format("%.2f", runRate));

		sc.close();
	}
}
