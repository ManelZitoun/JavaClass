package com.class11;

public class ReviewArray {
	public static void main(String[] args) {
		
		String[] names=new String[6]; 
		names[0]="Alex";
		names[1]="Manel";
		names[2]="Arif";
		names[3]="Weqas";
		names[4]="Awet";
		names[5]="Shiva";
		System.out.println(names.length);
		
		for (int i=0; i<=names.length-1; i++) {
			System.out.println(names[i]);
		}
		
		//2. Create array using literal array
		
		System.out.println("------For Loop--------");
		
		String[] studentNames={"Manel", "Shaban", "Nick", "Joe", "Kevin", "Justin"};
		
		for (int i=0; i<=studentNames.length-1; i++) {
			System.out.println(studentNames[i]);
		}
		
		//retrieve values using: advanced for loop. for each loop, enhanced for loop
		
		System.out.println("-------Advanced for loop--------");
		
		for (String student:studentNames) {
			System.out.println(student); 
		}
		
		
		
	}

}
