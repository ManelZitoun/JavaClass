package com.class21;

public class ConstructorPractice {
	
//	3. Write a program  Write a program that will have a private default constructor class and create 2 
//	objects of this class: 1 - inside same class; 2 - from outside the class.that will have a private 
//	default constructor class and create 2 objects of this class: 1 - inside same class; 2 - from outside the class.
	
	
	ConstructorPractice () {
		System.out.println("Default Constructor");
	} 
	private ConstructorPractice(int a) {
		System.out.println("This is private constructor "+a);
	}
	
	public static void main(String[] args) {
		
		ConstructorPractice obj=new ConstructorPractice();
		
		ConstructorPractice obj1=new ConstructorPractice(1); //this one is private will only be accessed within this class

	}
	
//	4. Write program that have static constructor and observe result. 
	
//	static ConstructorPractice() {
		//cannot run this constructor because of static 
//	}

}
