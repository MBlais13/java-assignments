package assignments.programming_assignment_4;
// Grade 11, Computer Science, Assignment 4

import java.util.Scanner;

public class assignment_4 {
	public static void main(String[] args) {

		// this is a horrible way to do things.. if you are in the mood to write java, feel free to create a PR :)
		double usbCost = 19.99;
		double keyboardCost = 49.99;
		double mouseCost = 25.99;
		int amountUSB;
		int amountKeyboard;
		int amountMouse;
		// -
		double subtotal;
		double tax = 1.13;
		double taxprice;
		double total;
		Scanner input = new Scanner(System.in); // starts input process

		//
		System.out.println("USB storage device: " + usbCost + "$\nKeyboard: " + keyboardCost + "$\nComputer Mouse: "
				+ mouseCost + "$");
		// usb
		System.out.println("How many USB's would you like to purchase?:");
		amountUSB = input.nextInt();
		// keyboards
		System.out.println("How many keyboards would you like to purchase?:");
		amountKeyboard = input.nextInt();
		// mice
		System.out.println("How many mice would you like to purchase?:");
		amountMouse = input.nextInt();
		input.close();

		// total cost calculations
		System.out.println("=============================");
		// subtotal
		subtotal = (usbCost * amountUSB) + (keyboardCost * amountKeyboard) + (mouseCost * amountMouse); // subtotal
		System.out.println("The subtotal is: " + subtotal); // displays cost without tax
		// tax
		total = subtotal * tax; // calculates cost with tax
		taxprice = total - subtotal;
		double rounded_tax = Math.round(taxprice * 100.0) / 100.0; // rounds to two decimals
		System.out.println("The cost of tax is: " + rounded_tax); // displays cost of tax
		// total
		double rounded_total = Math.round(total * 100.0) / 100.0; // rounds to two decimals
		System.out.println("------");
		System.out.println("The total price is: " + rounded_total); // displays cost with tax
	}
}

// Made by MBlais with ♥