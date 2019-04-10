package com.class18;

public class Human {
	//instance variable
	static String eyeColor = "Brown";
	int height=6;
	int weight=180;
	String gender="F";
	
	String programmingLanguage="JAVA";
	
	
	void speak() {
		//local variable - cannot access outside of method
		String language="English";
		
		System.out.println("Humans can speak "+language);
	}
	void coding() {
		System.out.println("Syntax students can code");
	}
	
	

}
 