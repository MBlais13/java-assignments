// Grade 11, Computer Science, Assignment 8e

import java.util.Random;

public class assignment_8e {
    public static void main(String[] args) {
        String[] messages = { "You're Amazing!", "You're Nice.",
                "Positivity always wins!",
                "Keep looking up.",
                "A positive mindset brings positive things.",
                "Practice makes perfect!",
                "All our dreams can come true, if we have the courage to pursue them.",
                "Stay positive!" };

        Random rand = new Random();
        int Rand_item = rand.nextInt(messages.length);
        System.out.printf(messages[Rand_item]);
    }
}

// Made by MBlais with ♥