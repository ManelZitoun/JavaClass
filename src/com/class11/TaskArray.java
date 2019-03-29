package com.class11;

public class TaskArray {
	public static void main(String[] args) {
		
	//create an array of cars: american, german, korean, italian 
		
		System.out.println("------Cars--------");
		
	String[][] cars= {
			{"Ford", "Dodge", "Jeep"},
			{"BMW", "Volkswagon"},
			{"Hyundai", "Kia"},
			{"Porsche", "Ferrari", "Lambo"},
			
	};
	
	for (int i=0; i<cars.length; i++) {
		for (int j=0; j<cars[i].length; j++) {
			System.out.println(cars[i][j]);
		}
	}
	
	System.out.println("--------Countries--------");
	
	String[][] countries= {
			{"USA", "Canada", "Mexico"},
			{"France", "Spain", "Portugal", "Germany"}, 
			{"Vietnam", "Afghanistan", "Thailand", "China"},
			{"Tunisia", "Algeria", "Ghana", "Mali"}, 
	}; 
	
	for (int i=0; i<countries.length; i++) {
		for (int j=0; j<countries[i].length; j++) {
			System.out.println(countries[i][j]);
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
