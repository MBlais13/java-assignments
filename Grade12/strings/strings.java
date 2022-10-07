import java.util.Scanner;

public class strings {
	public static void main(String[] args) {

		// vars
		String phrase, odd;
		String even;
		int phraseLength;
		int mid;
		Scanner input = new Scanner(System.in);

		// user input
		System.out.print("Enter a word that contains at least three characters: ");
		phrase = input.nextLine();
		input.close();

		phraseLength = phrase.length();
		mid = phraseLength / 2;

		// odd number of characters
		if (phraseLength % 2 == 1) {
			odd = phrase.substring(mid - 1, mid + 0);
			System.out.println("The odd middle character is: " + odd);

		// even number of characters
		} else {
			even = phrase.substring(mid - 1, mid + 1);
			System.out.println("The even middle characters are: " + even);
		}
	}
}

// Made by MBlais with ♥