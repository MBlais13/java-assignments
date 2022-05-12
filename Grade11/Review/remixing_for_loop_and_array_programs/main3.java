// Grade 11, Computer Science, Assignment Remixing For Loop and Array Programs #3
package remixing_for_loop_and_array_programs;

import java.util.Scanner;

public class main3 {

    public static void main(String[] args) {

        double[] marks = { 34.7, 54.1, 34.8, 99.6, 43.6, 43.2, 65.8, 44.8, 88.6 }; // list of marks
        double total = 0;
        double average;

        System.out.println("These are the marks:");
        for (int i = 0; i <= 8; i = i + 1) {
            System.out.println(marks[i]);
        }

        for (int i = 0; i <= 8; i = i + 1) {
            total = total + marks[i];
        }

        // get average
        average = total / 9;
        average = average * 10;
        average = Math.round(average);
        average = average / 10;

        System.out.println("The average mark is: " + average);
    }
}

// Made by MBlais with ♥