package com.class23;



public class BankTest {
	
	public static void main(String[] args) {
		Bank bank=new Bank();
		Bank boa=new BOA();
		Bank pnc=new PNC();
		
		int interestRate;
		
		interestRate=bank.chargeInterest();
		System.out.println("Bank charges interest rate of "+interestRate+"%");
		
		interestRate=boa.chargeInterest();
		System.out.println("BOA charges interest rate of "+interestRate+"%");
		
		interestRate=pnc.chargeInterest();
		System.out.println("PNC charges interest rate of "+interestRate+"%");
	}

}
