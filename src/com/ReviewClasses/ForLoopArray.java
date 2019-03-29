package com.ReviewClasses;

public class ForLoopArray {
	public static void main(String[] args) {
		
		//Print all elements of the 2d array using a for loop
		
		int[][] ar= {
				{1, 2, 3},
				{4, 5, 6, 9},
				{7, 8},
		};
		
		for (int i=0; i<ar.length; i++) {
			System.out.println("The length of row");
		}
		
		for (int i = 0; i < ar.length; ++i) {
	           for (int j = 0; j < ar[i].length; ++j) {
	               System.out.println(ar[i][j]);
	           }
	       }

	       for (int[] innerArray : ar) {
	           for (int data : innerArray) {
	               System.out.println(data);
	           }
	       }
		
		
		
		
		
		
		
		
		
	}

}
