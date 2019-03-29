package com.ReviewClasses;

import java.util.Scanner;

public class WeqasHelp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		for(int i=1;i<=3;i++){
//			//1
//			//2
//			//3
//			System.out.println();
//			for(int j=1;j<=4;j++) {
//				System.out.print(i);
//			}
//		}
		
		
		Scanner scan=new Scanner(System.in);
		String[] days=new String[7];
	    
	    for (int i=0; i<days.length; i++) {
	      System.out.println("Please enter day "+(i+1)+" of the week");
	      days[i]=scan.next();
	    }
	    for (int x=0; x<=days.length-1; x++) {
	      System.out.println(days[x]); 
	    
	      
	    
	    }
//	    
	    
	    
	    
		
		//Write a program that prints the following pattern
        //....1
		//...2
		//..3
		//.4
		//5
		
//		for (int i=1; i<=5; i++) {
//			
//			for (int l=5; l>i; l--) {
//				System.out.print(".");
//			}
//			System.out.println(i);
//		
//		}	
		
		int[] year=new int[11]; 
		
		for (int i=0; i<11; i++) {
			year[i]=2010+1;
			
		} for (int y=0; y<11; y++) {
			System.out.println(year[y]);
		}
		
		    
		    
	}

}
