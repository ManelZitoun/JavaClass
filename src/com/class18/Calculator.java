package com.class18;

import java.util.Scanner;

public class Calculator {
	

	 int sum(int a, int b, int c) {
		int d = a + b + c;

		return d;
	}

	int average(int a, int b, int c) {
		int e = (a + b + c) / 3;
		return e;
	}

	int min(int a, int b, int c) {
		int min = a;
		if (b < a) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		return min;
	}

	int max(int a, int b, int c) {
		int max = a;

		if (b > a) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		return max;
	}

}
