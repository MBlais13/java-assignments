// Grade 11, Computer Science, FSE Bank Application Assignment

package assignments.fse_putting_it_all_together;

import java.util.Scanner;
import javax.swing.text.html.HTMLEditorKit.Parser;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import java.io.*;
import java.net.URL;
import java.net.*;

// write to json file
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

class Accounts {

	// custom vars
	double Compound_interest_rate = 1.12; // Interest Rate
	double min_balance = 10; // Minimum account balance
	double service_charge = 0; // Service charge that gets added to each withdrawal
	public static int debug_mode = 0; // 1 = true

	// static vars
	public static String File_Loc;
	public static JSONObject jsonObject;
	public static String customer_name;
	public static String dob;
	public static String account_no;
	public static String type_of_account;
	public static double balance; // Initial Balance
	// String type_of_account;
	double withdraw_amount;
	double deposite_amount;
	public static NumberFormat moneyformatter = NumberFormat.getCurrencyInstance();

	// Method to show Account Information
	// String customer_name, String dob, String account_no, String type_of_account
	void Show_Account_Holder_Info() {
		try {
			// print account details
			System.out.println("Name: " + customer_name);
			System.out.println("Date of birth: " + dob);
			System.out.println("Balance: " + balance);
			System.out.println("Account number: " + account_no);
			System.out.println("Type of account: " + type_of_account);

			// printing an array
			// System.out.println("Subjects:");
			// Iterator iterator = subjects.iterator();
			// while (iterator.hasNext()) {
			// System.out.println(iterator.next());
			// }
		} catch (Exception e) {
			e.printStackTrace();
			bank_app_test.support("json_error");
		}
	}

	// Method for Update Balance
	void UpdateBal() {

		// double bal = balance;
		// double bal = Double.parseDouble(balance); // changing string to double
		// String balform = moneyformatter.format(bal);
		// System.out.println(bal);
		String bal = String.valueOf(balance); // Turns balance(int) into a string
		jsonObject.remove("balance");
		jsonObject.put("balance", bal);

		System.out.println("Updated Balance  = " + bal);
		// writes data to the provided json file
		try (FileWriter filewriter = new FileWriter(File_Loc)) {
			filewriter.write(jsonObject.toJSONString());
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// catch block
			e.printStackTrace();
			bank_app_test.support("write_error");
		}
	}
}

// Current Account Class
class Current_Account extends Accounts {

	// Method for Withdraw in Current Account
	void Withdraw(double withdraw_amount) {
		if (withdraw_amount > 0) {
			if ((withdraw_amount - balance) < 0) {
				balance = balance - withdraw_amount;
				balance = balance - service_charge;
				min_bal_check();
			} else {
				System.out.println("You do not have any balance. you can not withdraw.");
			}
		} else {
			System.out.println("Invalid input");
		}
	}

	// Method for deposit in Current Account
	void Deposit(double deposite_amount) {
		if (deposite_amount > 0) {
			// deposite_amount = deposite_amount;
			balance = balance + deposite_amount;
			UpdateBal();
		} else {
			System.out.println("Seems like you gave an invalid input");
		}
	}

	// Method to check minimum balance
	void min_bal_check() {
		if (balance < min_balance) {
			System.out.println("Your Account balance is less then Minimun.");
			UpdateBal();
		} else {
			UpdateBal();
		}
	}
}

// Class for Saving Account
class Saving_Account extends Accounts {

	// Method to count Interest and Add Interest in Balance
	void Compound_interest() {
		double InterestAmount = (balance * Compound_interest_rate) / 100; // double
		DecimalFormat formatterp = new DecimalFormat("#0.00");
		String FormattedInterest = formatterp.format(InterestAmount);
		System.out.println("Interest Amount : " + FormattedInterest); // prints interest amount

		// String FormattedInterest = moneyformatter.format(InterestAmount); // changes
		// int to string and money formats the amount
		double InterestDouble = Double.parseDouble(FormattedInterest); // changing string to int

		// NumberFormat formatter = NumberFormat.getCurrencyInstance();
		// String moneyString = formatter.format(balance);
		// System.out.println(moneyString);
		balance = balance + InterestDouble;
		UpdateBal();

		bank_app_test.loading(10);
	}

}

