import java.util.Scanner;

public class madlib {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your name? >");
        String name = input.nextLine();
        System.out.println("What is your favorite colour? >");
        String color = input.nextLine();
        System.out.println("What is your favorite food? >");
        String food = input.nextLine();
        System.out.println("What is your favorite car? >");
        String car = input.nextLine();

        System.out.println("Hello my name is" + name + ".");
        System.out.println("My favorite color is " + color + " because I think its the best color.");
        System.out.println("I love to eat " + food + ", it is my favorite food!");
        System.out.println("My favorite car is the " + car + ", I think it is the best car ever made!");
        System.out.println("I would love to become happy, successful and have a fulfilled life. ");

        input.close();
    }
}

// Made by MBlais with ♥