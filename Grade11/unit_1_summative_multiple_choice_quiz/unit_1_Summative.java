// Grade 11, Computer Science, Assignment Unit 1

package unit_1_summative_multiple_choice_quiz;

import java.util.Scanner;

class unit_1_Summative {
    public static Scanner input = new Scanner(System.in);
    public static int rollingAnswer = 0; // when the user selects an answer it will keep it temporarily
    public static int rollingWrong = 0; // keeps a total of the wrong answers
    public static int rollingRight = 0; // keeps a total of the right answers
    public static boolean passedTest = false; // UNUSED - determines whether you passed the test or not
    public static int passRate = 60; // the rate it will pass the user. testfinish() function uses this

    public static void main(String[] args) {
        System.out.println("Welcome to my quiz!");

        questions(); // prompts user with questions
        testfinish(); // displays final test scores
    }

    static void questions() {
        // Question 1
        System.out.println(rollingRight);
        System.out.println(
                "--------------------------\nHow many terabytes of free space do I have at the time of writing this?");
        System.out.println("1 : 1\n2 : 8\n3 : 24\n4 : not enough");
        rollingAnswer = input.nextInt();
        if (rollingAnswer == 4) {
            rollingRight = rollingRight + 1;
            System.out.println("Correct!");
        } else {
            rollingWrong = rollingWrong + 1;
            System.out.println("Sorry, wrong answer.");
        }

        // Question 2
        System.out.println("--------------------------\nDo I like school?");
        System.out.println(
                "1 : Yes\n2 : I find it fun\n3 : Absolutely not!\n4 : I wish I could spend more time at school");
        rollingAnswer = input.nextInt();
        if (rollingAnswer == 3) {
            rollingRight = rollingRight + 1;
            System.out.println("Correct!");
        } else {
            rollingWrong = rollingWrong + 1;
            System.out.println("Sorry, wrong answer.");
        }

        // Question 3
        System.out.println("--------------------------\nWhat am I interested in?");
        System.out.println("1 : Computers\n2 : I.T\n3 : Game development\n4 : All of the above");
        rollingAnswer = input.nextInt();
        if (rollingAnswer == 4) {
            rollingRight = rollingRight + 1;
            System.out.println("Correct!");
        } else {
            rollingWrong = rollingWrong + 1;
            System.out.println("Sorry, wrong answer.");
        }

        // Question 4
        System.out.println("--------------------------\nWhy do we have to use java?");
        System.out.println(
                "1 : Because Java sucks\n2 : All of the above\n3 : Java is amazing\n4 : Java is the best language");
        rollingAnswer = input.nextInt();
        if (rollingAnswer == 1) {
            rollingRight = rollingRight + 1;
            System.out.println("Correct!");
        } else {
            rollingWrong = rollingWrong + 1;
            System.out.println("Sorry, wrong answer.");
        }

        // Question 5
        System.out.println("--------------------------\nWhats my last name?");
        System.out.println("1 : Blais\n2 : Blaise\n3 : Blaze\n4 : Reaume");
        if (rollingAnswer == 1) {
            rollingRight = rollingRight + 1;
            System.out.println("Correct!");
        } else if (rollingAnswer == 4) {
            rollingRight = rollingRight + 1;
            System.out.println("Correct!");
        } else {
            rollingWrong = rollingWrong + 1;
            System.out.println("Sorry, wrong answer.");
        }
    }

    static void testfinish() {
        double totalQuestions = 5;
        double totalpercent = rollingRight / totalQuestions * 100;

        if (totalpercent >= passRate) { // passed quiz (pass rate is set to 60%)
            passedTest = true;
            System.out.println("--------------------------\n- You Passed! -\n--------------------------");
            System.out.println(totalpercent + "%!");
            System.out.println("You got " + rollingRight + " questions correct!");
            System.out.println("You got " + rollingWrong + " questions incorrect.");
        } else { // did not pass quiz
            System.out.println("--------------------------\n- You did not pass :( -\n--------------------------");
            System.out.println(totalpercent + "%");
            System.out.println("You got " + rollingRight + " questions correct.");
            System.out.println("You got " + rollingWrong + " questions incorrect.");
        }
    }
}

// Made by MBlais with ♥