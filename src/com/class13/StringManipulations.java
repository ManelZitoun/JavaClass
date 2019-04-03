package com.class13;

public class StringManipulations {
	public static void main(String[] args) {
		String str="Saturday";
		
		char[] array=str.toCharArray();
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		for (char c: array) {
			System.out.println(c);
		}
		
		System.out.println("-----Print in Reverse-------");
		
		for (int i=array.length-1; i>=0; i--) {
			System.out.println(array[i]);
		}
	}

}
