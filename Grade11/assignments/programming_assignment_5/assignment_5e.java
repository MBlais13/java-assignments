package assignments.programming_assignment_5;
// Grade 11, Computer Science, Assignment 5e

import java.util.Scanner;
import java.text.NumberFormat;

public class assignment_5e {

    // other vars
    public static double subTotal;
    public static double totalCost;
    public static double runningTotal;
    private static double itemPrice;
    static boolean ordering = true;
    static Scanner input = new Scanner(System.in);
    public static NumberFormat money = NumberFormat.getCurrencyInstance();
    
    // menu vars
    // This sucks -- this isn't an efficient way of doing this..
    public static String item1 = "Cheese Burger";
    public static String item2 = "Double Stacked Burger";
    public static String item3 = "Drink";
    public static double item_price1 = 4.25;
    public static double item_price2 = 6.50;
    public static double item_price3 = 1.00;

    public static void menu() {
        System.out.println("--------------------------");
        System.out.println("What would you like to purchase? \n1. Cheese Burger ($4.25) \n2. Double Stacked Burger ($6.50)\n3. Soda ($1.00) \n4. Done");
    }

    public static double itemPrice(int foodItem) {
        if (foodItem == 1) {
            System.out.println("You've ordered a " + item1);
            itemPrice = item_price1;
        }
        if (foodItem == 2) {
            System.out.println("You've ordered a " + item2);
            itemPrice = item_price2;
        }
        if (foodItem == 3) {
            System.out.println("You've ordered a " + item3);
            itemPrice = item_price3;
        }
        quantity();
        return itemPrice;
    }

    public static double quantity() {
        System.out.println("Enter quantity: ");
        double quantity = input.nextDouble();
        subTotal(quantity, itemPrice);
        return quantity;
    }

    // calculates the subtotal cost
    public static double subTotal(double quantity, double itemPrice) {
        double subTotal = quantity * itemPrice;
        System.out.println("--------------------------");
        System.out.println("Subtotal: " + money.format(subTotal));
        runningTotal += subTotal;
        return subTotal;
    }

    // calculates the total cost
    public static void done() {
        ordering = false;
        totalCost = runningTotal * 0.13 + runningTotal;
        System.out.println("--------------------------");
        System.out.println("Your subtotal is: " + money.format(runningTotal));
        System.out.println("Your total is: " + money.format(totalCost));
        System.out.println("--------------------------");
        System.out.println("Bye! Come again soon.");
    }

    // makes everything work.
    public static void main(String[] args) {
        System.out.println("Welcome to Blais Burgers!");
        int menuOption;
        int foodItem = 0;
        input = new Scanner(System.in);
        do {
            double runningTotal = 0;
            menu();
            menuOption = input.nextInt();
            switch (menuOption) {
                case 1:
                    foodItem = 1;
                    itemPrice(foodItem);
                    break;
                case 2:
                    foodItem = 2;
                    itemPrice(foodItem);
                    break;
                case 3:
                    foodItem = 3;
                    itemPrice(foodItem);
                    break;
                case 4:
                    done();
                    break;
                default:
                    System.out.println("Invalid option.");
            }

        } while (ordering);
        {
        }
    }
}

// Made by MBlais with ♥