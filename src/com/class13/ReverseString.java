package com.class13;

public class ReverseString {
	public static void main(String[] args) {
		
		//Reverse a string without using reverse function
		
		String original="Today is JAVA class";
		String reverse="";
		
		char[] array=original.toCharArray();
		
		for (int i=array.length-1; i>=0; i--) {
			reverse=reverse+array[i]; 
		}
	System.out.println("Reverse string is: " +reverse);
	
	//2 charAt()
	
	String reverse1="";
	
	for (int i=original.length()-1; i>=0; i--) {
		reverse1=reverse1+original.charAt(i); 
	}
	System.out.println("Reversed String is: "+reverse1);
	
	//substring reverse
	
	String reverse3="";
	
	for (int i=original.length(); i>0; i--) {
		reverse3=reverse3+original.substring(i-1, i); 
	}
	
	System.out.println(reverse3);
	
	
	
	
	
	
	
	
	}

}
