package com.class17_2;

import java.util.Scanner;

public class GuessingGame {
	
	int num=0;

	public static void main(String[] args) {
		
	
	
	GuessingGame num=new GuessingGame();
	num.GuessTheNumber();
	
	}
	
	
	void GuessTheNumber() {
	for (int a=num; a<=20; a++) {
		Scanner scan=new Scanner(System.in);
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
