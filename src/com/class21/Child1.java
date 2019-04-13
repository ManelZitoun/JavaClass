package com.class21;

public class Child1 extends Parent {
	
	static String hairType="curly"; 
	
	public static void main(String[] args) {
		
		Child1 obj=new Child1();
		System.out.println("-----Child 1------");
		System.out.println("Eye color: "+obj.eyeColor);	
		System.out.println("hair color: "+obj.hairColor);	
		System.out.println("Nose: "+obj.nose);
		System.out.println("Hair type: "+hairType);

		obj.sing();

		Parent parentObject=new Parent();
		//you will not be able to access attributes of child 

	}
	
	

}
