// Grade 11, Computer Science, Assignment Remixing For Loop and Array Programs #2

package assignments.remixing_for_loop_and_array_programs;

import java.util.Scanner;

public class main2 {

    public static void main(String[] args) {
        // vars
        Scanner input = new Scanner(System.in);
        String[] friends = new String[10];

        // input
        System.out.println("Enter the names of five friends: ");
        for (int i = 0; i <= 4; i = i + 1) {
            System.out.print((i + 1) + ": ");
            friends[i] = input.nextLine();
        }

        // output
        System.out.println("----------------------------------------------");
        System.out.println("The second third and fourth names listed were:");
        System.out.println("Second: " + friends[2-1]);
        System.out.println("Third: " + friends[3-1]);
        System.out.println("Fourth: " + friends[4-1]);
        input.close();
    }
}

// Made by MBlais with ♥