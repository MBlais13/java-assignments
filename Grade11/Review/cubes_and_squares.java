package review;
// Grade 11, Computer Science, Cubes and squares
import java.util.Scanner;
import java.lang.Math;

public class cubes_and_squares {
	public static Scanner input = new Scanner(System.in);
	public static double answer;

	public static void main(String[] args) {

		menu(); // displays the main menu of the program
	}

	static void menu() { // displays main menu.
		System.out.println("--------------------------------------");
		System.out.println("1 : find the value of a number squared");
		System.out.println("2 : find the value of a number cubed");
		System.out.println("3 : find the value of a number to the power of");
		System.out.println("4 : to exit program");
		System.out.println("--------------------------------------");
		answer = 0;
		answer = input.nextInt();

		compute(); // where all of the main functions are
	}

	static void menu2() { // displays second menu
		System.out.println("--------------------------------------");
		System.out.println("1 : Return to menu");
		System.out.println("2 : Exit program");
		System.out.println("--------------------------------------");
		answer = 0;
		answer = input.nextInt();

		if (answer == 1) {
			menu();
		} else if (answer == 2) {
			System.out.println("--------------------------------------");
			System.out.println("Exiting the program..");
			System.exit(1);
		}
	}

	static void compute() { // function that does all the math for the questions
		double totalanswer;
		double number;
		double exponent;
		// double power;

		if (answer == 1) { // square
			System.out.println("What number would you like to square?");
			number = input.nextInt();
			totalanswer = number * number;
			System.out.println("--------------------------------------");
			System.out.println("Answer: " + number + ("x") + number + ("=") + totalanswer);
			menu2(); // displays the second menu of the program

		} else if (answer == 2) { // cube
			System.out.println("What number would you like to cube?");
			number = input.nextInt();
			totalanswer = number * number * number;
			System.out.println("--------------------------------------");
			System.out.println("Answer: " + number + ("x") + number + ("x") + number + ("=") + totalanswer);
			menu2(); // displays the second menu of the program

		} else if (answer == 3) { // power
			System.out.println("What number would you like to power?");
			number = input.nextInt();
			System.out.println("What exponent would you like your number to have");
			exponent = input.nextInt();
			totalanswer = Math.pow(number, exponent);
			System.out.println("--------------------------------------");
			System.out.println("Answer: " + number + ("^") + exponent + ("=") + totalanswer);
			menu2(); // displays the second menu of the program

		} else if (answer == 4) { // exit
			System.out.println("--------------------------------------");
			System.out.println("Exiting the program..");
			System.exit(1);
		}
	}
}
// Made by MBlais with ♥