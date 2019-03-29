package com.class6;

import java.util.Scanner;

public class SwitchString {
	public static void main(String[] args) {
		// Prompt user to enter their country
		//Based on country --> specify favorite food 
		
		Scanner scan=new Scanner(System.in); 
		System.out.println("Please enter which country you're from");
		String country=scan.nextLine();
		
		String favoriteFood;
		
		switch (country) {
		
		case "USA":
			favoriteFood="burger";
			break;
		case "Morroco":
			favoriteFood="tajine";
			break;
		case "Tunisia":
			favoriteFood="Couscous";
			break;
		case "Pakistan":
			favoriteFood="Biryani";
			break;
		case "Indian":
			favoriteFood="Curry";
			break;
		case "Afghanistan":
			favoriteFood="Palau";
			break;
		
		default:
			favoriteFood="Unknown"; 
		}
	
		System.out.println("I am from "+country+" and my favorite food is "+favoriteFood);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
