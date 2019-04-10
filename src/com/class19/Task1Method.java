package com.class19;

public class Task1Method {

	 String createEmail(String name, String lastName, String emailType) {
		 String email=name+lastName+"@"+emailType+".com";
		 return email.toLowerCase();
		 
	} 
	 public static void main(String[] args) {
			
			Task1Method obj=new Task1Method();
			String email=obj.createEmail("Manel","Zitoun","gmail");
			System.out.println(email);
			
			email=obj.createEmail("BOB", "SNow", "outlOOK");
			System.out.println(email);
		
		}
		
		
}	