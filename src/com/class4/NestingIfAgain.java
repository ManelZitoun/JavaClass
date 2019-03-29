package com.class4;

public class NestingIfAgain {
	public static void main(String[] args) {
	
		// declare variable for GPA and having a diploma
		// if user has a diploma --> congrats __> if gpa is higher than 3.5 hire them
		//Otherwise, do not hire
		
		double gpa=3.6;
		double expectedGPA=3.5;
		boolean hasDiploma=false;
		
		if (hasDiploma) {
			//System.out.println("Congrats");
			if (gpa>expectedGPA) {
			//	System.out.println("You are hired"); }
			}
			else {
			System.out.println("Unfortunately we cannot hire you"); 
		} } else {
			System.out.println("Please get your degree");
		}
		
		int money=540;
		int experience=5;
		
		if(money>experience) {
			System.out.println("You make too much money");
			if (experience>money) {
				System.out.println("You have good experience");
			} else {
				System.out.println("You need more experience");
			}} else {
				System.out.println("You have enough money");
			}
		}
		
	
		
		
		
		
		
		
		
	}


