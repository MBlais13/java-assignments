
import java.util.Scanner;

public class oddsum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num = 0;
		int total = 0;

		// user input
		System.out.println("Enter a starting number");
		num = input.nextInt();

		// loop calculates the sum of all odd numbers from the number
		for (int i = 1; i <= num; i += 2) {
			total = i + total;
		}

		System.out.println("The sum of the odd numbers are..." + total);

		input.close();
	}
}