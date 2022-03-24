// Grade 11, Computer Science, Assignment Unit 1

// review needed!
package unit_1_summative_multiple_choice_quiz;

import java.util.Scanner;
import java.text.NumberFormat;

class unit_1_Summative {
    public static void main(String[] args) {

        String guess1;
        String answer1;
        String answer2;
        String answer3;
        String answer4;
        String answer5;
        double wronganswer;
        double rightanswer;
        int right1;
        int right2;
        int right3;
        int right4;
        int right5;
        int wrong1;
        int wrong2;
        int wrong3;
        int wrong4;
        int wrong5;
        double rightanswerDivided;

        System.out.println("Welcome to the cool guy quiz");

        Scanner input = new Scanner(System.in); // starts input process

        // Question 1
        System.out.println("How many seasons are there of the simpsons?");
        System.out.println("a. 20");
        System.out.println("b. 29");
        System.out.println("c. 33");
        System.out.println("d. 40");
        System.out.println("please choose one answer");
        answer1 = input.next();

        if (answer1.equals("c")) {
            System.out.println("Correct!");
            right1 = 1;
            wrong1 = 0;
        } else {
            right1 = 0;
            wrong1 = 1;
            System.out.println("Incorrect!");
        }

        // Question 2
        System.out.println("How many fingers do you have on your hand?");
        System.out.println("a. 20");
        System.out.println("b. 5");
        System.out.println("c. 3");
        System.out.println("d. 4");
        System.out.println("please choose one answer");
        answer2 = input.next();

        if (answer2.equals("d")) {
            System.out.println("Correct!");
            right2 = 1;
            wrong2 = 0;
        } else {
            right2 = 0;
            wrong2 = 1;
            System.out.println("Incorrect");
        }
        // Question 3
        System.out.println("How many stars are there in our solar system?");
        System.out.println("a. 1");
        System.out.println("b. 2");
        System.out.println("c. 1.5");
        System.out.println("d. 1.1");
        answer3 = input.next();

        if (answer3.equals("a")) {
            System.out.println("Correct!");
            right3 = 1;
            wrong3 = 0;
        } else {
            right3 = 0;
            wrong3 = 1;
            System.out.println("Incorrect");
        }
        // Question 4
        System.out.println("How many doors to your house do you have with locks on them?");
        System.out.println("a. 1");
        System.out.println("b. 2");
        System.out.println("c. 4");
        System.out.println("d. 5");
        answer4 = input.next();

        if (answer4.equals("a")) {
            System.out.println("Correct!");
            right4 = 1;
            wrong4 = 0;
        } else {
            right4 = 0;
            wrong4 = 1;
            System.out.println("Incorrect you now have 1!");
        }
        // Question 5
        System.out.println("What is my name?");
        System.out.println("a. Carl");
        System.out.println("b. Sam");
        System.out.println("c. Han");
        System.out.println("d. David");
        answer5 = input.next();

        if (answer5.equals("d")) {
            right5 = 1;
            wrong5 = 0;
            System.out.println("Correct!");
        } else {
            right5 = 0;
            wrong5 = 1;
            System.out.println("Incorrect!");
        }
        NumberFormat percent = NumberFormat.getPercentInstance();// starts percent program

        rightanswer = right1 + right2 + right3 + right4 + right5;// does math to find out how much you got right out of
                                                                 // five
        wronganswer = wrong1 + wrong2 + wrong3 + wrong4 + wrong5;// does math to find out how much you got wrong out of
                                                                 // five
        rightanswerDivided = rightanswer / 5;// does math to get you percent avererage

        System.out.println("On this quiz you got " + rightanswer + " out of 5.0 right on this quiz");
        System.out.println("On this quiz you got " + wronganswer + " out of 5.0 wrong on this quiz");
        //System.out.println("This is your score on the quiz:");  // tells you your percent average
        //System.out.printf("This is your score on the quiz:\n",percent.format(rightanswerDivided));
        System.out.printf(percent.format(rightanswerDivided));
    }
}

// Made by MBlais with ♥