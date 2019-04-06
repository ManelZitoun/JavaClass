package com.class17_2;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		
		LeapYear year=new LeapYear();
		year.WhenIsLeapYear(); 
		
	}
	
	void WhenIsLeapYear() {
		
		for (int i=0; i<10; i++) {
		
		Scanner scan=new Scanner(System.in); 
		System.out.println("Please enter your guessed leap year");
		int year=scan.nextInt();
		
		
			if (year%4==0) {
				System.out.println("The year is a leap year");
				break;
			} else {
				System.out.println("It is not a leap year");
			}
		}	
		
		
	}

}
