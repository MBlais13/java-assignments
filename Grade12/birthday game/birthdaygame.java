
import java.util.Scanner;

public class birthdaygame {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num1;
		double answer1;
		double finalanswer;

		String menu_text = """
				Welcome to the Birthday Game!
				------------------------------
				Determine your birth month (January = 1, February = 2, March = 3 and so on).
				Multiply that number by 5.
				Add 6 to that number.
				Multiply the number by 4.
				Add 9 to the number.
				Multiply that number by 5.
				Add your birthday to the number (10 if the 10th and so on).
				------------------------------""";
		
		// user input
		System.out.println(menu_text);
		System.out.print("Enter your number: ");
		num1 = input.nextInt();

		// answer
		answer1 = num1 - 165;
		System.out.println("New number is: " + answer1);
		finalanswer = answer1 / 100;
		System.out.println("Your birthday is: " + finalanswer);

		input.close();
	}
}

// Made by MBlais with ♥