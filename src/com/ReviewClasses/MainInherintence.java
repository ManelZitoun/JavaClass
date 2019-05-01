package com.ReviewClasses;

public class MainInherintence {
	
	MainInherintence(int x, int y) {
		System.out.println("Before X "+x+ " Y "+y);
		x = x + y;
	    y = x - y;
	    x = x - y;
	    System.out.println("After X "+x+" Y "+y);
	}
	
	MainInherintence(String a, String b) { 
        System.out.println("Before swap: " + a + " " + b);  
        a = a + b;  
        b = a.substring(0, a.length() - b.length());  
        a = a.substring(b.length());  
        System.out.println("After : " + a + " " + b);  
	}
	public static void main(String[] args) {
		MainInherintence obj=new MainInherintence(12, 5);
		MainInherintence obj1=new MainInherintence("Girl", "Boy");
		ChildInherintence obj2=new ChildInherintence(1,2);
		ChildInherintence obj3=new ChildInherintence("1","2");

		

	}
}


class ChildInherintence extends MainInherintence {

	ChildInherintence(int x, int y) {
		super(x, y);
		System.out.println("Not reversing");
	}
	ChildInherintence(String a, String b) {
		super(a, b);
		System.out.println("Not Reversing");
	}
	
	
}