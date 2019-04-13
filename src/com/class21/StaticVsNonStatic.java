package com.class21;

public class StaticVsNonStatic {

	public String name="John";

	public static String lastName="Snow";


	public static void main(String[] args) {

	StaticVsNonStatic obj=new StaticVsNonStatic();
	obj.getInfo();

	getInfo1();//within same class we can call it by using method/variable name

	System.out.println(lastName);
	System.out.println(obj.name);//name is an instance variable can only be accessed through obj


	}
	//non static
	public void getInfo() {
	System.out.println("My name is "+name+" and my last name is "+lastName);
	//getInfo1();we can access static methods within no static
	}
	//static method can have an access only to static variables 
	public static void getInfo1() {
	//System.out.println("My name is "+name+" and my last name is "+lastName);
	//will get an error cuz its isnt static 
	System.out.println("I am a static method");
	//getInfo1(); we cannot access no static meetod within static
	}
	}