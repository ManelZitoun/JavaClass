package com.class26;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList <String> greetings=new ArrayList<String>();
		
		greetings.add("Hello");
		greetings.add("Welcome");
		greetings.add("Bye");
		greetings.add("Hi");
		
		System.out.println(greetings.get(1));
		System.out.println(greetings.size());

		greetings.add("How are you?");
		greetings.add("How are you?");
		greetings.add("How are you?");
		
		System.out.println(greetings.size());
		
		for (int i=0; i<greetings.size(); i++) {
			System.out.println(greetings.get(i));
		}
		
		System.out.println();

		for (String greetWords: greetings) {
			System.out.println(greetWords);
		}

	}

}
