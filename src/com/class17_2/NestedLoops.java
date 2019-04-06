package com.class17_2;

public class NestedLoops {
	public static void main(String[] args) {

	NestedLoops num=new NestedLoops();
	num.GetExample1(); 
	System.out.println();
	num.GetExample3();
	System.out.println();
	num.GetExample4();
	System.out.println();
	num.GetExample5();
	
	
	
	
	}
	
	
	
	void GetExample1() {
		for (int a=0; a<=5; a++) {
			System.out.print(a);
		} 
		System.out.println(); 
		
		for (int b=0; b<=5; b++) {
			System.out.print(b);
		}
		System.out.println();
		for (int c=0; c<=5; c++) {
			System.out.print(c);
		} }
		
		
	// Print 
		//12345 -> 4times 
	
	void GetExample3() {
		
	for (int i=1; i<=5; i++) {
		
		for (int y=1; y<10; y++) {
			System.out.print(y);
		}
		System.out.println();
	}}
		
	//print pattern of repeating 1-7 --> 7 rows & 7 columns
	
	void GetExample4() {
	
	for (int i=1; i<=7; i++) {
		for (int y=1; y<=7; y++) {
			System.out.print(i);
		}
		System.out.println();
	} }
	
	void GetExample5() {
		
	for (int a=1; a<=5; a++) {
		 
		for (int b=1; b<=5; b++) {
			System.out.print("*");
		}
		System.out.println();
	}	}
		
		

}
