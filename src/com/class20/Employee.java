package com.class20;

public class Employee {
	
	int eID;
	int salary;
	static String CEO="Sumair";
	
	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		emp1.eID=617133;
		emp1.salary=60000;
		emp1.getEmpInfo();
		
		Employee emp2=new Employee();
		emp2.eID=765489;
		emp2.salary=90000;
		emp2.getEmpInfo();

		
	}
	
	public void getEmpInfo () {
		System.out.println("I work at Syntax making $"+salary+" a year. My employee ID is "+eID+" and the CEO is "+CEO);
	}
	
	

}
