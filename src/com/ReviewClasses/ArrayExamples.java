package com.ReviewClasses;

public class ArrayExamples {
	public static void main(String[] args) {
		
//		int[] sum= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		//int sumAll=((sum[0])+(sum[1])+(sum[2])+(sum[3])+(sum[4])+(sum[5])+(sum[6])+(sum[7])+(sum[8])+(sum[9]));
		
		int sum1 =0;
		
//		System.out.println(sumAll);
		
		//Array using for loop
		
		int[] sum={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for (int i =0; i<10; i++)
		{
			sum1 = sum1 + sum[i];
		}
		
		System.out.println(sum1);
		
		
		//Write a program to test if an array contains a specific value 
		
		int[] num= {5, 16, 22, 35, 67, 89, 102, 6, 7, 1, 55, 77, 25};
		
		boolean found=false; 
		
		for (int i=1; i<num.length; i++) {
			if (num[i]==6) {
				found=true;
				break;
			} }
		
		if (found) {
			System.out.println("Array contains value of 6");
		}else {
				System.out.println("Element 6 does not exist");
				
			}
		}
		
		
		
	}


