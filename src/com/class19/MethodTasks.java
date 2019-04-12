package com.class19;

public class MethodTasks {
	
	private String name="John";
	String name1="Bilal";
	protected String name2="Asha";
	public String name3="Tetiana";
	
	public static void main(String[] args) {
		MethodTasks obj=new MethodTasks();
        System.out.println(obj.createName("Manel"));
        System.out.println(obj.name1);
    	System.out.println(obj.name2);
    	System.out.println(obj.name3);
    }
	
	public String createName(String A) {
        String createName="";
        for (int i=A.length()-1;i>=0;i--) {
            createName=createName+A.charAt(i);
        }
        return createName;
    }

}