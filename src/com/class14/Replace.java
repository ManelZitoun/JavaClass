package com.class14;

public class Replace {
	public static void main(String[] args) {
		
	String str="I am a good tester!";
	String newStr=str.replace("a", "e");
	System.out.println(newStr);
	
	String newStr1=str.replace("good", "great");
	System.out.println(newStr1);
	
	String newStr2=str.replace("tester", "programmer");
	
	str=str.replace("!", "?");
	
	System.out.println(str);
		
	//
	String str1="12Hello 3234 World 465%^";
	String replaced=str1.replaceAll("[0-9]", "");
	System.out.println(replaced);
	
	String replacedNoChar=replaced.replaceAll("[A-Za-z]", "");
	System.out.println(replacedNoChar);
	//^=NOT just like ! for int
	String newString=replaced.replaceAll("[^A-Za-z]", "");
	System.out.println(newString);
	
	String str2="1Hello123";
	System.out.println((str2.replaceAll("[^0-9]", "")));
		
		
	}

}
