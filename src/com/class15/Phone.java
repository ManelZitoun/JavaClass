package com.class15;

public class Phone {
	
	String brand, color;
	int gens, memory;
	
	public static void main(String[] args) {
	
	Phone phone1=new Phone();
	phone1.brand="iPhone";
	phone1.color="black";
	phone1.gens=10;
	phone1.memory=135;
	
	phone1.Texting();
	phone1.Calling();
	phone1.takePictures();
	
	Phone phone2=new Phone();
	phone2.brand="Android";
	phone2.color="white";
	phone2.gens=10;
	phone2.memory=132;
	
	phone2.Texting();
	phone2.Calling();
	phone2.takePictures();
	
	Phone phone3=new Phone();
	phone3.brand="Nokia";
	phone3.color="Silver";
	phone3.gens=5;
	phone3.memory=56;
	
	phone3.Texting();
	phone3.Calling();
	phone3.takePictures();
	
	}
	
	void Texting() {
		System.out.println("I can text on my "+brand);
	} void Calling () {
		System.out.println("I can call on my "+color+" colored "+brand);
	} void takePictures() {
		System.out.println("I can take pictures on my "+gens+" generation "+brand+" that has "+memory+" gigabytes of memory");
	}
	
	
	
	
	
}
