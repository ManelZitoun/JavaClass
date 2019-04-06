package com.class16;

public class LargerNumber {
	
	public static void main(String[] args) {
		
		LargerNumber obj=new LargerNumber();
		
		obj.findLargest(33, 56);
		
	}
	
	void findLargest (int a, int b) {
		if (a>b) {
			System.out.println(a+" is larger than "+b);
		} else {
			System.out.println(b+" is larger than "+a);  
		}
	}

}
