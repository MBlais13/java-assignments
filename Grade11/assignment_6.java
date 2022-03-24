// Grade 11, Computer Science, Assignment 6

import java.util.Scanner;
import java.text.NumberFormat;

public class assignment_6 {
	public static double newPrice;
	public static double discountAmount;
	public static void main(String[] args) {
		double amountSpent;
		double FortyPercentThreshold = 120;
		double ThirtyPercentThreshold = 80.01;
		double TwentyPercentThreshold = 40.01;
		double TenPercentThreshold = 0.01;

		// information processor
		Scanner input = new Scanner(System.in);
		System.out.println("How much money have you spent?:");
		amountSpent = input.nextDouble();
		input.close();
		NumberFormat money = NumberFormat.getCurrencyInstance();

		// absolutely terrible code. inefficient
		// 40%
		if (amountSpent >= FortyPercentThreshold) {
			discountAmount = amountSpent * 0.4;
			newPrice = amountSpent - discountAmount;
			System.out.println("You have a 40% discount.");
			NewPriceFunction();
		// 30%
		} else if (amountSpent >= ThirtyPercentThreshold) {
			discountAmount = amountSpent * 0.3;
			newPrice = amountSpent - discountAmount;
			System.out.println("You have a 30% discount.");
			NewPriceFunction();
		// 20%
		} else if (amountSpent >= TwentyPercentThreshold) {
			discountAmount = amountSpent * 0.2;
			newPrice = amountSpent - discountAmount;
			System.out.println("You have a 20% discount.");
			NewPriceFunction();
		// 10%
		} else if (amountSpent >= TenPercentThreshold) {
			discountAmount = amountSpent * 0.1;
			newPrice = amountSpent - discountAmount;
			System.out.println("You have a 10% discount.");
			NewPriceFunction();
		}
	}

	static void NewPriceFunction() {
		NumberFormat money = NumberFormat.getCurrencyInstance();// starts the formatting
		System.out.println(money.format(discountAmount));
		// oddly I cant combine line 55,56 into one single line. throws an error, not sure why.
		System.out.println("Your new price is:");
		System.out.println(money.format(newPrice)); // tells you the new price
	}
}

// Made by MBlais with ♥