package review;
// Grade 11, Computer Science, Creating For Loops

import java.util.Scanner;

public class creating_for_loops {
	public static int delayms = 350; // used for slowing down the counting.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice;
		System.out.println("Select one of the following to count:");
		System.out.println("--------------------------------------");
		System.out.println("1 : Count from 0 to 10 by 1");
		System.out.println("2 : Count from 100 to 0 by 10");
		System.out.println("3 : Count from 50 to 500 by 50");
		System.out.println("4 : Count from 6000 to 1000 by 1000");
		choice = input.nextInt();
		input.close();

		if (choice == 1) {
			System.out.println("Counting from 0 to 10 by 1..");
			// breaking this down gets us int i=0, i<=10 means counting up to 10, i+=1 is
			// what its counting by (so in this case adding +1 each time)
			for (int i = 0; i <= 10; i += 1) {
				delay(delayms);
				System.out.println(i);
			}
		} else if (choice == 2) {
			System.out.println("Counting from 100 to 0 by 10..");
			for (int i = 100; i >= 0; i -= 10) { /// i-=10 is the same as i=i-10
				delay(delayms);
				System.out.println(i);
			}
		} else if (choice == 3) {
			System.out.println("Counting from 50 to 500 by 50..");
			for (int i = 50; i <= 500; i += 50) {
				delay(delayms);
				System.out.println(i);
			}
		} else if (choice == 4) {
			System.out.println("Counting from 6000 to 1000 by 1000..");
			for (int i = 6000; i >= 1000; i -= 1000) {
				delay(delayms);
				System.out.println(i);
			}
		} else {
			System.out.println("Invalid choice.");
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