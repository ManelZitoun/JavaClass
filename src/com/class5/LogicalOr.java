package com.class5;

public class LogicalOr {
	public static void main(String[] args) {
	
		//we have 7 days/week
		// if days are from 1-5 --> weekdays
		// if days are from 6-7 --> weekend 
		// otherwise day is not valid
		
		int day=2;
		
		if (day==1 || day ==2 || day==3 || day==4 || day==5) {
			System.out.println("It is a weekday");
		} else if (day==6 || day==7) {
			System.out.println("It is a weekend");
		} else {
			System.out.println("Day is not valid");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
