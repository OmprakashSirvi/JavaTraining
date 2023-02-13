package ques3;

import java.util.Scanner;

public class ExceptionMain {
	static void checkAge(int age) throws InvalidAgeRangeException{
		if (age < 19) {
			throw new InvalidAgeRangeException("Age must be larger than 19"); 
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the player : ");
		String name = sc.nextLine();
		
		System.out.println("Enter the age of the player : ");
		if (!sc.hasNextInt()) {
			System.out.println("Enter valid age...");
			sc.close();
			return;
		}
		
		int age = sc.nextInt();
		try {
			checkAge(age);
		}catch(InvalidAgeRangeException e) {
			System.out.println("There was an error..");
			System.out.println(e);
			sc.close();
			return;
		}
		
		System.out.println("The name of the player : " + name + 
				" \nAge of the player : " + age);
		sc.close();
	}
}
