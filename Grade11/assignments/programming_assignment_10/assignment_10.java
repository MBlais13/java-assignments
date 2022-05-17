// Grade 11, Computer Science, Assignment 10

package assignments.programming_assignment_10;

import java.util.Scanner;

public class assignment_10 {
	static public Scanner input = new Scanner(System.in);
	static public int[] marks = new int[5];

	public static void main(String[] args) {
		double total = 0;
		double average;

		menu(); // runs input for marks

		for (int i = 0; i <= 4; i = i + 1) {
			total = total + marks[i];
		}

		average = total / 5;
		average = average * 10;
		average = Math.round(average);
		average = average / 10;

		System.out.println("--------------------------\nThe average mark from those five is: " + average); // prints total average from marks
	}

	// prompts user to input marks *could have used a loop
	static void menu() {
		System.out.println("Please enter in the last five marks you had on a quiz:\n--------------------------");
		System.out.print("Mark 1: ");
		marks[0] = input.nextInt();
		System.out.print("Mark 2: ");
		marks[1] = input.nextInt();
		System.out.print("Mark 3: ");
		marks[2] = input.nextInt();
		System.out.print("Mark 4: ");
		marks[3] = input.nextInt();
		System.out.print("Mark 5: ");
		marks[4] = input.nextInt();
	}
}

// Made by MBlais with ♥