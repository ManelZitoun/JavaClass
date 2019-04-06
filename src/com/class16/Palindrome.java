package com.class16;

public class Palindrome {

	public static void main(String[] args) {
		
		Palindrome text=new Palindrome();
		
		text.test("Madam");
		
	}
	
	void test (String text) {
		String reverse="";
		for (int i=text.length()-1; i>=0; i--) {
			reverse+=text.charAt(i);
		} 
		if (reverse.equalsIgnoreCase(text)) {
			System.out.println("Palindrome"); 
		} else {
			System.out.println("Not a palindrome");
		}
	}
}
	
