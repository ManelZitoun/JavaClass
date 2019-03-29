package com.class3;

public class RelationalOperators {
	public static void main(String[] args) {
		
		int a=19;
		int b=50;
		
		boolean result=a>b;
		boolean result1=a==b;
		
		//Comparing 2 numbers and if a is larger than b --> print
		
//		if (a>b) {
//			System.out.println("a is larger than b");
//		}
//		// If my if condition is true the code will execute on line 14 but if the statement is false it will print in the else condition
//		else {
//			System.out.println("b is larger than a");
//		}
		
		//declare price and if price is higher than expected price --> I will not buy
		
		double shoesPrice=29.99;
		double allowedPrice=31.99;
				
		if(shoesPrice<=allowedPrice) {
			System.out.println("I am buying those shoes");
		
		}else{
			System.out.println("I am not buying those shoes");
		}
		
		int d=502;
		int f=650;
		
		if (d==f) {
			System.out.println("Perfect"); }
		else { 
			System.out.println("not perfect");
		}
		
		}
		
	}

