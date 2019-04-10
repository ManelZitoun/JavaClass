package com.class18;

public class Minimum {
	
	
	static int minOfValues(int my_array[]) {
		int a=5;
		for(int i=0;i<=my_array.length-1;i++) {
			if (my_array[i]<a) {
				a=my_array[i];
				
			}
		}
		
		
		return a;
	}
	static int minOfValuesInteger(int my_array[]) {
		int a=Integer.MAX_VALUE;
		for(int i=0;i<=my_array.length-1;i++) {
			if (my_array[i]<a) {
				a=my_array[i];
				
			}
		}
		
		
		return a;
	}
	
}
