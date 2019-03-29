package com.class11;

public class AdvancedArrayTask {
	public static void main(String[] args) {
		
		//Task 1 create an array of cars and store 6 elements into it. Using 2 diff loops print all values
		String[] cars= {"Lambo", "Mercedes", "BMW", "Mazda", "Toyota", "Bentley"};
		
		System.out.println("-----Advanced For Loop-------");
		
		for (String name:cars) {
			System.out.println(name);
		}
		
		System.out.println("------For Loop-------");
		
		for (int i=0; i<=cars.length-1; i++) {
			System.out.println(cars[i]);
		}
		
		
		//Create an array of countries. WHile retrieving all values from an array print capital for each country
		
		System.out.println("------Country for loop------");
		
		String[] country= {"Tunisia", "Turkey"};
		
		for (int i=0; i<=country.length-1; i++) {
			if (country[i].equals("Tunisia")) {
				System.out.println("Tunis is the capital of "+country[i]);
			} if (country[i].equals("Turkey")) {
				System.out.println("Istanbul is th capital of "+country[i]);
			}
		}
		
		System.out.println("------Country Switch & for loop------");
		
		String[] country1= {"USA", "Sudan", "Lebanon"};
		
		for (String i:country1) {
			
			switch (i) {
			
			case "USA":
				System.out.println("Washington DC");
				break;
			case "Sudan":
				System.out.println("Khartoum");
				break;
			case "Lebanon":
				System.out.println("Beirut");
				break;
			
			
		}
			
		}
		
		System.out.println("-----Sum using array & for loop--------");
		
		int[] sum= {23, 56, 77, 88, 450};
		
		int sumAll=0;
		
		for (int i=0; i<=sum.length-1; i++) {
			sumAll=sumAll+sum[i];
		}
		System.out.println(sumAll);
		
		
}
		
		
		
}
		
	


