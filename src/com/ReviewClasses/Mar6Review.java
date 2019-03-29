package com.ReviewClasses;

import java.util.Scanner;

public class Mar6Review {
	public static void main(String[] args) {
//	/ Write a program to find out what to do for the following temperatures
    // Temperatures is greater than 100 print out Stay inside it's too hot
    // temperatures is greater than 50 and less than 99 print out Wear winter clothes
    // temperatures is greater than 30 and less than 49 print out Wear winter clothes
    // temperatures is greater than 10 and less than 29 print out Stay inside it's too cold
    // lastly if the temperature  is lower than that print out Call for help it's too cold outside
	
//	Scanner scan=new Scanner(System.in);
//	System.out.println("What is the temp?");
//	int temp=scan.nextInt();
//	
//	String action;
//	
//		if (temp>=100) {
//		action="Stay inside, it is too hot";
//	} else if (temp>50 && temp<99) {
//		action="Wear summer clothes";
//	} else if (temp>30 && temp<49) {
//		action="Wear winter clothes";
//	} else if (temp>10 && temp<29) {
//		action="Stay inside it's too cold";
//	} else {
//		action="Call for help it's too cold outside";
//	}
// System.out.println(action);
		
		Scanner scan=new Scanner(System.in);
		System.out.println("How old are you?");
		int age=scan.nextInt();
		
		String user; 
		
		if (age<18) {
		user="Too young";	
		} else if (age>=18 && age<=35) {
			user="Young person";
		} else if (age>=36 && age<=99) {
			user="You are middle aged";
		} else {
			user="You are too old";
		}
		System.out.println(user);
}
}