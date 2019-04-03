package com.ReviewClasses;

public class More2DArrays {
	public static void main(String[] args) {
		
		/**
         * length()
         * toLowerCase()
         * toUpperCase()
         * equals(Object anObject)
         * equalsIgnoreCase(String anotherString)
         * contains(String anotherString)
         * startsWith(String prefix)
         * endsWith(String suffix) isEmpty()
         * concat(String str)
         * trim()
         * charAt(int index)
         * indexOf(int ch)
         * substring(int beginIndex)
         * substring(int beginIndex, int endIndex)
         *
         */
        
        
        /**
        * Write a program that:
        * Converts all the characters in the string to lower case and prints.
        * Converts all the characters in the string to upper case and prints.
        * Checks whether the string/paragraph starts and ends with the string or word "The" and prints.
        * Counts the number of letter 'a' in the string/paragraph and prints.
        * Prints the second half of the string/paragraph.
        * Prints characters between the 10th and 20th indices(inclusive).
        * Prints the string/Paragraph in reverse order.
        * Clears/removes all white spaces or tabs on both ends and prints.
        */

//       String para = "The quick brown fox jumps over the lazy dog.";
//       String newString=para.toLowerCase();
//       System.out.println(newString);
//       
//       String newString1=para.toUpperCase();
//       System.out.println(newString1);
//       
//       boolean newString2=para.equals("The");
//       System.out.println(newString2);
//       
//       boolean newString3=para.startsWith("The");
//       System.out.println(newString3);
//       
//       boolean newString4=para.endsWith("The");
//       System.out.println(newString4);
//       
//       int sum=0;
//       for (int i=0; i<para.length(); i++) {
//       if(para.charAt(i)=='a') {
//           sum++;
//           }
//       }
//       System.out.println(sum);
       String para = "The quick brown fox jumps over the lazy dog.";
       System.out.println(para.substring(para.length()/2));
       System.out.println(para.substring(10, 20));
//	       String para = "The quick brown fox jumps over the lazy dog.";
//System.out.println(para.length());
//System.out.println(para.length()-1);
//       for (int i=para.length()-1; i>=0; i--) {
//    	   System.out.print(para.charAt(i));
//       }
//       
//       System.out.println(para.trim());
 
       
	
	}

}
