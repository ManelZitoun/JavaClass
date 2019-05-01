package com.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTask {
	
	public static void main(String[] args) {
	
	ArrayList <String> car = new ArrayList<String>();
	
	car.add("Toyota");
	car.add("Mercedes");
	car.add("BMW");
	car.add("Rolls Royce");
	for (int i=0; i<car.size(); i++) {
		System.out.println(car.get(i));
	}
	
	for (String cars:car) {
		System.out.println(cars);
	}
	
	Iterator<String> it=car.iterator();
	while (it.hasNext()) {
		String cars1=it.next();
		System.out.println(cars1);
	}
	
	int c=0;
	
	while(car.size()>c) {
		String cars2=car.get(c);
		System.out.println(cars2);
		c++; 
		
		System.out.println(cars2);

	}
	
	ArrayList <String> words = new ArrayList<String>(); 
	words.add("Nicole");
	words.add("Sirena");
	words.add("Bailey");
	words.add("Lacey");
	words.add("Arif");
	
	Iterator<String> word = words.iterator();
	while (word.hasNext()) {
		String word1=word.next();
	if (word1.endsWith("e")) {
		word.remove(); 
	} 


}
	System.out.println(words);
	
	
ArrayList<String> drink = new ArrayList<String>();
drink.add("Coke");
drink.add("Sprite");
drink.add("Apple Juice");
drink.add("Milk");

for (int i=0; i<drink.size(); i++) {
	if (drink.get(i).contains("e") || drink.get(i).contains("a")) {
		drink.set(i, "water");
	}
}
System.out.println(drink);


ArrayList<Integer> numbers = new ArrayList<Integer>();

for (int i=1; i<=50; i++) {
	if (i%2==0 && i%5!=0) {
		numbers.add(i);

	}
}
System.out.println(numbers);

	}
	
	
	}
