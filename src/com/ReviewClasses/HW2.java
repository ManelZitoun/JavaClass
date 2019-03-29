package com.ReviewClasses;

import java.util.Scanner;

public class HW2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two words");
		String word1 = scan.nextLine();
		String word2 = scan.nextLine();
		System.out.println("Please enter two numbers");
		int int1 = scan.nextInt();
		int int2 = scan.nextInt();

		String result;
		

		if (int1 == int2 && word1.equalsIgnoreCase(word2)) {
			result = "AND";
		} else if (int1 ==int2 || word1 == word2) {
			result = "OR";
		} else {
			result = "NONE";
		}

		System.out.println(result);
	}

}
