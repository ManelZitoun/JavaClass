package com.class19;

public class MethodTasks {
	
	public static void main(String[] args) {
		MethodTasks obj=new MethodTasks();
        System.out.println(obj.createName("Manel"));
        
    }
	
	protected String createName(String A) {
        String createName="";
        for (int i=A.length()-1;i>=0;i--) {
            createName=createName+A.charAt(i);
        }
        return createName;
    }

}