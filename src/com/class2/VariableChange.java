package com.class2;

public class VariableChange {
	
	public static void main(String[] args) {
//Values of variables can be changed
		String name=("Jane");
		
		String lastName=("Smith");
		lastName="Johnson";  
		
		System.out.println(lastName);
		
		char grade='B';
		//char grade='A'; does not work 
		//In order to change the variable use this code:
		
		grade='A';
		
		//When the code is outputted it will show the A grade not B
		
		System.out.println(grade);
		
		String city=("Sterling");
		//Printing value of city
		
		city="NewYork";
		//Changing the value of the city from Fairfax to NY
		
		System.out.println(city); 
		//Will print out NY 
		
		
		
		
		
		
		
		
	}

}
