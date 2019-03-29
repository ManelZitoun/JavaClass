package com.class5;

import java.util.Scanner;

public class LogicalOperatorsNestedIfHW {
	public static void main(String[] args) {
	
 	Scanner scan=new Scanner(System.in);
 	System.out.println("Please enter three distinct numbers");
 	int num1=scan.nextInt();
	int num2=scan.nextInt();
	int num3=scan.nextInt();
	int largest; 
	
	if (num1>num2) {
		if (num1>num3) {
			largest=num1;
		} else {
			largest=num3;
		}
	} else {
		if (num2>num3) {
			largest=num2;
		}  else {
	largest=num3;
	}
	
	
	}
	
	System.out.println("The largest number is "+largest);
	
	}

}