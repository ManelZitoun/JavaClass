package com.class7;

public class OddNumbers {
	public static void main(String[] args) {
		
		int num=1;
		
		while (num<=20) {
//			System.out.println("I am inside while loop");
			if (num % 2!=0) {
				System.out.println(num);
			} 
			num++;
		}
		
		int num1=10;
		
		while (num1>=10 && num1<=100) {
			if (num1 % 2==0) {
				System.out.println(num1);
		}
		num1++;
	}

}
}