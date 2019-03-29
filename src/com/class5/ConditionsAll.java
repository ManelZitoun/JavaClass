package com.class5;

import java.util.Scanner;

public class ConditionsAll {
	public static void main(String[] args) {
		
	//Ask user to enter price and boolean value for sale
		//Based on the sale we will check the price:
		//if price is less than $20 we have to apply discount of 20% & give final price 
		//if price is more than $20 but less than $100 apply discount of %30 & give final price
		//if price is more than 100 but less than $500 apply discount of 50% and give final price
                  		
	Scanner scan=new Scanner(System.in);
	System.out.println("Is there a sale going on?");
	boolean sale=scan.nextBoolean();
	System.out.println("What is the price of the item?");
	int price=scan.nextInt();
	
	int discount;
	double finalPrice;
	
	if (sale) {
		System.out.println("Let's check all discounts");
		if (price<20) {
			discount=20;
			finalPrice=price-(price*0.2); }
		else if (price>=20 && price<100) {
			discount=30;
			finalPrice=price-(price*0.3);} 
		
		else if (price>=100 && price<=500) {
			discount=50;
			finalPrice=price-(price*0.5);
		} else {
			discount=75;
			finalPrice=price-(price*0.75); 

			
		} 
		System.out.println("The final price is "+finalPrice);	
		} 
	
	else {
		System.out.println("No, thank you");
	}
	
	
		
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	


