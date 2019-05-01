package com.class26;

public class EncapsualationDemo {
	
	 public static void main(String[] args) {
		  EncapsualationDemo myObj = new EncapsualationDemo();
	    myObj.setName("John"); 
	    System.out.println("Employee Name: "+myObj.getName());
	    myObj.setAge(30);
	        System.out.println("Employee Age: "+myObj.getAge());

	  }
	
		   
		  private String empName;
		  private int empAge;
		  
		  public String getName() {
		    return empName;
		  }
		   public int getAge() {
		    return empAge; 
		  }
		  public void setName(String newName) {
		    this.empName = newName;
		  }
		   public void setAge(int newAge) {
		    this.empAge = newAge;   }
		
		} 
	
		
		  


