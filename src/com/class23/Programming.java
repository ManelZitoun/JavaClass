package com.class23;

public class Programming {
	
	Programming() {
		System.out.println("I love programming languages");
	}
	Programming(String str)  {
		System.out.println("I love "+str);
	}
	
	static void add (int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	static void add (int a, int b, int c) {
		int d=a+b+c;
		System.out.println(d);
	} 
	static void add (int a, int b, int c, int d) {
		int e=a+b+c+d;
		System.out.println(e);
	}
	
	private void wow(int d, int e) {
		System.out.println(d*e);
	}
	private void wow(int f, int j, int k) {
		System.out.println(f*j*k);
	}
	private void wow(int z, int m, int i, int f) {
		System.out.println(z*m*i*f);
	}
	public void sheet(int a, int b, int c) {
		System.out.println(a*b*c);
	}
	public void sheet(int a, int b, int c, int d) {
		System.out.println(a*b*c*d);
	}

}
