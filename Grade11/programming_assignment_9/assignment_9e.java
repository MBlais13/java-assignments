// Grade 11, Computer Science, Assignment 9

package programming_assignment_9;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class assignment_9e {
	public static double newPrice;
	public static double rollingAnswer = 0;

	public static void main(String[] args) throws InterruptedException {
		System.out.println("When prompted choose 1 or 2.");
		System.out.println("------------------------------");
		Story();

		// answer1 = input.next();
		// if (answer1.equalsIgnoreCase("Y")) {
		// System.out.println("While crawling over to the supplies you bleed out");
		// System.out.println("You have died due to blood lose");
		// System.exit(0);

		// } else if (answer1.equalsIgnoreCase("N")) {
		// System.out.println("While you lay there bleeding out slowly you become sleepy
		// and pass out");
		// System.out.println("After 2 hours you wake up in the exact same spot");
		// System.out.println("You think about what you are going to do to survive out
		// in the wild,");
		// System.out.println("While thinking about what to do you see a plane fly over,
		// do you signal it?");
		// }
	}

	static void Story() throws InterruptedException  {
		Scanner input = new Scanner(System.in);

		System.out.println("You are trying to escape a fire in an office building, do you look for an exit?");
		System.out.println("1 : Look for an exit\n2 : Stay where you are");
		rollingAnswer = 0;
		rollingAnswer = input.nextDouble();
		if (rollingAnswer == 1) {
			System.out.println("------------------------------");
			System.out.println("You find two exits, a window and a door. Which exit do you decide to take?");
			System.out.println("1 : Door\n2 : Window");
			rollingAnswer = 0;
			rollingAnswer = input.nextDouble();
			if (rollingAnswer == 1) {
				System.out.println("------------------------------");
				System.out.println("You whip open the door and you find the lunch room with a freshly baked cake sitting perfectly on the table. Do you decide to eat the cake or continue going?");
				System.out.println("1 : Eat cake\n2 : Find another way");
				rollingAnswer = 0;
				rollingAnswer = input.nextDouble();
				if (rollingAnswer == 1) {
					System.out.println("------------------------------");
					System.out.println("You decide to eat the cake. You get mad because the icing starts to melt due to the heat of the fire, but you`re relieved because now you dont have to pay for cremation!");
					// end of story
				} 
				else if (rollingAnswer == 2) {
					System.out.println("------------------------------");
					System.out.println("You find a stairwell going all the way down to the main floor of the building. You exit the building and see that a plane has crashed into the building between floors 93-99.");
					// end of story
				}

			} else if (rollingAnswer == 2) {
				System.out.println("------------------------------");
				System.out.println("You dive head first through the window in order to get out of the smoke filled room.. while falling you realize that you were in an office building 110 floors tall.. Your body splats all over the pavement on the street below while 12 other pedestrians watch. (including one child traumatizing them for life.)");
				// end of story
			}

		} else if (rollingAnswer == 2) {
			System.out.println("------------------------------");
			System.out.println("You decide to sit and watch as your blood begins to boil and your skin starts to drip due to the excessive heat.");
			Scanner scan = new Scanner(System.in);
			String firstName = scan.next();
			System.out.println("First Name is: "+firstName);
			scan.close();
			// int LA = 4;
			// for (int i = 1; i <= LA; ++i) {
			// 	TimeUnit.SECONDS.sleep(1);
			// 	System.out.println("." + dot);
			// }
			
			System.out.println("You open your eyes and realize you`re alive in a hospital in the year 2055.. The doctor tells you they somehow managed to upload your brain to a database and you now live the rest of your life in a mechanical robot body.");
			// end of story
		}
	}
}

// Made by MBlais with ♥