package com.class6;

import java.util.Scanner;

public class Who {
	public static void main(String[] args) {
	
		

		   

		        Scanner scan;
		        int age;
		        String name,phone;
		            scan=new Scanner(System.in);
		            System.out.println("Enter your name");
		            name=scan.nextLine();
		            
		            scan=new Scanner(System.in);
		            System.out.println("Enter your phone number");
		            phone=scan.nextLine();
		            //phone1=scan.nextInt();
		            //phone2=scan.nextInt();
		            //phone3=scan.nextInt();
		            scan=new Scanner(System.in);
		            System.out.println("Enter your age");
		            age=scan.nextInt();

		            if(age >=0 ) {
		               //System.out.println("Your name is "+name+" your age is "+age+" and your mobile number is "+"("+phone1+")"+"-"+phone2+"-"+phone3);
		                System.out.println("Your name is ,"+name+" your age is "+age+" and your mobile number is "+phone);
		            }else {
		                System.out.println("The age must be positive");
		            }
		    }


}
