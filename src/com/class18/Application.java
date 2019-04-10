package com.class18;

public class Application {

	public static void main(String[] args) {
		//accessed method from Human class and created object 
		Human person1 = new Human();
		
		person1.eyeColor ="pink";
		
		System.out.println(person1.eyeColor);
		System.out.println(person1.height);
		System.out.println(person1.weight);
		System.out.println(person1.gender);
		System.out.println();
		
		Human person2=new Human();
		
		person1.eyeColor ="orange";
		
		System.out.println(person1.eyeColor);
		System.out.println(person1.height);
		System.out.println(person1.weight);
		System.out.println(person1.gender);
		

	}

}
