package com.class24;

public class BankTest {
	
	public static void main(String[] args) {
	Bank money=new Bank();
	System.out.println("Bank Original: $"+money.getBalance(0));
	
	Bank money1=new BankA();
	System.out.println("Bank A: $"+money1.getBalance(1000));
	
	Bank money2=new BankB();
	System.out.println("Bank B: $"+money2.getBalance(1500));
	
	Bank money3=new BankC();
	System.out.println("Bank C: $"+money3.getBalance(2000));

	}
}	
