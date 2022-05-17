// Grade 11, Computer Science, Assignment 12

package assignments.programming_assignment_12;

import java.util.Scanner;

public class assignment_12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner keyedInput = new Scanner(System.in);
		int choice;

		double Xvalue;
		double Yvalue;
		double answer;
		double Zvalue;
		double totalanswer;
		answer = 0;

		while (answer <= 5) {
			System.out.println("-----------------------------------");
			System.out.println("Please choose one of the following");
			System.out.println("1: Find the perimeter\n2: Find volume\n3: Determine radius\n4: Determine diameter\n5: Find area");
			answer = input.nextInt();

			if (answer == 1) {
				System.out.println("Give one side length of the square");
				Xvalue = input.nextDouble();
				perimeterSquare(Xvalue);

			} else if (answer == 2) {
				System.out.println("Give the length of a rectangle side");
				Xvalue = input.nextDouble();
				System.out.println("Give the height of a rectangle");
				Yvalue = input.nextDouble();
				System.out.println("Give the width of a rectangle");
				Zvalue = input.nextDouble();
				volumeRectangle(Xvalue, Yvalue, Zvalue);

			} else if (answer == 3) {
				System.out.println("input diameter to find the radius of the circle");
				Xvalue = input.nextDouble();
				radiusCircle(Xvalue);

			} else if (answer == 4) {
				System.out.println("input the circumference to find the diameter of the circle");
				Xvalue = input.nextDouble();
				diameterCircle(Xvalue);

			} else if (answer == 5) {
				System.out.println("input the side length to find the area of the sqaure");
				Xvalue = input.nextDouble();
				areaSquare(Xvalue);

			} else {
				System.out.println("Exit");
			}
		}
	}

	// function finds the perimeter of the square
	public static void perimeterSquare(double n1) {
		double totalanswer = n1 + n1 + n1 + n1;
		System.out.println("The perimeter is: "+(n1 + ("+") + n1 + ("+") + n1 + ("+") + n1 + ("=") + totalanswer));
	}

	// function finds the volume of a rectangle
	public static void volumeRectangle(double n1, double n2, double n3) {
		double totalanswer = n1 * n2 * n3;
		System.out.println("The volume of the rectangle is: "+(n1 + ("x") + n2 + ("x") + n3 + ("=") + totalanswer));
	}

	// function finds the radius of a circle
	public static void radiusCircle(double n1) {
		double totalanswer = n1 / 2;
		System.out.println("The radius of the circle: "+(n1 + ("/") + 2 + ("=") + totalanswer));
	}

	// function finds the diameter of a circle
	public static void diameterCircle(double n1) {
		double totalanswer = n1 / 3.14;
		System.out.println("The diameter of the circle is: "+(n1 + ("/") + 3.14 + ("=") + totalanswer));
	}

	// function finds the area of a square
	public static void areaSquare(double n1) {
		double totalanswer = n1 * n1;
		System.out.println("The area of the square is: "+(n1 + ("*") + n1 + ("=") + totalanswer));
	}
}

// Made by MBlais with ♥