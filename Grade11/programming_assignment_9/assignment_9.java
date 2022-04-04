// Grade 11, Computer Science, Assignment 9

// review needed!

package programming_assignment_9;

import java.util.Scanner;

public class assignment_9 {
	public static void main(String[] args) {
		String answer1;
		String answer2;
		String answer3;
		String answer4;
		String answer5;
		String answer6;

		Scanner input = new Scanner(System.in);
		System.out.println("When prompted choose 1 or 2.");
		System.out.println("--------------------------------");
		System.out.println("You are trying to escape a fire.\nYou smell smoke, you start to look for an exit..");

		answer1 = input.next();
		if (answer1.equalsIgnoreCase("Y")) {
			System.out.println("While crawling over to the supplies you bleed out");
			System.out.println("You have died due to blood lose");
			System.exit(0);

		} else if (answer1.equalsIgnoreCase("N")) {
			System.out.println("While you lay there bleeding out slowly you become sleepy and pass out");
			System.out.println("After 2 hours you wake up in the exact same spot");
			System.out.println("You think about what you are going to do to survive out in the wild,");
			System.out.println("While thinking about what to do you see a plane fly over, do you signal it?");
		}

		answer2 = input.next();
		if (answer2.equalsIgnoreCase("Y")) {
			System.out.println(
					"You look around for something to signal the plane and you see a set of flares just out of reach");
			System.out.println("You reach for the flares but the plane is now gone and out of site");

		} else if (answer2.equalsIgnoreCase("N")) {
			System.out.println("You lay there and watch as your only hope for survival leaves you");
			System.out.println("You then decide to try and go for the supplies again and actually make it");
			System.out.println("Do you use the med kit on yourself to heal your wounds?");
		}

		answer3 = input.next();
		if (answer3.equalsIgnoreCase("N")) {
			System.out.println("you don't heal your wounds and lay there while you die to infection");

		} else if (answer3.equalsIgnoreCase("Y")) {
			System.out.println("You heal your wounds and are left with no other supplies for future accidents");
			System.out.println("While searching through other boxes from the crash you find a phone");
			System.out.println("Do you call for help on it?");
		}

		answer4 = input.next();
		if (answer4.equalsIgnoreCase("N")) {
			System.out.println("You sit there and you die because you decided not to call for help for some reason");

		} else if (answer4.equalsIgnoreCase("Y")) {
			System.out.println("You call for help and someone answers, they say they are sending help instantly");
			System.out.println("You are told to stay where you are, do you?");
		}

		answer5 = input.next();
		if (answer5.equalsIgnoreCase("N")) {
			System.out.println(
					"You wander off and die because when they come and search for you, you are nowhere to be found");

		} else if (answer5.equalsIgnoreCase("Y")) {
			System.out.println(
					"You sit and wait like a good person and when they arrive on the crash they find you and you are saved");
			System.out
					.println("The costguards ask you to sit still while they lift you up onto the helicopter, do you?");
		}
		
		answer6 = input.next();
		if (answer6.equalsIgnoreCase("N")) {
			System.out.println("You don't sit still and while they are lifting you up you fall off and die");

		} else if (answer6.equalsIgnoreCase("Y")) {
			System.out.println("You sit still and when they lift you up you don't fall off and die instantly");
			System.out.println("Congrats, you have won the game!");
		}
		
	}
}

// Made by MBlais with ♥