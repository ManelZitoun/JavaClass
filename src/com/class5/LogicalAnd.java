package com.class5;

import java.util.Scanner;

public class LogicalAnd {
	public static void main(String[] args) {
	// Ask user to enter age and based on the age we will print:
		// if age is older than 1 but less than 3 --baby 
		// if age is older than 3 but less than 5 --> toddler
		// if age is older than 5 but less than 13 --> kid
		// if age is older than 20 but less than 64 -->adult
		//if age is older or equal to 64-->senior
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Please enter your age");
//		int age=scan.nextInt();
//		
//		if (age>=1 && age<3) {
//			System.out.println("You are a baby");
//		} else if (age>=3 && age<5) {
//			System.out.println("You are a toddler");
//		} else if (age>=5 && age<13) {
//			System.out.println("You are a kid");
//		} else if (age>=13 && age<20) {
//			System.out.println("You are a teenager");
//		} else if (age>=20 && age<64) {
//			System.out.println("You are an adult");
//		} else {
////			System.out.println("You are a senior");
//		}
//		
		Scanner scan1=new Scanner(System.in);
		System.out.println("Please enter height in inches");
		int height=scan1.nextInt();
		
		if (height<60) {
			System.out.println("Short");
		} else if (height>=60 && height<=72) {
			System.out.println("Medium");
		} else if (height>=72) {
			System.out.println("Tall");
		} else {
			System.out.println("Please enter valid height");
		}
//		
		Scanner scan2=new Scanner(System.in);
		System.out.println("Please enter your quiz score");
		int quiz=scan2.nextInt();
		System.out.println("Please enter your mid-term score");
		int mid=scan2.nextInt();
		System.out.println("Please enter your final score");
		int finalScore=scan2.nextInt();
		
		int avgScore=(quiz+mid+finalScore)/3;
		System.out.println("Your average score is "+avgScore);
				
		if (avgScore>=90) {
			System.out.println("Grade is an A");
		} else if (avgScore>=70 && avgScore<90) {
			System.out.println("Grade is a B");
		} else if (avgScore>=50 && avgScore<70) {
			System.out.println("Grade is a C");
		} else {
			System.out.println("Grade is an F");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
