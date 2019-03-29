package com.class7;

public class Task2 {
	public static void main(String[] args) {
		
		//Create a boolean variable workDay and assign true
	    //Create int variable day and assign it to 1
	    //As long as it is workDay print--> "I need a day off" and increment day
	    //Day once day is 6 --> your condition for your loop should become false
	
	boolean workDay=true;
	int day=1;
	
	while (workDay) {
		if (day==6) {
			System.out.println("I am off");
			workDay=false;
		} else {
			System.out.println("I need a day off");
		}

	day++;
	
	
	}
	

	
	
	
	
}
}
