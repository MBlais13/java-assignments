// Grade 11, Computer Science, Counting Program
import java.util.Scanner;

public class counting_program {
	// delay used for slowing down the counting.
	public static int delaybig = 120; // faster for bigger numbers
	public static int delaysmall = 220; // slower for small numbers
	public static int threshold = 20; // threshold for the delay speed change

	public static int answer1;
	public static int answer2;

	public static int countmin;
	public static int countmax;
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// gets the users input and sends it to the counting function
		System.out.println("Count up or down:\n1 : up\n2 : down");
		answer1 = input.nextInt();
		System.out.println("What would you like to count by?");
		answer2 = input.nextInt();
		if (answer1 == 1) {
			System.out.println("What number do you want to count up to?");
			countmax = input.nextInt();
		} else if (answer1 == 2) {
			System.out.println("What number do you want to count down to");
			countmax = input.nextInt();
		}
		input.close();
		System.out.println("--------------------------------------");
		counting();

	}

	static void counting() {
		if (answer1 == 1) { // count up
			countmin = 0;
			while (countmin <= countmax) {
				if (countmax >= threshold) {
					delay(delaybig);
				} else {
					delay(delaysmall);
				}
				System.out.println(countmin);
				countmin = countmin + answer2;
			}
		} else if (answer1 == 2) { // count down
			countmin = 0;
			while (countmax >= countmin) {
				if (countmax >= threshold) {
					delay(delaybig);
				} else {
					delay(delaysmall);
				}
				System.out.println(countmax);
				countmax = countmax - answer2;
			}
		} else {
			System.out.println("Invalid input.");
		}
	}

	static void delay(int ms) {
		try {
			Thread.sleep(ms); // thread.sleep is not recommended.
		} catch (InterruptedException e) {
			System.err.format("IOException: %s%n", e);
		}
	}
}
// Made by MBlais with ♥