package com.class7;

import java.util.Scanner;

public class LoopReview {
	public static void main(String[] args) {
		//ask user to pay for soda
		//keep asking user to pay for soda until entered price is not equal to 1.99
		//after user got the right amount print "please enjoy your soda"
		
		Scanner scan=new Scanner(System.in);
		
		double price;
		
		do {
			System.out.println("Please enter the price of price"); 
			price=scan.nextDouble();
		} while (price !=1.99); 
		System.out.println("Enjoy your soda"); 
		
	}

}
