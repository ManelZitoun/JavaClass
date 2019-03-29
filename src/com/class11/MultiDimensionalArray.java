package com.class11;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		
		//creating 2D array
		
		int[][] d=new int[4][4];
		//Storing values in array
		d[0][0]=12;
		d[0][1]=13;
		d[0][2]=14;
		d[0][3]=15;
		
		d[1][0]=1;
		d[1][1]=2;
		d[1][2]=3;
		d[1][3]=4;
		
		d[2][0]=5;
		d[2][1]=10;
		d[2][2]=15;
		d[2][3]=20;
		
		d[3][0]=100;
		d[3][1]=200;
		d[3][2]=300;
		d[3][3]=400; 
		
		System.out.println(d[1][2]);
				
		
		int[][] c= {
				{12, 13, 14, 15},
				{1, 2, 3, 4},
				{5, 10, 15, 20},
				{100, 200, 300, 400}
		}; 
		
		System.out.println(c[3][1]);
		System.out.println(c[0][0]);
		
		//String Array
		
		String[][] groups= {
				{"Manel", "Mehmet", "Tatiana", "Aiguera"},
				{"Yessica", "Jason", "Ali", "Tayyab"},
				{"Andrei", "Artem", "Julia", "Zoya"},
		};
		
		System.out.println(groups[2][1]);
		System.out.println(groups[2][1]+" "+groups[0][0]);
		
		//Create 2D Array where you will store following values: Mr, Mrs,, Ms, Miss, and Smith
		//and names Smith, Jordan, Jackson, Obama
		
		String[][] name= {
				{"Mr.", "Mrs.", "Ms.", "Miss."},
				{"Smith", "Jordan", "Jackson", "Obama"}
		};
		
		System.out.println(name[0][1]+" "+name[1][0]);
		System.out.println(name[0][0]+" "+name[1][3]);
		System.out.println(name[0][2]+" "+name[1][2]);
		System.out.println(name[0][3]+" "+name[1][1]);
		
		//Task 2 
		
		String[][] names= {
				{"Manel", "Mona", "Omar", "Mariem"},
				{"A", "B", "C","D"},
		};
		
		System.out.println(names[0][3]+" has an "+names[1][0]);
		System.out.println(names[0][2]+ " has a "+names[1][1]);
		
	
	}

}
