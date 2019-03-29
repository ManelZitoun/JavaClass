package com.class6;

import java.util.Scanner;

public class ScannerCalculator {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number");
		int a = scan.nextInt();
		System.out.println("Please enter second number");
		int b = scan.nextInt();
		System.out.println("Please enter arithmetic operations +,-,/,*");
		char operator=scan.next().charAt(0);
		
		
		int results=0;
				
		

		switch (operator) {
		
		case '+':
			results=a+b;
			break;
		case '-':
			results=a-b;
			break;
		case'/':
			results=a/b;
			break;
		case'*':
			results=a*b;
			break;
		default:
			System.out.println("Value does not exist");
		}
		
		System.out.println("The results is "+results);
		

		

	}

}
