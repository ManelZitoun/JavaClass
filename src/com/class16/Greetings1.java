package com.class16;

public class Greetings1 {
	
	String name;
	
	public static void main(String[] args) {
		
		Greetings1 obj=new Greetings1();
		obj.askHowAreYou("Manel");
		obj.askHowAreYou2("Arif");
		
	}
	
	void askHowAreYou(String name) {
		System.out.println("How are you "+name);
	}
	
	void askHowAreYou2(String name) {
		System.out.println("How are you "+name);
	}
}
