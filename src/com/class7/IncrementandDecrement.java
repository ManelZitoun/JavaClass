package com.class7;

public class IncrementandDecrement {
public static void main(String[] args) {
	//post increment (a++) 
	
	int a=299;
	int b=a++; //first assign then increment 
	System.out.println(a);
	System.out.println(b);
	
	//post decrement (x--)
	
	int x=10;
	int y=x;
	System.out.println(x+" "+y);
	
	int z=10;
	z--;
	System.out.println(z); //9
	
	int c=z--;
	
	System.out.println(c); //10
	System.out.println(z); //9
	
	
}
}
