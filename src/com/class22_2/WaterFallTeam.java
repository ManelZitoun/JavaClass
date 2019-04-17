package com.class22_2;

import com.class22.Employee;

public class WaterFallTeam extends Employee  {
	public static void main(String[] args) {
		
		WaterFallTeam wt=new WaterFallTeam();
		wt.salary=90000; //can access protected values from diff packages through inheritance 
		//wt.salary;//default values cannot be accessed in different packages 
		
	}

}
