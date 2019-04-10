package com.class19;

public class Student {

	char getGrade (int score) {
		if (score>=90) {
			return 'A'; 
		} else if (score>=80) {
			return 'B';
		} else if(score>=70) {
			return 'C';
		} else if (score>=50) {
			return 'D';
		} else {
			return 'F'; 
		}
	}
	
	public static void main(String[] args) {
		
		Student grades=new Student();
		
		System.out.println("My grade at Syntax is "+grades.getGrade(95));
	}

}
