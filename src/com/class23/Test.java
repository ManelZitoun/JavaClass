package com.class23;

public class Test {
	public void test() {
		System.out.println("I am a public method");
	}
	public int test1() {
		System.out.println("I am a public method");
		return 5;
	}
	protected void test(String str) {
		System.out.println("I am a protected method");
	} 
	private void test (String str, int num) {
		System.out.println("I am private method");
	}
	
	public static void main(String[] args) {
		
		Programming obj=new Programming();
		Programming obj2=new Programming("JAVA"); 
		Programming obj3=new Programming();
		obj3.add(5, 3);
		obj3.add(5, 4, 7);
		obj3.add(6, 77, 99, 10);

		
		
		
	}
}
