package com.class5;

public class LogicalOperators {
	public static void main(String[] args) {
		
	// if # is between 1-10  --> # is small
		// if # is between 11-100 --> # is medium
	// if # is between 101-1000 --> # is large
		
	int num=115;
	//true AND false --> false
	if (num>=1 && num <=10) {
		System.out.println("number is small");
		// true AND true --> true
	} else if (num>=11 && num<=100) {
		System.out.println("number is medium");
		// false and true --> false
	} else if (num>=101 && num<=1000) {
		System.out.println("number is large");
	} else {
		System.out.println("number is not in our range");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
