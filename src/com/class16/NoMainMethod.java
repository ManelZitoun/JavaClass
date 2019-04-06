package com.class16;

public class NoMainMethod {
	//methods & variables are members of the class 
	
	String str;
	int num;
	
	void hello() {
		System.out.println("Hello");
		System.out.println("Hello friends");
	} 
	void bye() {
		System.out.println("Bye");
	}
	
	public static void main(String[] args) { //method signature
		
		NoMainMethod obj=new NoMainMethod(); //method body
		obj.hello(); //when we are printing a method - it is called calling a method
		obj.bye();
	}

}
