package com.class26;

import java.util.ArrayList;

public class WrapperClass {
	
	public static void main(String[] args) {
		
		int [] a = {10};
		
		Integer integer1=new Integer(10); //Boxing
		System.out.println(integer1);
		Integer integer2=10;
		
		int num=integer1.intValue();  //Unboxing
		System.out.println(num);
		
		
		ArrayList list = new ArrayList();
		
		list.add(integer1);
		
		list.add(10);//auto
		list.add(20);                                                    
		list.add(30);
		
		for (Object object : list) {
			System.out.println(object);
		}
		
	}

}
