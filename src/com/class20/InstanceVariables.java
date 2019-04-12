package com.class20;

public class InstanceVariables {
	protected String name="John"; 
	
	public static void main(String[] args) {
		String name="Anna"; 
		System.out.println(name);
		System.out.println("---Changing value of local variable----");
		name="Olga";
		System.out.println(name);
		//creating object 1
		InstanceVariables obj=new InstanceVariables();
		System.out.println("-----Calling the instance variable-------");
		System.out.println(obj.name);
		System.out.println("-----Changing value of instance variable----");
		obj.name="Jack";
		System.out.println(obj.name);
		
		//creating object 2
		
		InstanceVariables obj1=new InstanceVariables();
		System.out.println(obj1.name);
		
	}
	
	public void hello(String name) {
		System.out.println("Hello "+name);
	}

}
