package com.class12;

public class StringManipulations {
	public static void main(String[] args) {
	//Length function or method - returns number of characters in the string 	
	String str="Syntax";
	
	int lengthOfString=str.length();
	System.out.println(lengthOfString);
		
	String str1="Syntax Technologies";
	int lengthOfString2=str1.length();
	System.out.println(lengthOfString2);
		
	String str2="Welcome, students!";
	System.out.println(str2.length());
	//toUpperCase() --> converts all characters to upper case
	//toLowerCase() --> converts all characters to lower case
	
	String str3="Hello";
	String newString=str3.toUpperCase();
	System.out.println(newString);
	
	String lowerCaseString=newString.toLowerCase();
	System.out.println(lowerCaseString);
	
	String str4="Hello";
	String str5="hello"; 
	
	//equals() - compares 2 string, if strings are equal --> true, else --> false
	str4.contentEquals(str5); 
	boolean equality=str4.equals(str5);
	System.out.println(equality);
	
	String expectedBrowser="Chrome";
	String actualBrowser="chrome";
	boolean equals=expectedBrowser.equalsIgnoreCase(actualBrowser);
	System.out.println(equals);
		
	}
}
