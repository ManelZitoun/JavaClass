package com.class15;

public class Dog {
	
	String breed, color;
	int age;
	
	public static void main(String[] args) {
		
		Dog dog1=new Dog();
		dog1.breed="Husky";
		dog1.color="black and white";
		dog1.age=4;
		
		dog1.doesBark();
		dog1.canPlay();
		dog1.getsDirty();
		System.out.println();
		
		Dog dog2=new Dog(); 
		dog2.breed="Bulldog";
		dog2.color="brown";
		dog2.age=10;
		
		dog2.doesBark();
		dog2.getsDirty();
		dog2.canPlay();
		System.out.println();
		
		Dog dog3=new Dog();
		dog3.breed="Labrador";
		dog3.color="black";
		dog3.age=8; 
		
		dog3.canPlay();
		dog3.doesBark();
		dog3.getsDirty();
		
	}
	
	void doesBark() {
		System.out.println("My "+breed+" can bark really loud");
	} void canPlay() {
		System.out.println("My "+breed+" is good at playing even at "+age+" years old");
	} void getsDirty() {
		System.out.println("My "+color+" "+breed+" is good at getting dirty with kids");
	}

}
