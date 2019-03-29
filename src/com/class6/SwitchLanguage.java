package com.class6;

import java.util.Scanner;

public class SwitchLanguage {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Which country are you from?");
	String country=scan.nextLine();
	
	String language;
	
	switch (country) {
	
	case "Tunisia":
		language="Arabic";
		break;
	case "Pakistan":
		language="Urdu";
		break;
	case "Russia":
		language="Russian";
		break;
	case "USA":
		language="English";
		break;
	case "Bolivia":
		language="Spanish";
		break;
	default: 
		language="Unknown";
		
	
	}
		
		System.out.println("I am from "+country+" and I speak "+language);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
