package com.class24;

public class PhoneTest {
	
	public static void main(String[] args) {
		System.out.println("Object of Phone");
		Phone phone=new Phone();
		phone.hasCamera();
		phone.makeCall();
		
		System.out.println("Object of iPhone");
		iPhone iphone=new iPhone();
		iphone.hasCamera();
		iphone.makeCall();
		
		System.out.println("Object of Samsung");
		Samsung samsung=new Samsung();
		samsung.hasCamera();
		
		System.out.println("Object of a Nokia");
		Nokia nokia=new Nokia();
		nokia.makeCall();
		nokia.hasCamera();
	}

}
