package com.class5;

import java.util.Scanner;

public class LogicalOperatorHW {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter the first number");
	int num1=scan.nextInt();
	System.out.println("Please enter the second number");
	int num2=scan.nextInt();
	System.out.println("Please enter the third number");
	int num3=scan.nextInt();
	
	if (num1>num2 && num1>num3) {
		System.out.println("The first number is larger");
	} else if (num2>num1 && num2>num3) {
		System.out.println("The second number is larger");
	} else if (num3>num1 && num3>num2) {
		System.out.println("The third number is larger");
	} else {
		System.out.println("The numbers are equal");
	}
		
		
		
		
		
	}

}
