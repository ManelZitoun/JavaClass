package com.class17;

import com.class17_2.Application;

public class ProtectedClass17 {
 static //
//	public static void main(String[] args) {
//		Application a=new Application();
//		ProtectedClass17 p=new ProtectedClass17();
//		                                                                                             
//
//	}
//	private void PrivateMethod() {
//		
//	}
//	String makeCapital(String name) {
//	    return name.toUpperCase();
//	  }
//		
//		public static void main(String[] args){             
//			System.out.println(makeCapital("test"));
//		}
		
 int negate(int num) {
	 return (num = -num);
 }
	
	//test case below (dont change):
	public static void main(String[] args){
		ProtectedClass17 currentValue=new ProtectedClass17(); 
		System.out.println(currentValue.negate(8)); //should be -8
		System.out.println(currentValue.negate(-2)); //should be 2
	}
}
		
		


