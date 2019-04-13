package com.class21;

public class CallingStaticVsNonStaticClass {
	
	public static void main(String[] args) {
		
		StaticVsNonStatic obj=new StaticVsNonStatic();
		System.out.println(obj.name);
		//access static members by using className they belong too
		System.out.println(StaticVsNonStatic.lastName);
	}

}
