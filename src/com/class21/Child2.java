package com.class21;

public class Child2 extends Parent {

	static String height="tall"; 
	static String ethnicity="Asian";
	
	public static void main(String[] args) {
		
		Child2 obj=new Child2();
		System.out.println("-----Child 2------");
		System.out.println("Eye color: "+obj.eyeColor);	
		System.out.println("hair color: "+obj.hairColor);	
		System.out.println("Nose: "+obj.nose);
		System.out.println("Height: "+height);
		System.out.println("Child 1 looks more "+ethnicity+" than child 2");
		obj.canSwim(); 
		obj.sing();
		

	}
	
	public void canSwim() {
		System.out.println("Child 2 can swim");
	}
}
