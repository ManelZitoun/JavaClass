package com.class24;

public class Students {
	
	String fullName;
	int age;
	
	public Students(String fullName, int age) {
		this.fullName=fullName;
		this.age=age;
	}
	
	public void displayDetails() {
		System.out.println("Student full name: "+fullName+" Age: "+age);
	}

	public static void main(String[] args) {
		
		Students obj=new Students("John Snow", 30);
		obj.displayDetails();
	}
	
}
