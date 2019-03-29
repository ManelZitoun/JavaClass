package com.class5;

public class NestedifPractice {
	public static void main(String[] args) {
		boolean creditCard=true;
		int balance=5000;
		
		if (creditCard) {
			System.out.println("Let's check the balance");
			if(balance>=1000) {
				System.out.println("Pay off now");
			} else {
				System.out.println("You are safe");
			}
		} else {
			System.out.println("Do you want a credit card");
		}
	}

}
