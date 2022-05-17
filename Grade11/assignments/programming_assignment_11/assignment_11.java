// Grade 11, Computer Science, Assignment 11

package assignments.programming_assignment_11;

import java.util.Scanner;

public class assignment_11 {
	public static double Xvalue;
	public static double Yvalue;
	public static String answer;
	public static String linebreak = "--------------------------";
	public static double totalanswer;
	public static Scanner input = new Scanner(System.in); // starts the process

	public static void main(String[] args) {

		menu(); // main menu
		math(); // main math functions
	}

	// math functions
	static void math() {
		if (answer.equals("1")) {
			System.out.println("enter one number please");
			Xvalue = input.nextDouble();
			System.out.println("enter another different number");
			Yvalue = input.nextDouble();
			System.out.println(linebreak + "\nthe maxium is: " + (Math.max(Xvalue, Yvalue)));
			menu();

		} else if (answer.equals("2")) {
			System.out.println("enter a number please");
			Xvalue = input.nextDouble();
			System.out.println("enter another different number");
			Yvalue = input.nextDouble();
			System.out.println(linebreak + "\nthe minium is: " + (Math.min(Xvalue, Yvalue)));
			menu();

		} else if (answer.equals("3")) {
			System.out.println("enter a x value");
			Xvalue = input.nextDouble();
			System.out.println("enter a y value");
			Yvalue = input.nextDouble();
			System.out.println(linebreak + "\nthe final answer: " + (Math.pow(Xvalue, Yvalue)));
			menu();

		} else if (answer.equals("4")) {
			System.out.println("enter one leg of a triangle please");
			Xvalue = input.nextDouble();
			System.out.println("enter another leg please");
			Yvalue = input.nextDouble();
			System.out.println(linebreak + "\nthe hypotenuse is: " + (Math.hypot(Xvalue, Yvalue)));
			menu();

		} else if (answer.equals("5")) {
			System.out.println("enter one number");
			Xvalue = input.nextDouble();
			System.out.println(linebreak + "\nthe square root is: " + (Math.sqrt(Xvalue)));
			menu();

		} else if (answer.equals("6")) {
			System.out.println("enter one angle");
			Xvalue = input.nextDouble();
			System.out.println(linebreak + "\nthe answer in radians is: " + (Math.toRadians(Xvalue)));
			menu();
		}
	}

	static void menu() {
		System.out.println(linebreak + "\nPlease choose one of the following\n" + linebreak);
		System.out.println("1: Determine the maximum between two numbers\n2: Determine the minimum between two numbers\n3: Determine x to the power of y\n4: Determine the hypotenuse\n5: Determine the square root\n6: Angle in degrees to convert it to radians\n" + linebreak);
		answer = input.next();
		math();
	}
}

// Made by MBlais with ♥