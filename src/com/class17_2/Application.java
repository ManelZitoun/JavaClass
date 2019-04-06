package com.class17_2;

import com.class17.Calculator;

public class Application {
	
	public static void main (String[] args) {
		
		Calculator math=new Calculator(); 
//		
//		System.out.println(math.sum(12, 15));
//		System.out.println(math.sub(20, 5));
//		System.out.println(math.div(10, 2));
//		System.out.println(math.mult(2, 3)); 
		
		Application app=new Application();
		System.out.println(app.example4(1234));
		
		
	}
	
	void example() {
		System.out.println("No return value and NO arameters");
	} 
	void example2(String name) {
		System.out.println("No return value but with Parameter: "+name);
	}
	boolean example3() {
		System.out.println("With return value and No Parameters");
		return true; 
	}
	boolean example4 (String a) {
		
		//System.out.println("No return value but with Parameter: "+ name);
		return false;
	}
	double example6 (char name) {
		System.out.println("No return value but with parameter: "+name);
		return name;
	}
	String weqasReverse(String hello) {
		String Reverse="";
		//String hello="hello";
		for (int i=hello.length()-1;i>=0;i--) {
			Reverse=Reverse+hello.charAt(i);
		}
		return Reverse;
	}
	

}
