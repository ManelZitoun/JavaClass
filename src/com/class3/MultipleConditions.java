package com.class3;

public class MultipleConditions {
	public static void main(String[] args) {
		
		int day=5;
		
		if (day==1) {
			System.out.println("Monday");
		} else if (day==2) {
			System.out.println("Tuesday");
		} else if (day==3) {
			System.out.println("Wednesday");
		} else if (day==4) {
			System.out.println("Thursday");
		} else if (day==5) {
			System.out.println("Friday");
		} else if (day==6) {
			System.out.println("Saturday");
		} else {
			System.out.println("Sunday");
		} 
		
		
		
		//if we change variable to 15 then the output will be Sunday
		// if we change else to else if (day==7) output will be sunday and add else to "IDK" 
		//the output will be idk
		
		// OR DO IT THIS WAY 
		
		int day1=15;
		
		if (day1==1) {
			System.out.println("Monday");
		} else if (day1==2) {
			System.out.println("Tuesday");
		} else if (day1==3) {
			System.out.println("Wednesday");
		} else if (day1==4) {
			System.out.println("Thursday");
		} else if (day1==5) {
			System.out.println("Friday");
		} else if (day1==6) {
			System.out.println("Saturday");
		} else if (day1==7) {
			System.out.println("Sunday");
		} else {
			System.out.println("I am not sure");
		}
		
		
		
		
		
		
		
		
		
	}
}
