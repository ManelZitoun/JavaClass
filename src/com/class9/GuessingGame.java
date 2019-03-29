package com.class9;

import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		
		int num=0;
	
	Scanner scan=new Scanner(System.in);
	
	
	for (int a=num; a<=20; a++) {
		System.out.println("Please guess a # between 1-20");
		num=scan.nextInt();
		if (num<12) {
			System.out.println("Num guessed is too small");
		} else if (num>12 && num<21) {
			System.out.println("Num guessed is too big");
		} else if (num==12) {
			System.out.println("You guessed correctly");
			break;
		} else  {
			System.out.println("Please enter valid number");
			
		}
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
