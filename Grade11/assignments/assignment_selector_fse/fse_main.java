// Grade 11, Computer Science, FSE Assignment

// -- commenting description --
// two dashes = important code comment.
// ** two stars = unnecessary code comment to help understand what something does.

// all code has been formatted with the default, Java by RedHat (default formatter in 'vscode')

// -- clean code tips --
// ** always keep the main variables at the top of a function to keep everything nice and clean. (obviously there are exceptions)
// ** remember that any code that you write is always made with love!! ~~ even if it makes you feel like you're having a mental breakdown ;)
// ** always indent code that is inside of a function or has brackets around it.
// ** keep the ending (curly)bracket indented or in-line with the fist line of the function.
// ** keep spaces in between things inside normal brackets ~~ it should look like //print("I like " + cookies_num + "I also like toast")// instead of //print("I like"+cookies_num+"I also like toast") ~~ it gets worse the longer it is..

// -- checklist --
// add assignment at bottom of file
// remove 'public' (on class and void)
// remove '(String[] args)' on main void
// move any imported packages to the top
// call the assignment from where it says '// ** put assignment here'
// add the assignment into the main menu on line 54 where it says '// counting, for loop (displays assignments for users to choose from)'
// enjoy a nice cup of coffee

// Made with ♥ by:
// ███╗   ███╗    ██████╗     ██╗          █████╗     ██╗    ███████╗
// ████╗ ████║    ██╔══██╗    ██║         ██╔══██╗    ██║    ██╔════╝
// ██╔████╔██║    ██████╔╝    ██║         ███████║    ██║    ███████╗
// ██║╚██╔╝██║    ██╔══██╗    ██║         ██╔══██║    ██║    ╚════██║
// ██║ ╚═╝ ██║    ██████╔╝    ███████╗    ██║  ██║    ██║    ███████║
// ╚═╝     ╚═╝    ╚═════╝     ╚══════╝    ╚═╝  ╚═╝    ╚═╝    ╚══════╝

package assignments.assignment_selector_fse;
// package imports
import java.util.Scanner;
// assignment 3
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

// main program //
public class fse_main {
	public static void main(String[] args) {
		menu(); // displays the main menu
	}

	// main menu
	static void menu() {
		Scanner input = new Scanner(System.in);
		clear();
		int ac = 4; // the amount of assignments you want to display

		System.out.println("=================== fse assignment ===================");
		//
		for (int i = 1; i < ac + 1; i++) { // counting, for loop (displays assignments for users to choose from)
			// ** counts up to display the amount of assignments
			// ** lets break down the for loop
			// ** i = 1, when 'i' is less than 4 it will stop; remember 'i' == the number
			// its counting
			if (i == 3) {
				System.out.println(i + " : water & computer manufacturing assignment");
			} else if (i == 2) {
				System.out.println(i + " : cool assignment 2");
			}
			
			else {
				System.out.println(i + " : assignment " + i);
			}

		}
		//
		System.out.println("69 : Exit ");
		System.out.println("======================================================");

		System.out.print("Select an option: ");
		int menu_input = input.nextInt(); // user input for choice

		// text after user selects their choice
		String printing_text = "================ Printing assignment " + menu_input + " ================";

		// gets users input and runs specified function
		switch (menu_input) {
			// // // // // // // //
			// SWITCH STATEMENTS //
			// // // // // // // //
			case 1: // counting program
				System.out.println(printing_text);
				// ** put assignment here
				finished_menu();
				break;

			case 2:
				System.out.println(printing_text);
				assignment_10.main();
				// ** put assignment here
				finished_menu();
				break;

			case 3:
				System.out.println(printing_text);
				assignment_3.main(); // ** put assignment here
				finished_menu();
				break;

			case 69: // closes the program
				System.out.println("================== Exiting Program! ==================");
				// loading();
				System.exit(1); // ** stops the program
				break;

			default: // invalid choice
				// ** if input doesn't match any of the case statements it will run this
				System.out.println("You have given an invalid input");
				System.out.print("Returning to main menu in..  ");

				for (int i = 5; i > 0; i -= 1) {// countdown timer to return to main menu
					System.out.print("\b" + i);
					delay(1000);
				}

				System.out.print("\breturning");
				menu();
				break;
		}
		input.close();
	}

	static void finished_menu() { // runs after the selected program has finished
		System.out.println("================== Program Finished! ==================");
	}

	static void delay(int ms) { // delays certain actions
		try {
			Thread.sleep(ms); // thread.sleep is not recommended.
		} catch (InterruptedException e) {
			System.err.format("IOException: %s%n", e);
		}
	}

	static void clear() { // clears terminal
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	// // exits program
	// static void loading() {
	// // System.out.println("================== Exiting Program!
	// ==================");
	// String progress_dots =
	// ".......................................................";
	// int stringLength = progress_dots.length();
	// // System.out.print(progress_dots);

	// for (int i = stringLength; i > 0; i -= 1) {// countdown timer to return to
	// main menu
	// System.out.print(".");
	// delay(6);
	// }
	// }
}

// // // // // // // // // // // // //
// PUT ASSIGNMENTS BELOW THIS BREAK //
// // // // // // // // // // // // //

// Grade 11, Computer Science, Assignment 3
class assignment_3 {
	static void main() {
		double water_amount = 1.5; // water per combo
		int combos_amount = 1800; // amount of combos to make
		double result = water_amount * combos_amount;
		System.out.println(
				result + " Tons of water is needed to make " + combos_amount + " computers and monitor combos.");
	}
}



// Grade 11, Computer Science, Assignment 10

class assignment_10 {
	static public Scanner input = new Scanner(System.in);
	static public int[] marks = new int[5];

	static void main() {
		double total = 0;
		double average;

		menu(); // runs input for marks

		for (int i = 0; i <= 4; i = i + 1) {
			total = total + marks[i];
		}

		average = total / 5;
		average = average * 10;
		average = Math.round(average);
		average = average / 10;

		System.out.println("--------------------------\nThe average mark from those five is: " + average); // prints total average from marks
	}

	// prompts user to input marks
	static void menu() {
		System.out.println("Please enter in the last five marks you had on a quiz:\n--------------------------");
		System.out.print("Mark 1: ");
		marks[0] = input.nextInt();
		System.out.print("Mark 2: ");
		marks[1] = input.nextInt();
		System.out.print("Mark 3: ");
		marks[2] = input.nextInt();
		System.out.print("Mark 4: ");
		marks[3] = input.nextInt();
		System.out.print("Mark 5: ");
		marks[4] = input.nextInt();
	}
}

// // // // // // // // // // // // //
// PUT ASSIGNMENTS ABOVE THIS BREAK //
// // // // // // // // // // // // //

// Made by MBlais with ♥