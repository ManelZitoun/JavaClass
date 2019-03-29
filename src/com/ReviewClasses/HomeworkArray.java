package com.ReviewClasses;

import java.util.Scanner;

public class HomeworkArray {
	public static void main(String[] args) {
//	Create an int array with the size of 5 and input values with Scanner.  
//	Print out each element of the array multiplied by ten, one element per line. 
//	Create a loop and enter values into one loop, the second loop print the values and it must be multiplied by 10.

	
//	Scanner scan=new Scanner(System.in); 
//	int[] ar=new int[5];
//	
//	for (int i=0; i<ar.length; i++) {
//		ar[i]=scan.nextInt();
//	
//	} for (int j=5; j>ar.length; j--) {
//		System.out.println(ar);
//	}
//	

		double[][] a = {
				{1.4,2.0,3.3,2},
				{4,1.5,6.1,1},
				{1.2,3.1,4,1.6}
			};

		for(int i=0 ; i<a.length ;i++){
		      for(int b=0; b<a[i].length ;b++){
		        System.out.println(a[i][b]*2);
		      }
		      System.out.println();
		
	
	}	
	
	}
}
