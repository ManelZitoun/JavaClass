package com.class4;

import java.util.Scanner;

public class CityAndTemperature {
	public static void main(String[] args) {
	// Ask user to enter city and temperature in Fahrenheit 
	// Your program should convert F--> C
	// Your program should say "The temperature in the city _ is _"
		CityAndTemperature he= new CityAndTemperature();
		he.hello("jjjjjjjjj");
		
//	String cityName; - attribute/state that is defined (string) with no action
//	int temp;
// scan is an object and .nextLine is an action/method/behavior 
	
	Scanner scan=new Scanner(System.in); 
	//boolean h=scan.nextBoolean();
	System.out.println("Please enter your city");
	String cityName=scan.nextLine();
	System.out.println("Please enter temperature in Fahrenheit");
	int temp=scan.nextInt();
	
	//boolean b=scan.hasNext();
	
	System.out.println(cityName+temp);
	
//temp=scan.nextInt();
	//farenheit to celsuis formula (F-32)x5/9;
	
	int convertedTemp=(temp-32)*5/9;
	System.out.println(convertedTemp); 
	
		
		
		
		
		

	}
	public void hello(String name) {
		System.out.println(name); 
	}
	
}