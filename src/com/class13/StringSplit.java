package com.class13;

public class StringSplit {
	public static void main(String[] args) {
		String str="Welcome Syntax Students Batch four";
		String[] array=str.split("s");
		System.out.println(array.length);
		for (String substring:array) {
			System.out.println(substring);
		}
		
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("----Tasks-----");
		
		String str1="Wow I hope you are good today";
		String[] array1=str1.split(" ");
		for (String substring:array1) {
			System.out.print(substring);
		}
		System.out.println();
		
		System.out.println("----Replace-----");
		
		String str2="aA:KLEJflkf9-83475(9)^&^%^%";
		String newString=str2.replaceAll("[^A-Za-z]", ""); 
		System.out.println(newString);
		
		String a="Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] arr2=a.split("\\?");
			System.out.println(arr2.length);
				
	}

}
