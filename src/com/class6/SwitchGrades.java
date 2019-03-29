package com.class6;

import java.util.Scanner;

public class SwitchGrades {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in); 
	System.out.println("Please enter your grade");
	String grade=scan.nextLine();
	
	String explain;
	
	switch (grade) {
	
	case "A":
		explain="Excellent";
		break;
	case "B":
		explain="Good";
		break;
	case "C": 
		explain="Average";
		break;
	case "D":
		explain="Bad";
		break;
	default:
		explain="Unacceptable";
	
	}
		
		
		System.out.println("I recieved a "+grade+" and this grade is "+explain);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