// Main Class
public class bank_app_test extends Accounts {

	// public static String getFileExtension(String fullName) {
	// 	//checkNotNull(fullName);
	// 	String fileName = new File(fullName).getName();
	// 	int dotIndex = fileName.lastIndexOf('.');
	// 	System.out.println("loc:: "+dotIndex);
	// 	return (dotIndex == -1) ? "" : fileName.substring(dotIndex + 1);
	// }

	public static void main(String[] args) throws Exception {

		intro();
		Scanner input = new Scanner(System.in);
		Accounts obj1 = new Accounts();
		Saving_Account obj2 = new Saving_Account();
		Current_Account obj3 = new Current_Account();

		// if any other input besides filepath is detected it will throw.
		try {
			// user input for json filepath
			input.useDelimiter("\n");
			System.out.print("Enter input file path and name:");
			File_Loc = input.nextLine();

			///getFileExtension(File_Loc);

		} catch (Exception e) {
			support("filepath_error");
			return;
		}

		System.out.println("You entered: " + File_Loc);
		try { // gets vars from json file

			JSONParser parser = new JSONParser();

			// reading json file from 'File_Loc'
			Object file = parser.parse(new FileReader(File_Loc));
			jsonObject = (JSONObject) file;

			// account info vars
			customer_name = (String) jsonObject.get("customer_name");
			dob = (String) jsonObject.get("dob");
			String balance_string = (String) jsonObject.get("balance");
			account_no = (String) jsonObject.get("account_no");
			type_of_account = (String) jsonObject.get("type_of_account");
			balance = Double.parseDouble(balance_string); // changing string to double

		} catch (Exception e) {
			e.printStackTrace();
			support("filepath_error");
			return;
		}

		// String File_Loc = input.nextLine(); // File location.
		// System.out.println(File_Loc);

		clear();
		//System.out.println("program start");
		double withdraw_amount;
		double deposite_amount;

		bankingoptions(); // prints the banking options
		int flag = 0; // flag for exit

		do {
			System.out.print("Enter Your Input :");
			Scanner inputt = new Scanner(System.in);
			int InputFromUser;
			InputFromUser = inputt.nextInt();
			bankingoptions(); // prints the banking options
			switch (InputFromUser) {
				case 1: // for show Account Info
					obj1.Show_Account_Holder_Info();
					break;
				case 2: // for Deposit
					System.out.println("Enter an amount you want to deposite = ");
					deposite_amount = inputt.nextDouble();
					obj3.Deposit(deposite_amount);
					break;
				case 3: // for Withdraw
					System.out.println("Enter an amount you want to withdraw = ");
					withdraw_amount = inputt.nextDouble();
					obj3.Withdraw(withdraw_amount);
					break;
				case 4: // show balance
					obj2.UpdateBal();
					break;

				case 5:// Interest for Saving Account only
					obj2.Compound_interest();
					break;
				// if (type_of_account == "savings") // update balance for saving
				// {
				// System.out.println("----------------");
				// obj2.Compound_interest();
				// System.out.println("----------------");
				// //break;
				// } else if (type_of_account == "current"){
				// System.out.println("You need a savings account to use interest.");
				// break;
				// }

				case 6:
					clear();
					String textart = "Thank you for banking with Blais financial.\n";
					// String textart = """
					// ********** ** ** **** ** ** **
					// /////**/// /** /** ** ** /**/ /** /** // *****
					// /** /** ****** ******* /** ** //** ** ****** ** ** ****** ****** ****** /**
					// ****** ******* /** ** ** ******* **///**
					// /** /****** //////** //**///**/** ** //*** **////**/** /** ///**/
					// **////**//**//* /****** //////** //**///**/** ** /**//**///**/** /**
					// /** /**///** ******* /** /**/**** /** /** /**/** /** /** /** /** /** /
					// /**///** ******* /** /**/**** /** /** /**//******
					// /** /** /** **////** /** /**/**/** ** /** /**/** /** /** /** /** /** /** /**
					// **////** /** /**/**/** /** /** /** /////**
					// /** /** /**//******** *** /**/**//** ** //****** //****** /** //****** /***
					// /****** //******** *** /**/**//**/** *** /** *****
					// // // // //////// /// // // // // ////// ////// // ////// /// ///// ////////
					// /// // // // // /// // /////

					// ** ** ** ****** ** ** ******** ** ** **
					// // /** /** /*////** /** // /**///// // // /**
					// *** ** ** ******/** /* /** /** ****** ** ****** /** ** ******* ****** *******
					// ***** ** ****** /**
					// //** * /**/**///**/ /****** /****** /** //////** /** **//// /*******
					// /**//**///** //////** //**///** **///**/** //////** /**
					// /** ***/**/** /** /**///** /*//// ** /** ******* /**//***** /**//// /** /**
					// /** ******* /** /**/** // /** ******* /**
					// /****/****/** /** /** /** /* /** /** **////** /** /////** /** /** /** /**
					// **////** /** /**/** **/** **////** /**
					// ***/ ///**/** //** /** /** /******* ***//********/** ****** /** /** ***
					// /**//******** *** /**//***** /**//******** ***
					// /// /// // // // // /////// /// //////// // ////// // // /// // //////// ///
					// // ///// // //////// ///
					// """;
					for (int i = 0; i < textart.length(); i++) {
						System.out.print(textart.charAt(i));
					}
					inputt.close();
					flag = 1;
					break;
				default:
					System.out.println("You haven't given a valid input");
					break;
			}
		} while (flag == 0);
	}

