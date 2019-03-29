package com.class4;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[] args) {
		// take a number from a user and print that number
//		int num=22;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter any number");
		int a = scan.nextInt();
		System.out.println("your number is " + a + " \n");

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = input.nextLine();
		System.out.println("Good morning " + name);

		Scanner scan1=new Scanner(System.in);
	    System.out.println("Input the boolean value");
	    boolean isTrue=scan1.nextBoolean();
	    
	    System.out.println("The value is "+isTrue);
	}

}
