package com.class16;

public class EvenOdd {
	
	public static void main(String[] args) {
		
		EvenOdd num=new EvenOdd();
		
		 num.evenOrodd(54, 67);
		
	}
	
	void evenOrodd(int a, int b) {
		if (a%2==0 && b%2!=0) {
			System.out.println("A is even "+"B is odd");
		} else if (a%2!=0 && b%2==0) {
			System.out.println("A is odd"+"B is even");
		} else if (a%2==0 && b%2==0) {
			System.out.println("A is even"+"B is even");
		} else  {
			System.out.println("Both are odd");
		}
	}

}
