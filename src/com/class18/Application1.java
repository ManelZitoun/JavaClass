package com.class18;

public class Application1 {
	public static void main(String[] args) {
		
		Animal anim =  new Animal();
		
		System.out.println("This is anim:");
		
		anim.name="Joe"; 
		anim.age=40; 
		
		System.out.println(anim.age);
		System.out.println(anim.weight);
		System.out.println(anim.breed);
		System.out.println(anim.name);
		
		anim.name="Joe"; 
		anim.age=40; 
		
		System.out.println();
		System.out.println("This is anim2:");
		
		Animal anim2=new Animal();
		
		System.out.println(anim2.age);
		System.out.println(anim2.weight);
		System.out.println(anim2.breed);
		System.out.println(anim2.name);
		System.out.println();
		
		System.out.println("----Min of Values-----");
		int my_array[] = {1, 2, 3, 4, 5, 6 ,7 , 8, 9, 10};
		
		Minimum arr=new Minimum();
		arr.minOfValues(my_array); 
		System.out.println(arr.minOfValuesInteger(my_array));
		
		
		
	}

}
