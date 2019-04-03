package com.class15;

public class Car {
	
	
	String make, model, color;
	int door, wheels;
	
	public static void main(String[] args) {
		
		//ClassName variable=new ClassName();
		
		//1st object
		Car car1=new Car();
		car1.make="Honda";
		car1.model="Civic";
		car1.color="Black";
		car1.door=4;
		car1.wheels=4; 
		
		System.out.println("Car "+car1.make+" has "+car1.door+" wheels");
		//define behavior 
		car1.drive();
		car1.reverse();
		car1.stop();
		car1.brake();
				
		//2nd object
		Car car2=new Car();
		car2.make="Tesla";
		car2.model="X";
		car2.color="Blue";
		car2.door=4;
		car2.wheels=4;
		
		System.out.println("Car "+car2.make+" has "+car2.door+" doors");
	}
	
	void drive() {
		System.out.println("Car can drive");
	}
	void reverse() {
		System.out.println("Car can reverse");
	}
	void brake () {
		System.out.println("Car can brake");
	}
	void  stop() {
		System.out.println("Car can stop/put it into park");
	}
	
	
	

}
