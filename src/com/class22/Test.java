package com.class22;

public class Test {

	 public static void main(String[] args) {
	        System.out.println("----------------Creating Employee object------");
	        Employee emp= new Employee();
	        emp.salary=90000;
	        emp.getPaid();
	        System.out.println(Employee.department);
	        Employee.work();
//	        emp.work(); //not preferred way 
	        
	        System.out.println("----------------Creating ScrumTeam object------");
	        ScrumTeam st= new ScrumTeam();
	        ScrumTeam.work();
	        st.salary=100000;
	        st.getPaid();
	        st.artifacts="Product Backlog, Sprint Backlog, BurnDown chart";
	        st.ceremonies="Sprint grooming, Sprint Planning, daily standup, Sprint Demo, Sprint Review ";
	        st.attendScrumMeetings();
	        st.workOnArtifacts();
	        
	        System.out.println("----------------Creating Developer object------");
	        Developer dev=new Developer();
	        Developer.work();
	        dev.salary=120000;
	        dev.getPaid();
	        dev.artifacts="Sprint backlog";
	        dev.ceremonies="Sprint grooming, Spring planning, Daily StandUp, Sprint Demo";
	        dev.attendScrumMeetings();
	        dev.code();
	    }

	}
