package com.class21;

public class Students {
	
//	Create three  variables  studentName, studentID, and numberOfStudents
//	Create three objects of the Students Class
//	Set the value for studentName, studentID, and increment the numberOfStudents for each object
//	Print out total number of students
	
	static String studentName;
	static int studentID;
	static int numberOfStudents;
	
	  Students (String name, int ID) {
		  studentName=name; 
		  studentID=ID;
	  }  
	  
	  public static void main(String[] args) {
		  
		  Students obj=new Students("Manel", 716133);
		  numberOfStudents++;
		  System.out.println(studentName+" "+studentID+" "+numberOfStudents);
		  Students obj1=new Students("Weqas", 331879);
		  numberOfStudents++;
		  System.out.println(studentName+" "+studentID+" "+numberOfStudents);
		  Students obj2=new Students("Arif", 72627);
		  numberOfStudents++;
		  System.out.println(studentName+" "+studentID+" "+numberOfStudents);

			  
		  
	  }
	
	
	

}
