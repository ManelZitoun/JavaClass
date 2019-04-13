package com.class21;

public class Car {
	
	public static String make="Toyota";
	String color; //declaring instance variable
	String model;
	int doors;
	boolean engine;
	
	//This is a constructor - it can only live within the class 
	//& can't live inside a method & it will execute
	//you can use access modifiers with constructors 
	
	Car() {
		System.out.println("I am constructor");
		System.out.println("Hello from constructor");
	}
	
	public static void main(String[] args) {
		Car obj = new Car();
		System.out.println(obj.color); //the constructor gives the value null to empty obj
		System.out.println(obj.doors);
		System.out.println(obj.engine);
		hello();
	}
	
	public static void hello() {
		String name;
//		System.out.println(name); compiler gives error - it's not initalized
		System.out.println("I am a static hello method");
	}
	

}
