import java.util.Scanner;

public class stages {
    public static void main(String[] args) {

        // user input
        Scanner input = new Scanner(System.in);
        int age;
        System.out.println("Please inset your age");
        age = input.nextInt();

        // if (age < 0)
        if (age >= 18) {
            System.out.println("You're an adult");
        } else if (age > 12) {
            System.out.println("You're a teenager");
        } else if (age <= 12) {
            System.out.println("You're a preteen");
        } else if (age <= 10) {
            System.out.println("You're a child");
        } else if (age <= 5) {
            System.out.println("You're a toddler");
        }

        input.close();
    }
}

// Made by MBlais with ♥