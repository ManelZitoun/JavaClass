package com.class7;

public class WhileandDoWhile {
	public static void main(String[] args) {
		
		int a=10;
		
		do { //executes first and then checks condition
			System.out.println("Hello");
		a++;
		} while (a>15); 
		
		int b=10;
		while (b<15)  { //checks condition and then executes
			System.out.println("Bye");
			b++;
		}
		int i =10;
	    
	    do {
	    	System.out.println(i);
	    i++; } 
	    while (i>=10 && i<20); {
	      
	      i++;
	    }
	  }
	}

