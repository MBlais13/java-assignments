import java.util.Scanner;

public class placevalue {
    public static void main(String[] args) {
        // Create new Scanner
        Scanner input = new Scanner(System.in);

        // Values of each digit
        int hundreds = 0;
        int tens = 0;
        int ones = 0;

        // Prompt user to input 3 digit Number
        System.out.print("Enter a 3 digit number");
        int number = input.nextInt();

        if (number <= 999 && number > 99) // Checking condition for three digit number
        {
            // Displays hundreds place digit
            hundreds = number / 100;
            System.out.printf("Hundreds: " + hundreds);

            // Displays tens digit
            tens = (number - (hundreds * 100)) / 10;
            System.out.printf("\nTens: " + tens);

            // Displays ones digit
            ones = (number - (tens * 10) - (hundreds * 100));
            System.out.printf("\nOnes: " + ones);
        } else {
            if (number > 999);
            System.out.println("Error! Number more than three digits.");
            if (number < 100);
            System.out.println("Error! Number less than three digits.");

        }

        input.close();
    }
}

// Made by MBlais with ♥