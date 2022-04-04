// Grade 11, Computer Science, Assignment 6

import java.util.Scanner;
import java.text.NumberFormat;

public class assignment_6 {
	// global vars
	public static double newPrice;
	public static double discountAmount;
	public static NumberFormat money = NumberFormat.getCurrencyInstance();

	public static void main(String[] args) {
		double amountSpent;
		// discount amount thresholds
		double FortyPercentThreshold = 120;
		double ThirtyPercentThreshold = 80.01;
		double TwentyPercentThreshold = 40.01;
		double TenPercentThreshold = 0.01;

		// information processor
		Scanner input = new Scanner(System.in);
		System.out.println("How much money have you spent?: ");
		// might be a good idea to add a money format here.
		amountSpent = input.nextDouble();
		input.close();

		// absolutely terrible code. inefficient
		// 40%
		if (amountSpent >= FortyPercentThreshold) {
			discountAmount = amountSpent * 0.4;
			newPrice = amountSpent - discountAmount;
			System.out.println("You have a 40% discount!");
			NewPriceFunction();
			// 30%
		} else if (amountSpent >= ThirtyPercentThreshold) {
			discountAmount = amountSpent * 0.3;
			newPrice = amountSpent - discountAmount;
			System.out.println("You have a 30% discount!");
			NewPriceFunction();
			// 20%
		} else if (amountSpent >= TwentyPercentThreshold) {
			discountAmount = amountSpent * 0.2;
			newPrice = amountSpent - discountAmount;
			System.out.println("You have a 20% discount!");
			NewPriceFunction();
			// 10%
		} else if (amountSpent >= TenPercentThreshold) {
			discountAmount = amountSpent * 0.1;
			newPrice = amountSpent - discountAmount;
			System.out.println("You have a 10% discount!");
			NewPriceFunction();
		}
	}

	// Final - displays the discount amount as well as the new price.
	static void NewPriceFunction() {
		System.out.println("Discount amount: " + money.format(discountAmount));
		System.out.println("Your new price is: " + money.format(newPrice));
	}
}

// Made by MBlais with ♥