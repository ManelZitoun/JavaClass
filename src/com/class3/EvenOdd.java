package com.class3;

import com.class4.CityAndTemperature;

public class EvenOdd {
	public static void main(String[] args) {
		CityAndTemperature temp= new CityAndTemperature();
		temp.hello("hello manel");
		int num=14;
		
		
		//2+2=4
		//4+2=6
		//6+2=8
		
		if(num% 2==0) {
			System.out.println("This number is even");
		}else {
			System.out.println("This number is odd");
		}
		
		int num1=-589;
		
		if(num1>0) {
			System.out.println("The number is positive");
		} else if (num1<0) {
			System.out.println("The number is negative");
		}
		
		boolean isRaining=true;
		
		if (isRaining) {
			System.out.println("Stay home and code");
		} else {
			System.out.println("Take a walk and listen to JAVA");
		}
		int a=29;
		
		System.out.println(a%4);
	}
}
