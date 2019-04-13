package com.class21;

public class SyntaxStudent {
		/*SchoolName
		* batchNumber
		* studentName
		* studentlastName
		*
		* method getStudentDetails
		*/
		    
		    public static String schoolName="Syntax";
		    public static int batchNumber=4;
		    
		    public String studentName;
		    public String studentlastName;
		    
		   public  SyntaxStudent(String name, String lastName) {
		    	studentName=name;
		    	studentlastName=lastName;
		    }
		   

			public void getStudentDetails() {
		    String details="I am a student at "+schoolName+" from batch "+batchNumber+" and my name is "+studentName+" "+studentlastName;
		     System.out.println(details);
		    
		    }
		}


