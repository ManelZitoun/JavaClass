package com.class8;

public class BreakContinue {
	public static void main(String[] args) {
//		for (int i =1; i<=10; i++) {
//			if (i==5) {
//				break; //code will stop executing once the break statement is executed 
//			}
//			System.out.println(i);
//		
//		   }
	
		for (int i=0; i<=10; i++) {
			if (i==2 || i==3) {
				continue;
			}
			System.out.println(i);
		} //the code will execute even when the if condition is met 
		System.out.println("I am outside for for loop");
		
		for (int a=1; a<=20; a++) {
			if (a%3==0) {
				System.out.println(a);
			}
		}
}
}
