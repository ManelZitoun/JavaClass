package com.class4;

public class MortagePrices {
	public static void main(String[] args) {

		double rate = 4.6;
		int price = 560000;

		if (rate < 4.5) {
			System.out.println("User will consider buying a house");
			if (price <= 200000) {
				System.out.println("User will purchase the house with cash");
			} else {
				System.out.println("User will buy the house and take a loan");
			}
		} else {
			System.out.println("User will not purchase a house");
		}

		// How Axel did it in class

		double mortageRate = 4.5;
		int mortagePrice = 200000;

		if (mortageRate > 4.5) {
			System.out.println("I am not buying the house");
			if (mortagePrice >= 200000) {
				System.out.println("I am paying with cash");
			} else {
				System.out.println("I will take loan");
			}
		} else {
			System.out.println("I will not buy the house");
		}

	}
}
