import java.util.Scanner;
import java.text.NumberFormat;

class assignment-7
{

	public static void main(String[] args) {

		double pizzaSize;
		double labourCost = 0.75;
		double rentCost = 0.99;
		double diameterCost = 0.50;
		double subTotal;
		double taxCost = 1.13;
		int amountpizza;
		double totalCost;
		int newCost; // gives the information of newCost

		Scanner input = new Scanner(System.in);// starts input process
		System.out.println("How many pizzas would you like?:");
		amountpizza = input.nextInt();// collects the information
		System.out.println("What pizza size would you like");
		pizzaSize = input.nextDouble(); // collects the information
		input.close(); // ends input process

		NumberFormat money = NumberFormat.getCurrencyInstance(); // starts the formatting process

		if (pizzaSize >= 40) {// if statement to determine the output
			System.out.println("Whoa big pizza! You might need a truck to get this home");
			subTotal = amountpizza * labourCost + amountpizza * rentCost + pizzaSize * diameterCost;// calculates
																									// subtotal
			totalCost = subTotal * taxCost;
			System.out.println("Your subTotal is");
			System.out.println(money.format(subTotal));// collects the information
			System.out.println("Your final price is"); // tells you the information
			System.out.println(money.format(totalCost)); // tells you the total

		} else if (pizzaSize >= 20) {// if statement to determine the output
			System.out.println("This will be delicious!");
			subTotal = amountpizza * labourCost + amountpizza * rentCost + pizzaSize * diameterCost;// calculates
																									// subtotal
			totalCost = subTotal * taxCost;
			System.out.println("Your subTotal is");
			System.out.println(money.format(subTotal));// collects the information
			System.out.println("Your final price is"); // tells you the information
			System.out.println(money.format(totalCost)); // tells you the total

		} else if (pizzaSize >= 1) {// if statement to determine the output
			System.out.println("We are going to make you a cute little pizza");
			subTotal = amountpizza * labourCost + amountpizza * rentCost + pizzaSize * diameterCost;// calculates
																									// subtotal
			totalCost = subTotal * taxCost;
			System.out.println("Your subTotal is");
			System.out.println(money.format(subTotal));// collects the information
			System.out.println("Your final price is"); // tells you the information
			System.out.println(money.format(totalCost)); // tells you the total
		}
	}
}
