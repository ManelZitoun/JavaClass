package com.class17_2;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);	
	System.out.println("Enter first number");
	int start=scan.nextInt();
	System.out.println("Enter second number");
	int end=scan.nextInt();
	
	int sum=start+end; 
	
	for (int i=start; end>=i; i++) {
		
		if (sum%2==0) {
		sum=start+end; 
		System.out.println(sum+" even");
		break;
		} else {
			sum=start+end; 
			System.out.println(sum+" odd");
			break;

		}
	}
		
		
		
		
	}

}
