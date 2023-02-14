package com.javaCourse.dateTimeLearn;

import java.time.*;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateTimeMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);

		String time = sc.next();

		try {
			LocalTime startTime = LocalTime.parse(time);
			System.out.println(startTime.getHour());

		} catch (DateTimeParseException e) {
			System.out.println("Enter valid time");

		} finally {
			sc.close();
		}

	}

}
