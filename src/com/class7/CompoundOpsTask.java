package com.class7;

public class CompoundOpsTask {
	public static void main(String[] args) {
		
		//Declare variable and increase by 100 using shorthand operator
        //Declare variable and decrease by 67 using shorthand operator
        //Declare variable cakePiece=11 and divide cakePiece between 4 people using shorthand operator
		//Each person should get an equal piece of cake
        //Declare variable cakePiece=25 and divide cakePiece between 7 people
        //Using shorthand operator found out how many pieces of cake left after it was distributed equally among 7 people
		
		int a=50;
		System.out.println(a);
		
		a+=100;
		System.out.println(a); //150
		
		a-=67;
		System.out.println(a);
		
		int cp=11;
		
		cp/=4;
		System.out.println("Each person gets "+cp+" pieces of cake");
		
		int cps=25;
		
		cps%=7;
		System.out.println("The leftover is "+cps+" pieces of cake");
		
		
		
		
		
				
		
	}

}
