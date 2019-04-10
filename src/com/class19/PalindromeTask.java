package com.class19;

public class PalindromeTask {
	
	public static void main (String[] args) {
		PalindromeTask obj=new PalindromeTask();
		System.out.println(obj.isPalindrome("Madam"));
	}
	
	public boolean isPalindrome(String str) {
		String reversed="";
		for (int i=str.length()-1;i>=0;i--) {
			reversed=reversed+str.charAt(i);
		} if (reversed.equalsIgnoreCase(str)) {
			return true;
		} else {
			return false; 
		}
		
		
	}
    
    }


