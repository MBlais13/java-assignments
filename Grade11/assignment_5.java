// Grade 11, Computer Science, Assignment 5

import java.util.Scanner;
import java.text.NumberFormat;

public class assignment_5 {
	public static void main(String[] args) {// main
		double burgerCost = 10.99;// gives value to the food item and tells the computer the price vvv
		double cheeseburgerCost = 13.99;
		double chickenburgerCost = 11.99;
		double friesCost = 5.99;
		double largedrinkCost = 2.99;
		double smalldrinkCost = 1.99;
		double milkshakeCost = 4.99;// gives value to the food item and tells the computer the price^^^
		int burgerAmount;// telling the program the variables for the foods listed vvv
		int cheeseburgerAmount;
		int chickenburgerAmount;
		int friesAmount;
		int largedrinkAmount;
		int smalldrinkAmount;
		int milkshakeAmount;// telling the program the variables for the foods listed ^^^
		double subTotal;// telling the program the variables for the subtotal
		double tax = 0.13;// telling the program what the value of tax is
		double taxTotal;// telling the program the variables for the tax total
		double grandTotal;// telling the program the variables for the grand total
		NumberFormat money = NumberFormat.getCurrencyInstance();// starts the formatting program

		System.out.println("Welcome to The Burger Shack here is the menu.");// Introduces the customer
		System.out.println("_______________________________");// is the menu vvv
		System.out.println("|Food              |Cost      |");
		System.out.println("|-----------------------------|");
		System.out.println("|Burger            |$10.99    |");
		System.out.println("|Cheese Burger     |$13.99    |");
		System.out.println("|Chicken Burger    |$11.99    |");
		System.out.println("|Fries             |$5.99     |");
		System.out.println("|Large Drink       |$2.99     |");
		System.out.println("|Small Drink       |$1.99     |");
		System.out.println("|Milkshake         |$4.99     |");
		System.out.println("|-----------------------------|");// is the menu^^^

		Scanner input = new Scanner(System.in);// starts input process
		System.out.println("How many Burgers do you want?");// Asks customer how many items of food they want vvv
		burgerAmount = input.nextInt();// recieves the information vvv
		System.out.println("How many Cheese Burgers do you want?");
		cheeseburgerAmount = input.nextInt();
		System.out.println("How many Chicken Burgers do you want?");
		chickenburgerAmount = input.nextInt();
		System.out.println("How many Fries do you want?");
		friesAmount = input.nextInt();
		System.out.println("How many Large Drinks do you want?");
		largedrinkAmount = input.nextInt();
		System.out.println("How many Small Drinks do you want?");
		smalldrinkAmount = input.nextInt();
		System.out.println("How many Milkshakes do you want?");// Asks customer how many items of food they want ^^^
		milkshakeAmount = input.nextInt();// recieves the information ^^^
		input.close();// ends input process

		subTotal = (burgerAmount * burgerCost) + (cheeseburgerAmount * cheeseburgerCost)
				+ (chickenburgerAmount * chickenburgerCost) + (friesAmount * friesCost)
				+ (largedrinkAmount * largedrinkCost) + (smalldrinkAmount * smalldrinkCost)
				+ (milkshakeAmount * milkshakeCost);// does mate for base cost
		taxTotal = (subTotal * tax);// does math for tax
		grandTotal = subTotal + taxTotal;// adds tax to base cost

		System.out.println("\n\n\n\n\n\nSubTotal:");// tells total
		System.out.println(money.format(subTotal));// displays total
		System.out.println("Tax:");
		System.out.println(money.format(taxTotal));
		System.out.println("Total:");
		System.out.println(money.format(grandTotal));
	}
}

// Made by MBlais with ♥