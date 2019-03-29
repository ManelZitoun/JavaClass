package com.class6;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("What is the temperature outside");
		int temp = scan.nextInt();
		boolean snow;
		boolean rain;
		boolean sunny;

		String activity;

		if (temp >= 40 && temp <= 80) {
			System.out.println("Is it raining?");
			rain = scan.nextBoolean();
			if (rain) {
				activity = "We will watch a movie";
			} else {
				activity = "We will go hiking";
			}
		} else if (temp >= 25 && temp <= 40) {
			System.out.println("Is it snowing?");
			snow = scan.nextBoolean();
			if (snow) {
				activity = "We will go snowboarding";
			} else {
				activity = "We will code";
			}
		} else if (temp > 80) {
			System.out.println("Is it sunny?");
			sunny = scan.nextBoolean();
			if (sunny) {
				activity = "We will go to the beach";
			} else {
				activity = "We will code some more";
			}
		} else {
			System.out.println("Please enter diff temp");
			activity = "Unknown";
		}

		System.out.println(activity);

	}
}
