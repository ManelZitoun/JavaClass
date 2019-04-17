package com.class22;

public class AreaClass {
	
	public void area (int a, int b) {
		System.out.println("Area of a rectangle");
		System.out.println(a*b);
	}
	public void area(int a) {
		System.out.println("Area of a square");
		System.out.println(a*a);
	}
	public void area(double a) {
		System.out.println("Area of a cube");
		System.out.println((a*a)*6);
	}
}
