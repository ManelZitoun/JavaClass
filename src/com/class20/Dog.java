package com.class20;

public class Dog {
	
	static String breed="Husky";
	static int paws=4; 
	String name;
	int weight;
	int height;
	
	public static void main(String[] args) {
		Dog dog1=new Dog();
		dog1.name="Marty";
		dog1.weight=60;
		dog1.height=40;
		dog1.getDogProperties(); 
		
		Dog dog2=new Dog();
		dog2.name="Waffle";
		dog2.weight=100;
		dog2.height=90;
		dog2.getDogProperties(); 
		
		Dog dog3=new Dog();
		breed="Pug";
		dog3.name="Lucy";
		dog3.weight=20;
		dog3.height=30;
		dog3.getDogProperties(); 
		dog2.getDogProperties(); 
		dog1.getDogProperties(); 


//		System.out.println();
//		System.out.println("-----Accessing static variable---");
//		
//		System.out.println(breed); //able to access without importing class because it is static
//		System.out.println(Dog.breed); //accessing using class name
//		System.out.println(dog3.breed); //by obj reference --> not preferred 
//		

		
	}
	
	public void getDogProperties() {
		System.out.println(name+" is a "+breed+" and their weight is "+weight+" pounds and their height is "+height+" cm");
	}

}
