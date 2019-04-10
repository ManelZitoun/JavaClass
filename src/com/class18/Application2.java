package com.class18;

public class Application2 {
//	public static void main(String[] args) {
//	
//	Calculator calc =new Calculator();
//	
//	System.out.println(calc.sum(12, 13, 14)); 
//	System.out.println(calc.average(12, 13, 14)); 
//	System.out.println(calc.min(12, 13, 14)); 
//	System.out.println(calc.max(12, 13, 14)); 
//
		  
		  static boolean bothEven(int num1, int num2) {
		
		    if (num1%2==0 && num2%2==0) {
		      return true; 
		      
		    } 
			 else {
			  return false; 
			}
				
			}
			
			//test case below (dont change):
			public static void main (String[] args) {
				System.out.println(bothEven(8,6)); //should be true
				System.out.println(bothEven(5,6)); //should be false
			}
		}
