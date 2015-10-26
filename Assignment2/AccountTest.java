package com.ctu.dietel.chapter3;

//Inputting and outputting floating-point numbers with Account objects.
import java.util.Scanner;

public class AccountTest {
	// main method begins execution of Java application
	public static void main(String[] args) {
		Account account1 = new Account(50.00); // create Account object
		Account account2 = new Account(-7.53); // create Account object

		// display initial balance of each object
		System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
		System.out.printf("account2 balance: $%.2f\n\n", account2.getBalance());

		// create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		double withDrawAmount; // Withdraw amount read from user

		System.out.println("Enter Withdraw amount for account1: "); // prompt
		withDrawAmount = input.nextDouble(); // obtain user input
		account1.debit(withDrawAmount); // deducted from account1 balance

		// display balances
		System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
		System.out.printf("account2 balance: $%.2f\n\n", account2.getBalance());

		System.out.print("Enter Withdraw amount for account2: "); // prompt
		withDrawAmount = input.nextDouble(); // obtain user input
		account2.debit(withDrawAmount); // deducted from account2 balance

		// display balances
		System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
		System.out.printf("account2 balance: $%.2f\n", account2.getBalance());
		
	} // end main
} // end class AccountTest