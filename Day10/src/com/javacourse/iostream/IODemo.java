package com.javacourse.iostream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IODemo {
	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream(
					new File("C:/Users/158300/OneDrive - Arrow Electronics, Inc/Desktop/old url.txt"));
			System.out.println("File opened");

			int i;

			while ((i = fis.read()) != -1) {

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
