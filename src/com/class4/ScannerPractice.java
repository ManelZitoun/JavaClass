package com.class4;

import java.util.Scanner;

public class ScannerPractice {
	public static void main(String[] args) {
		
//	Scanner scan=new Scanner(System.in);
//	System.out.println("How many years have you worked?");
//	int years=scan.nextInt();
//	System.out.println("What is your annual salary?");
//	int salary=scan.nextInt();
//	
//	System.out.println(years);
//	System.out.println(salary);
//	
//	if (years>=5) {
//		System.out.println("You are eligible for a bonus");
//	if (salary>50000) {
//		System.out.println("Your bonus will be 5000");
//	} else {
//		System.out.println("Your bonus will be 3000");
//	} } else {
//		System.out.println("You are not eligible for a bonus");
//	} 
	
	Scanner scan1=new Scanner(System.in);
    System.out.println("Please enter your age");
    int age=scan1.nextInt();
    
    if (age>=18) {
      System.out.println("You are eligible to vote");
    } else {
      System.out.println("You are not eligible to vote");
    }

		
		
		
		
	}
}
