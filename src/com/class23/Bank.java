package com.class23;

public class Bank {
	
	public int chargeInterest() {
		return 0;
	}
}
	//1st child class 
	class BOA extends Bank {
		@Override //annotation
		public int chargeInterest( ) {
			return 2;
		}
	}
		
	//2nd child class
		class PNC extends Bank {
			@Override
			public int chargeInterest() {
				return 3; 
			}
	}


