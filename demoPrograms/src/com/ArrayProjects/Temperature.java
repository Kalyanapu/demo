package com.ArrayProjects;

import java.util.Scanner;

public class Temperature {

	public void dayTemps() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of days:");
		int numOfDays = sc.nextInt();

		int[] temps = new int[numOfDays];

		for (int i = 0; i < numOfDays; i++) {
			System.out.println("Enter the day" + " " + (i + 1) + " " + "temperature");
			temps[i] = sc.nextInt();

		}

		int avg = sum / numOfDays;
		System.out.println("The avg of entered temperatures are:" + " " + avg);

	}

}
