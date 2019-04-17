package com.class22;

public class Addition {
	
	public void add(int a,  int b) {
		System.out.println("Method to add 2 int valus");
		System.out.println(a+b);
	}
	public void add(int a) {
		System.out.println("Method to add 1 int value & 100");
		System.out.println(a+100); 
	}
	public void add(int a, int b, int c) {
		System.out.println("Method to add 3 int values");
		System.out.println(a+b+c);
	}
	
	//overloading method by changing the data type of the parameters 
	public void add(double a, double b) {
		System.out.println("Method to add 2 double values");
		System.out.println(a+b);
	}
	public void add(double a, double b, double c) {
		System.out.println("Method to add 3 double values");
		System.out.println(a+b+c);
	}
	public void add(int a, double b) {
		System.out.println("Method to add 1 int value & 1 double value");
		System.out.println(a+b); 

}
}