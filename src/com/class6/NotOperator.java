package com.class6;

import java.util.Scanner;

public class NotOperator {
	public static void main(String[] args) {
		
	// not operator 
		// ! --> will reverse the value 
		
		boolean a=!true;
		
		System.out.println("The value of boolean variable is "+a);
		
		boolean snow=true;
		//if it is not snowing --> I will come to class otherwise I will stay @ home
		//When the if statement is false it will NOT print 
		if (!snow) {
			System.out.println("I will come to the class");
		} //no output in console 
		
		int x=10;
		int y=20;
		
		if (!(x>y)) {
			System.out.println("Hello");
		} //now that we have use the not operator(!) hello has printed now that the statement is true 
		
		//Example from homework
		
		Scanner scan=new Scanner(System.in);
	 	System.out.println("Please enter three distinct numbers");
	 	int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		String largest; 
		//reverses the condition - so IF these #'s are NOT equal go to nested if's
		if (!(num1==num2 && num1==num3 && num2==num3)) {
		if (num1>num2) {}
			if (num1>num3) {
				largest="num1";
			} else {
				largest="num3";
			}
		} else {
			if (num2>num3) {
				largest="num2";
			}  else {
		largest="The numbers are equal";
		}
		
		
		}
		
		System.out.println(largest);
		
		}
		
		
		
		
		
		
		
		
		
		
		
	}


