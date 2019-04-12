package com.class20;

public class Car {
	
	public String color;
	public static int totalCars;
	
	public static void main(String[] args) {
		
		Car car1=new Car();
		car1.color="white";
		totalCars++;
		
		Car car2=new Car();
		car2.color="black";
		totalCars++; 
		
		System.out.println("We made a total of "+totalCars+" cars");
		System.out.println("The first car we made is "+car1.color);
		System.out.println("The second car we made is "+car2.color);
	}

}
