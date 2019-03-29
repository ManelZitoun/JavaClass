package com.class9;

import java.util.Scanner;

public class UserTask {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in); 
		System.out.println("What would you like to buy?");
		String item=scan.nextLine(); 
		System.out.println("How much is it?");
		double price=scan.nextDouble();
		
		double rem=price;
		do {
			System.out.println("Please pay for item");
			double pay=scan.nextDouble();
			rem=rem-pay; 
			System.out.println("You have "+rem+" left to pay" );
			
				if (rem<0) {
					break;
				}
			
		}
		while (rem!=0); {
			System.out.println("You have "+rem+" left to pay");
		}
		
		
		
		
}

}