	// function to clear terminal
	static void clear() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	static void delay(int ms) { // delays certain actions
		try {
			Thread.sleep(ms); // thread.sleep is not recommended.
		} catch (InterruptedException e) {
			System.err.format("IOException: %s%n", e);
		}
	}

	// makes loading animation
	static void loading(int ms) {
		String progress_dots = ".......................................................";
		int stringLength = progress_dots.length();
		// System.out.print(progress_dots);

		for (int i = stringLength; i > 0; i -= 1) {// countdown timer to return to
			System.out.print(".");
			delay(ms);
		}
		System.out.println();// creates new line after completed
	}

	// blais financial logo
	static void intro() {
		if (debug_mode == 0) {
			clear();
		}
		// ASCII font used : 3-D, https://patorjk.com/software/taag/#p=display&f=3-D&t=
		String textart = """
				******    **           **               ******** **                                     **            **
				/*////**  /**          //               /**///// //                                     //            /**
				/*   /**  /**  ******   **  ******      /**       ** *******   ******   *******   *****  **  ******   /**
				/******   /** //////** /** **////       /******* /**//**///** //////** //**///** **///**/** //////**  /**
				/*//// ** /**  ******* /**//*****       /**////  /** /**  /**  *******  /**  /**/**  // /**  *******  /**
				/*    /** /** **////** /** /////**      /**      /** /**  /** **////**  /**  /**/**   **/** **////**  /**
				/*******  ***//********/** ******       /**      /** ***  /**//******** ***  /**//***** /**//******** ***
				///////  ///  //////// // //////        //       // ///   //  //////// ///   //  /////  //  //////// ///
					""";
		for (int i = 0; i < textart.length(); i++) {
			System.out.print(textart.charAt(i));
		}
	}

	// if program throws and error it will display error details
	static void support(String errorcode) {
		delay(5);
		if (errorcode == "filepath_error") {
			System.out.println("It seems like an error occurred :(\n"
					+ "filepath_error : Please check the filepath and try again");
		} else if (errorcode == "json_error") {
			System.out.println(
					"It seems like an error occurred :(\n" + "json_error : Please check the json file and try again");
		} else if (errorcode == "write_error") {
			System.out.println("It seems like an error occurred :(\n"
					+ "write_error : Please check the json file and filepath, then try again");
		}
		System.out.println("If issue persists please contact support@ contact.mblais@gmail.com");
	}

	// main banking menu
	static void bankingoptions() {
		clear();
		System.out.println("====================BANKING OPTION====================");
		System.out.println("1.  Get Your Account Details ");
		System.out.println("2.  Deposit money ");
		System.out.println("3.  Withdraw money ");
		System.out.println("4.  Show Balance ");
		System.out.println("5.  Compute Interest "); // only for savings account
		System.out.println("6.  Exit ");
		System.out.println("======================================================");
	}
}
