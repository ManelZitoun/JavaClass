package com.class4;

public class NestedIf {
	public static void main(String[] args) {
		
	// write a program to check work eligibility 
		// if user is younger than 16 --> not allowed to work
	//otherwise allowed to work. If user is younger than 64 goes to work 
		//if user is older than 64 enjoy your life
		
	
		int age=65;
		int eligibleAge=16;
		int retirementAge=64;
		
		if (age<eligibleAge) {
			System.out.println("You are too youg, no work for you");
		} else {
			System.out.println("You are eligible to work");
			if (age<retirementAge) {
				System.out.println("Go work hard");
			} else {
				System.out.println("Please enjoy your lifte. No need to work");
			}
		} 
		
		
		
		
		
		
		
		
		
	}
}
