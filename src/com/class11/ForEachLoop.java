package com.class11;

public class ForEachLoop {
	public static void main(String[] args) {
		
		int[] numbers= {12, 13, 14, 15, 16, 17};
		
		for (int i:numbers) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		int[] number= {15, 76, 89, 220, 567, 998};
		
		for (int num:number) {
			System.out.print(num+" ");
		}
	}

}
