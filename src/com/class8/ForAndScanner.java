package com.class8;

import java.util.Scanner;

public class ForAndScanner {
	public static void main(String[] args) {
		
		//prompt user to enter 2 int & compare
		//At the end print largest #
		
		for (int i=1; i<=5; i++) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your first number");
		int num1=scan.nextInt();
		System.out.println("Please enter your second number");
		int num2=scan.nextInt();
		
		int lar=0;
		
		if (num1>num2) {
			lar=num1;
		} else if (num2>num1) {
			lar=num2;
		}else {
			System.out.println("They are equal");
			System.exit(1);
		}
		
		System.out.println(lar+" is the largest number");
		
	
		}
	
	
	
	
	
	
	
	
	}
}
