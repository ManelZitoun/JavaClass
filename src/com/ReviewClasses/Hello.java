package com.ReviewClasses;

public class Hello {
	
	Hello(String a) {
		this("Bye", "Bye");
		System.out.println("This is first constructor w/ 1 parameter");
	}
	
	Hello(String a, String b) {
		this ("Hello", "Why", "Bye");
		System.out.println("This is second constructor w/ 2 parameters");
	}
	Hello(String a, String b, String c) {
		System.out.println("This is the third constructor w/ 3 parameters");
	}

	public static void main(String[] args) {
		Hello obj=new Hello("Girl"); 
	}
	
}
