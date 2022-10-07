import java.util.Scanner;

public class expressions {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num;
		// input
		System.out.println("-- Please enter in three different numbers --");
		System.out.print("one: ");
		num = input.nextInt();
		System.out.print("two: ");
		num += input.nextInt();
		System.out.print("three: ");
		num += input.nextInt();
		
		// math	and output
		System.out.println("Your number is..." + num);
		System.out.println("The average is..." + num / 3);

		input.close();
	}
}

// Made by MBlais with ♥