package com.class13;

import java.util.Scanner;

public class StringPractice {
	public static void main(String[] args) {
	
		System.out.println("------Print Sunday in reverse-------");
		
		String rev="Sunday";
        for(int i=rev.length()-1;i>=0;i--) {
            System.out.print(rev.charAt(i));
            System.out.println();
	}
        System.out.println("----Print in the middle of the String-------");
        
     String wow="I am not empty.";
     
     if (!wow.isEmpty()) {
    	 if (wow.length()%2!=0) {
    		 if (wow.length()>3) {
    		     System.out.println(wow.charAt(wow.length()/2));

    		 }
    	 }
     }
     
//     Write a program that reads two people’s first names and if they expecting boy or girl? 
     //Based on the input suggests a name for a baby:
//    	 Example Output:
//    	 Mom’s first name? Mary
//    	 Dad’s first name? Daniel
//    	 Boy or Girl? boy
//    	 Suggested baby name: DANRY
     
     
     Scanner scan=new Scanner(System.in);
     System.out.println("What is the mom's first name?");
     
     
        
        
        
        
        
        
	}
}
