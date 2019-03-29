package com.ReviewClasses;

public class ForEachLoop {
	public static void main(String[] args) {
		
		int[][] ar= {
				{2, 6, 9, 3, 7},
				{1, 7, 9, 4, 8},
				{0, 4, 6, 2, 5},
				{0, 1, 2, 3},
		};
		
		int count=0;
		
		for (int[] inner: ar) {
			for (int element: inner) {
				if (element>7) {
					count++;
				}
			}
		}
		System.out.print(count);
		
		
//		int [] hello= {1,2,3,4,5};
//		//int h=hello
//	
//		for(int h:hello) {
//			System.out.println(h);
//		}
		
		
		//System.out.println("The number of elements above 7 are "+count);
		
//Print average of values in column 3
		
//	int total=0;
//	
//	for (int i=0; i<ar[3].length; i++) {
//		total+=(ar[3][i]);
//	}
//		int average=total/ar.length;
//		
//		System.out.println("The average is "+average);
//		
		
		
		
		
		
//		int total=0;
//		
//		for (int i=0; i<ar[1].length; i++) {
//			total+= (ar[1][i]); 
//		}
//		
//		int average=total/ar.length;
//		
//		System.out.println("The average is "+average);
		
		
		
	}

}
