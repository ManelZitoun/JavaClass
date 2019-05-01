package com.ReviewClasses;

class SuperKeyword{
	SuperKeyword (String a) {
		System.out.println("This is the parent");
	}
	SuperKeyword (String a, String b) {
		System.out.println("This is parent with 2 parameters");
	}
	
}

public class ChildSuper extends SuperKeyword {
	
	ChildSuper(String a) {
		super(a);
		System.out.println("This is child with 1 parameter");
	}
	
	ChildSuper (String a, String b) {
		super(a, b);
		System.out.println("This is child with 2 parameters");
	}
	
		

public static void main(String[] args) {
	ChildSuper a=new ChildSuper("Mom", "Dad"); 
	
}
}


