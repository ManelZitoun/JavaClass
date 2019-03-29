package com.class12;

public class StringManipulations2 {
	public static void main(String[] args) {
		
	String str="Good morning, students!";
	boolean contains=str.contains("morning");
	System.out.println(contains);
		
	String present="Welcome, Manel";
	String neededValue="Welcome,";
	
	boolean flag=present.contains(neededValue);
	System.out.println(flag);
	
	boolean flag1=present.toLowerCase().contains(neededValue);
	System.out.println(flag1);
	
	System.out.println("-----Starts with/ends with--------");
	
	String str1="syntax";
	boolean starts=str1.startsWith("s");
	System.out.println(starts);
		
	str1.endsWith("x");
	
	System.out.println(str1.endsWith("x"));
	
	System.out.println("-----Is Empty--------");
	
	String str2="Hello";
	boolean isEmpty=str2.isEmpty();
	System.out.println(isEmpty);
	
	 String str3="Hello";
     String str4= "Manel";
      
      System.out.println(str3+str4);//OR
      System.out.println(str3.concat(str4));//faster way puts both together
      
      System.out.println("------Trimming Spaces at the End---------");
      
      String expected="You may qualify for a multi-policy discount!";
      String actual= "You may qualify for a multi-policy discount! ";
              
      System.out.println(expected.contentEquals(actual));
	
      actual=actual.trim();
      System.out.println(actual);
	
		
		
		
		
		
		
		
	}

}
