package com.class24;

public class Bank {
	
	public int getBalance(int b) {
		return 0; 
	}
}

class BankA extends Bank {
	public int getBalance(int b) {
		return 1000; 
}
}

class BankB extends Bank {
	public int getBalance(int b) {
		return 1500; 
	}
}

class BankC extends Bank {
	public int getBalance(int b) {
		return 2000; 
	}
}