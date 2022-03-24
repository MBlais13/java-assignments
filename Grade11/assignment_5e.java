// Grade 11, Computer Science, Assignment 5e

// review needed!
import java.util.Scanner;

public class assignment_5e {

    // other vars
    public double subTotal;
    public static double runningTotal;
    private static double itemPrice;
    static boolean ordering = true;
    static Scanner input = new Scanner(System.in);
    // menu vars
    // This sucks
    String item1 = "Burger";
    String item2 = "Fries";
    String item3 = "Drink";
    double item_price1 = 6.25;
    double item_price2 = 3.50;
    double item_price3 = 1.50;

    public static void menu() {
        System.out.println("Welcome \n1. Burger ($2.00) \n2. Fries ($1.50)\n3. Soda ($1.00) \n4. Done");
    }

    public static double itemPrice(int foodItem) {
        if (foodItem == 1) {
            // burger= $2.00
            System.out.println("You've ordered a burger");
            itemPrice = 2.00;
        }
        if (foodItem == 2) {
            // fries = $1.50
            System.out.println("You've ordered fries");
            itemPrice = 1.50;
        }
        if (foodItem == 3) {
            // soda = $1.00
            System.out.println("You've ordered a soda");
            itemPrice = 1.00;
        }
        quantity();
        return itemPrice;
    }

    public static double quantity() {
        System.out.println("Enter quantity");
        double quantity = input.nextDouble();
        subTotal(quantity, itemPrice);
        return quantity;
    }

    public static double subTotal(double quantity, double itemPrice) {
        double subTotal = quantity * itemPrice;
        System.out.println("Subtotal: " + subTotal);
        runningTotal += subTotal;
        return subTotal;
    }

    public static void done() {
        ordering = false;
        System.out.println(runningTotal);
        System.out.println("Enjoy your meal");
    }

    // the thing that makes everything work.
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