package com.ctu.dietel.chapter3;

//Account class with a constructor to validate and 
//initialize instance variable balance of type double.

public class Account {
	private double balance; // instance variable that stores the balance

	// constructor
	public Account(double initialBalance) {
		// validate that initialBalance is greater than 0.0;
		// if it is not, balance is initialized to the default value 0.0
		if (initialBalance > 0.0)
			balance = initialBalance;
	} // end Account constructor

	// credit (add) an amount to the account
	public void credit(double amount) {
		balance = balance + amount; // add amount to balance
	} // end method credit

	// Debit an amount from the account
	public void debit(double amount){
		if(amount > balance){
			System.out.println("Withdraw amount exceeded account balance");
		}else{
			System.out.printf("\nWithdraw %.2f from account balance\n\n", amount);
			balance = balance - amount; 
		}
	} // end method debit
	
	// return the account balance
	public double getBalance() {
		return balance; // gives the value of balance to the calling method
	} // end method getBalance
} // end class Account
