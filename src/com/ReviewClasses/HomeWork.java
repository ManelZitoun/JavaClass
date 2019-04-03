package com.ReviewClasses;

public class HomeWork {
	public static void main(String[] args) {

		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};

		for (int i=-0; i<=a.length; i++) {
		  for (int j=0; j<=a.length; j++) {
		    	  System.out.print(a[i][j]+", "); }

		System.out.println();
		}
	 

	}
}