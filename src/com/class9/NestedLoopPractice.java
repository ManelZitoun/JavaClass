package com.class9;

public class NestedLoopPractice {
	public static void main(String[] args) {
//		
//		for (int a=5; a>=1; a--) {
//			for (int d=5; d>=1;d--) {
//				System.out.print(a);
//			}
//			System.out.println();
//		}
//		
		for (int a=0; a<4; a++) {
//			
			for (int b=0; b<=a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		
		for (int a=1; a<=4; a++) {
			
			 
			for (int b=1; b<=6 ; b++) {
				
			if (a==1 || a==4 || b==1 || b==6) {
				System.out.print("*");
			} else {
			System.out.print(" "); 
			}
			
			}
			System.out.println();
			
		}
		
	}

}
