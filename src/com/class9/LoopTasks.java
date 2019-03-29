package com.class9;

import java.util.Scanner;

public class LoopTasks {
	public static void main(String[] args) {
		
	
		for (int i=0; i<=5; i++) {
				
			int sumOfOdd=0; 
			int sumOfEven=0;
			
			//System.out.println(sumOfEven+=i);
			if (i%2==0) {
				sumOfEven+=i;
				System.out.println(sumOfEven+"even");
			} 
			else {
				sumOfOdd+=i;
				System.out.println(sumOfOdd+"odd");
			} 
	
		
		
		}	
		
	}

}
