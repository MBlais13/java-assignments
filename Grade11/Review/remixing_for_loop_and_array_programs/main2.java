// Grade 11, Computer Science, Assignment Remixing For Loop and Array Programs #2

package remixing_for_loop_and_array_programs;

import java.util.Scanner;

public class main2 {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        String[] friends = new String[10];

        System.out.println("Enter the names of ten friends: ");
        for (int i = 0; i <= 4; i = i + 1) {
            System.out.print(i+": ");
            friends[i] = Input.nextLine();
        }

        System.out.println("The second third and fourth names listed were:");
        System.out.println("Second: " + friends[2]);
        System.out.println("Third:" + friends[3]);
        System.out.println("Fourth: " + friends[4]);
    }
}

// Made by MBlais with ♥