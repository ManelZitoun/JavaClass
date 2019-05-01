package com.class24;

public class Phone {
	
	public void makeCall() {
		System.out.println("Can make a phone call");
	}
	public void hasCamera() {
		System.out.println("Phone has a camera");
	}

}

class iPhone extends Phone {
	
	public void makeCall() {
		System.out.println("Can make a face time");
	}
	public void hasCamera() {
		System.out.println("iPhone had sual HD camera");
	}
}

class Nokia extends Phone  {
	
	public void cannotBreak() {
		System.out.println("Nokia phones are unbreakable");
	}
	
}

class Samsung extends Phone {
	public void hasCamera() {
		System.out.println("Samsung has 3 lense camera");
	}
}