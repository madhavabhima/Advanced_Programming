package com.ctu.dietel.chapter2;

import java.util.Scanner;

public class EvenOrOddNumber {

	public static void main(String[] args) {

		int num;
		Scanner number = new Scanner(System.in);

		System.out.print("Enter any Number: ");
		num = number.nextInt();

		if (num % 2 == 0) {
			System.out.printf("\nThe Number %d is Even Number.\n", num);
		} else {
			System.out.printf("\nThe Number %d is Odd Number.\n", num);
		}

	} // end of main method
} // end of class
