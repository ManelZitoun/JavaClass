package com.class21;

public class ClassStudents {	
//	Write a java program of Class Students that takes students name and 3 subject grades. 
//	Inside your class also have a method to Calculate Average Grade. 
//	Test Student class for 5 different students with different marks. 
//	Your program should print an average mark of each students name.
//	NOTE: please male different names for instance and local variables. (edited) 
	
	String name;
	int historyClass;
	int scienceClass;
	int mathClass;
	
	ClassStudents (String name1) {
		name=name1;
	}
	public static void main(String[] args) {
	ClassStudents obj=new ClassStudents("Carolyn");
	obj.getAverageGrade(80, 90, 77);
	
	ClassStudents obj1=new ClassStudents("Mike");
	obj1.getAverageGrade(90, 90, 77);
	
	ClassStudents obj2=new ClassStudents("Weqas");
	obj2.getAverageGrade(92, 86, 77);
	
	ClassStudents obj3=new ClassStudents("Moe");
	obj3.getAverageGrade(87, 99, 77);
	
	ClassStudents obj4=new ClassStudents("Lucy");
	obj4.getAverageGrade(97, 92, 78);


		
	}

	void getAverageGrade(int a, int b, int c) {
		int aver=0; 
		aver=((a+b+c)/3); 
		System.out.println("Student name: "+name+" Average grade: "+aver);
	} 

}
