// Grade 11, Computer Science, Assignment Remixing For Loop and Array Programs #1

package review.remixing_for_loop_and_array_programs;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        // vars
        int[] numbers = new int[20]; // max number
        int total = 0; // total number
        Scanner input = new Scanner(System.in);

        // input
        System.out.println("Enter twenty integers and they will be added together:");
        for (int i = 0; i <= 19; i = i + 1) {
            numbers[i] = input.nextInt();
            total = total + numbers[i];
        }

        // output
        System.out.println("-------------------------------------");
        System.out.println("The sum of those numbers are: " + total);
    }
}

// Made by MBlais with ♥