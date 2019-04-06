package com.class14;

import java.util.Scanner;

public class InterveiwQPractice {
	public static void main(String[] args) {
		//Write a program to swap 2 numbers without a temporary variable? 
		//Swap 2 strings without a temporary variable
		
		System.out.println("Swapping 2 int");
		
		int a=10;
		int b=5;
		
		a=a*b;
		System.out.println(a);
		b=a/b;
		System.out.println(b);
		a=a/b; 
		System.out.println(a);
		
		System.out.println("Int a is now "+a);
		System.out.println("int b is now "+b);
		
		System.out.println();
		System.out.println("Swapping 2 Strings");
		
		String c="Hello";
		String d="World";
		
		System.out.println("String c is "+c+ " and String d is "+d);
		
		c=c+d;
		
        d = c.substring(0,c.length()-d.length()); 
        c = c.substring(d.length()); 

        System.out.println("String c is now "+c+" and String d is now "+d);
        
        System.out.println();
        System.out.println("Max & min value");
        
        int[] arr= {2, 7, 9, 12, 40, 99, 67};
         
        int max=arr[0];
//        
        for (int i: arr) {
        	if (i>max) {
        		max=i;    }
        }
//        
       
        
        System.out.println("The max number is " + max);
        
        int min=arr[0];
        
        for (int i: arr) {
        	if (i<min) {
        		min=i;    }
        }	
        System.out.println("The min number is "+min);
        System.out.println();
        
        System.out.println("Find second largest number in array");
          int secMax=arr[0];
          
        for (int e=0; e<arr.length; e++) {
        	if (arr[e]>max) {
        		secMax=max;
        		max=arr[e];
        	} else if (arr[e]>secMax) {
        		secMax=arr[e];
        	} else if(arr[e]<min) {
        		min=arr[e];
        	}
        }
        
        System.out.println("The second largest number is "+secMax);
        		
        System.out.println();
        
        System.out.println("Part of string from a string; substring; # of words in string");
     	
        String four="How to find out the part of the string from a string";
        
        //a.        How to find out the part of the string from a string?
         String needed ="substring";
         System.out.println(four.contains(needed));

         //b.      What is substring?
         //    Substring it’s a String of a String
         //
        //c.     Find number of words in string?
         String newstr1=four.replaceAll("[A-Za-z]", "");
         System.out.println(newstr1.length());
         String[] words=four.split(" ");
         System.out.println(words.length);
         
         System.out.println("Reversing string word by word");
         
         String str="How much longer are we going to be here";
         
         int strLeng = str.length()-1;
         
         String reverse = "", temp = "";

         for(int i = 0; i <= strLeng; i++){
             temp += str.charAt(i);
             if((str.charAt(i) == ' ') || (i == strLeng)){
                 for(int j = temp.length()-1; j >= 0; j--){
                     reverse += temp.charAt(j);
                     if((j == 0) && (i != strLeng))
                         reverse += " ";
                 }
                 temp = "";
             }
             
             
         }
         System.out.println(reverse);
         System.out.println();
         
         System.out.println("Palindrome");
         
         String str1="nurses run";
         String hey=str1.replace(" ", ""); 
         System.out.println(hey);

         String rev="";

         for(int i=hey.length();i>0;i--) {
         rev=rev+hey.substring(i-1,i); }
         System.out.println(rev);
        
         if (hey.equals(rev)) {
        	 System.out.println("This is a palindrome");
         } else {
        	 System.out.println("It isn't a palindrome");
         }
         System.out.println();
         System.out.println("Fabionacci Code");
         
         int n = 10, t1 = 0, t2 = 1;
         System.out.print("First " + n + " terms: ");

         for (int i = 1; i <= n; ++i)
         {
             System.out.print(t1 + " + ");

             int sum = t1 + t2;
             t1 = t2;
             t2 = sum;
         }
         
         System.out.println();
         System.out.println("Prime numbers");
         System.out.println();
         
         int i =0;
         int num =0;
         //Empty String
         String  primeNumbers = "";

         for (i = 1; i <= 100; i++)         
         { 		  	  
            int counter=0; 	  
            for(num =i; num>=1; num--)
  	  {
               if(i%num==0)
  	     {
   		counter = counter + 1;
  	     }
  	  }
  	  if (counter ==2)
  	  {
  	     //Appended the Prime number to the String
  	     primeNumbers = primeNumbers + i + " ";
  	  }	
         }	
         System.out.println("Prime numbers from 1 to 100 are :");
         System.out.println(primeNumbers);
         
         Scanner sc = new Scanner(System.in); 
         String x="ChRoME";
         String y="FireFOX";
         String z="Ie";
       System.out.println("Enter the browser name to proceed further with execution");
        String browser = sc.nextLine(); 
         if (browser.equals(x)) {
           System.out.println("Proceed with chrome browser");
         } else if (browser.equals(y)) {
           System.out.println("Proceed with firefox Browser");
         } else if (browser.equals(z)) {
           System.out.println("Proceed with ie Browser");
         } else {
           System.out.println("Invalid Browser"); 
         }
        
       }
     
         
         
         }
         
	
         
	


