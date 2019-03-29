package com.ReviewClasses;

public class ReviewMar20 {
	public static void main(String[] args) {

//		* Write a program that prints the following pattern
//		1 2 3 4 5 6 7 8 9 10
//		2 4 6 8 10 12 14 16 18 20
//		3 6 9 12 15 18 21 24 27 30
//		4 8 12 16 20 24 28 32 36 40
//		5 10 15 20 25 30 35 40 45 50

		for (int i = 1; i <= 10; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		for (int i = 3; i <= 30; i += 3) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i = 4; i <= 40; i += 4) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i = 5; i <= 50; i += 5) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		// another way to do it 
		
		for (int i=1; i<=5; i++) {
			for (int y=1; y<=10; y++) {
				System.out.print(i*y+" ");
			}
			System.out.println();
		}
		
		// code pattern that shows 
		//....1
		//...22
		//..333
		//.4444
		//55555
//		
//		for (int i=1; i<=5; i++) {
//			for (int y=5; y>0; y--) {
//				if (y<=i) {
//					System.out.print(i);
//				} else {
//					System.out.print(".");
//				}
//			} System.out.println();
//			
//			
//			
//		}
//another way to do the code above
		
//		for (int i=1; i<=5; i++) {
//			for (int k=1; k<=(5-i); k++) {// 5-1=4, 
//				System.out.print(".");
//			} 
//			for (int l=1; l<=i; l++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		} 
		
		
		//Write a program that prints the following pattern
        //....1
		//...2
		//..3
		//.4
		//5
		
		for (int i=1; i<=5; i++) {
			
			for (int l=5; l>=i; l--) {
				System.out.print(".");
			}
			System.out.println();
		
		}	
		
		
		
		
		
		
		
		
		
		
	}

}
