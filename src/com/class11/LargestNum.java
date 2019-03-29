package com.class11;

public class LargestNum {
	public static void main(String[] args) {
	
	//create an array of int & find largest num
		
		int[] num= {55, 78, 90, 102, 78, 99, 675, 789, 483};
		
		int max=num[0];
		
		for (int i:num) {
			if (i>max) {
				max=i; 
			}
		}
	
	System.out.println("The largest number in the array is "+max);
	
	//another way
	int[] num1= {55, 78, 90, 102, 78, 99, 675, 789, 483};
	
	int max1=num[0];
	
	for (int i=0; i<num1.length; i++) {
		if (num1[i]>max1) {
			max1=num1[i];
			
		}
	}
	
	System.out.println("The largest number is "+max1);
	
	
	}
}
