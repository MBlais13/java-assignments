// Grade 11, Computer Science, Assignment Remixing For Loop and Array Programs #3
package assignments.cubes_squares_powers.remixing_for_loop_and_array_programs;

public class main3 {

    public static void main(String[] args) {

        double[] marks = { 34.7, 54.1, 34.8, 99.6, 43.6, 43.2, 65.8, 44.8, 88.6 }; // list of marks
        double total = 0;
        double average;

        // number output + total math
        System.out.println("These are the marks:");
        for (int i = 0; i <= 8; i = i + 1) {
            System.out.println(marks[i]);
            total = total + marks[i];
        }

        // get average
        average = total / 9;
        average = average * 10;
        average = Math.round(average);
        average = average / 10;

        // output
        System.out.println("--------------------------");
        System.out.println("The average mark is: " + average);
    }
}

// Made by MBlais with ♥