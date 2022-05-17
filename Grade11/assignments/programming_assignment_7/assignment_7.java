// Grade 11, Computer Science, Assignment 7

package assignments.programming_assignment_7;

import java.util.Scanner;
import java.text.NumberFormat;

class assignment_7 {
	// pizza attributes
	public static int pizza_quantity;
	public static double pizzaSize;
	// Costs
	public static double labourCost = 0.75;
	public static double rentCost = 0.99;
	public static double diameterCost = 0.50;
	// Prices
	public static double taxCost = 1.13;
	public static double subTotal;
	public static double totalCost;

	public static NumberFormat money = NumberFormat.getCurrencyInstance();

	public static void main(String[] args) {
		System.out.println("Welcome to Putrid Pizza!");
		System.out.println("~~ The one stop pizza place where we only serve; extra extra anchovies and extra extra olives. ~~");
		System.out.println("--------------------------");

		Selection(); // asks customer size and quantity.

		// determines attributes about the pizza
		if (pizzaSize >= 40) {
			System.out.println("Whoa big pizza! You might need a truck to get this home");
			Price();

		} else if (pizzaSize >= 20) {
			System.out.println("This will be delicious!");
			Price();

		} else if (pizzaSize >= 1) {
			System.out.println("We are going to make you a cute little pizza");
			Price();
		}
	}

	static void Price() {
		// subTotal = pizza_quantity * labourCost + pizza_quantity * rentCost + // not correct
		// had to move the math to their own line since it caused problems.
		subTotal = pizza_quantity * diameterCost;
		subTotal = pizza_quantity * labourCost;
		subTotal = pizza_quantity * rentCost;
		totalCost = subTotal * 0.13 + subTotal;
		System.out.println("Your subTotal is: " + money.format(subTotal));
		System.out.println("Your final price is: " + money.format(totalCost));
	}

	// asks customer size and quantity.
	static void Selection() {
		Scanner input = new Scanner(System.in);
		// amount of pizza
		System.out.println("How many pizzas would you like?:");
		pizza_quantity = input.nextInt();
		// size of pizza
		System.out.println("What pizza size would you like? 1-20cm:");
		pizzaSize = input.nextDouble();
		input.close();
	}
}

// Made by MBlais with ♥