// Grade 11, Computer Science, Assignment 6

import java.util.Scanner;
import java.text.NumberFormat;

public class assignment_6 {
	public static void main(String[] args) {
		double amountSpent;
		int fortyPercent = 120;
		double thirtyPercent = 80.01;
		double twentyPercent = 40.01;
		double tenPercent = 0.01;
		double discountAmount;
		double newCost;// gives the variables the names and amounts ^^^

		Scanner input = new Scanner(System.in);// starts input process
		System.out.println("How much money have you spent?:");
		amountSpent = input.nextDouble();// collects the information
		input.close();// ends input process
		NumberFormat money = NumberFormat.getCurrencyInstance();// starts the formatting

		if (amountSpent >= fortyPercent) {
			discountAmount = amountSpent * 0.4;// gets the discountAmount
			newCost = amountSpent - discountAmount;// subtracts the discount from the original cost
			System.out.println("You have a forty percent discount.");

			System.out.println(money.format(discountAmount));// tells you the discountAmount
			System.out.println("Your newCost is");
			System.out.println(money.format(newCost)); // tells you the new price

		} else if (amountSpent >= thirtyPercent) {
			discountAmount = amountSpent * 0.3;// gets the discountAmount
			newCost = amountSpent - discountAmount;// subtracts the discount from the original cost
			System.out.println("You have a thirty percent discount.");

			System.out.println(money.format(discountAmount));// tells you the discountAmount
			System.out.println("Your newCost is");
			System.out.println(money.format(newCost)); // tells you the new price

		} else if (amountSpent >= twentyPercent) {
			discountAmount = amountSpent * 0.2;// gets the discountAmount
			newCost = amountSpent - discountAmount;// subtracts the discount from the original cost
			System.out.println("You have a twenty percent discount.");

			System.out.println(money.format(discountAmount));// tells you the discountAmount
			System.out.println("Your newCost is");
			System.out.println(money.format(newCost)); // tells you the new price

		} else if (amountSpent >= tenPercent) {
			discountAmount = amountSpent * 0.1;// gets the discountAmount
			newCost = amountSpent - discountAmount;// subtracts the discount from the original cost
			System.out.println("You have a ten percent discount.");

			System.out.println(money.format(discountAmount));// tells you the discountAmount
			System.out.println("Your newCost is");
			System.out.println(money.format(newCost)); // tells you the new price
		}

	}
}

// Made by MBlais with ♥