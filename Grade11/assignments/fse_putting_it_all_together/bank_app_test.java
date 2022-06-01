// Grade 11, Computer Science, Assignment 1

import java.util.Scanner;
import javax.swing.text.html.HTMLEditorKit.Parser;
import java.io.IOException;
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
	public static JSONObject jsonObject;
	public static String File_Loc;
	public static String customer_name;
	public static String dob;
	public static String account_no;
	public static String type_of_account;
	public static double balance; // Initial Balance
	// String type_of_account;
	int withdraw_amount;
	int deposite_amount;
	NumberFormat money = NumberFormat.getCurrencyInstance();

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
			System.out.println("An error occurred, please contact support.");
		}
	}

	// Method for Update Balance
	void UpdateBal() {
		System.out.println("Updated Balance  = " + money.format(balance));
		// jsonObject.remove("balance");

		// String bal = String.valueOf(balance); // Turns balance(int) into a string
		// System.out.println(bal);
		// jsonObject.put("balance", bal);

		// FileWriter filewriter = new FileWriter(File_Loc);
		// filewriter.write(jsonObject.toJSONString());
		// filewriter.flush();
		// filewriter.close();
	}
}

// Current Account Class
class Current_Account extends Accounts {

	// Method for Withdraw in Current Account
	void Withdraw(int wdraw_amount) {
		if (balance > 0) {
			withdraw_amount = wdraw_amount;
			balance = balance - withdraw_amount;
			min_bal_check();
		} else {
			System.out.println("You do not have any balance. you can not withdraw.");
		}
	}

	// Method for deposit in Current Account
	void Deposit(int depo_amount) {
		deposite_amount = depo_amount;
		balance = balance + deposite_amount;
		UpdateBal();
	}

	double min_balance = 100;
	double service_charge = 10;

	// Method to check minimum balance
	void min_bal_check() {
		if (balance < min_balance) {
			System.out.println("Your Account balance is less then Minimun.");
			balance = balance - service_charge;
			UpdateBal();
		} else {
			UpdateBal();
		}

	}

}

// Class for Saving Account
class Saving_Account extends Accounts {
	double Compound_interest_rate = 1.12; // Interest Rate

	// Method to count Interest and Add Interest in Balance
	void Compound_interest() {
		Double InterestAmount = (balance * Compound_interest_rate) / 100;
		System.out.println("Interest Amount = " + InterestAmount);
		// System.out.println("Interest Amount = " +
		// Math.round(InterestAmount*10000/10000));
		balance = balance + InterestAmount;
		UpdateBal();
	}

	// Method for Withdraw in Saving Account
	void Withdraw(int wdraw_amount) {
		if (balance > 0) {
			withdraw_amount = wdraw_amount;
			balance = balance - withdraw_amount; // does not work
			UpdateBal();
		} else {
			System.out.println("You do not have any balance. You can not withdraw.");
		}
	}

	// Method for deposit in Saving Account
	void Deposit(int depo_amount) {
		deposite_amount = depo_amount;
		balance = balance + deposite_amount;
		UpdateBal();
	}
}

// Main Class
public class bank_app_test extends Accounts {
	public static void main(String[] args) throws Exception {

		intro();

		Accounts obj1 = new Accounts();
		Saving_Account obj2 = new Saving_Account();
		Current_Account obj3 = new Current_Account();
		Scanner fileinput = new Scanner(System.in);

		// user input for json filepath
		fileinput.useDelimiter("\n");
		System.out.print("Enter input file path and name:");
		File_Loc = fileinput.nextLine();
		System.out.println("You entered: " + File_Loc);

		// gets vars from json file
		JSONParser parser = new JSONParser();

		try {
			// reading json file from 'File_Loc'
			Object file = parser.parse(new FileReader(File_Loc));
			jsonObject = (JSONObject) file;

			// account info vars
			customer_name = (String) jsonObject.get("customer_name");
			dob = (String) jsonObject.get("dob");
			String balance_string = (String) jsonObject.get("balance");
			account_no = (String) jsonObject.get("account_no");
			type_of_account = (String) jsonObject.get("type_of_account");
			balance = Integer.parseInt(balance_string); // changing string to int

			// JSONObject js = new JSONObject(); // Your jsonobject here, this is just a
			// sample

		} catch (Exception e) {
			e.printStackTrace();
			support("filepath");
		}

		Scanner input = new Scanner(System.in);

		// String File_Loc = input.nextLine(); // File location.
		// System.out.println(File_Loc);

		// clear();
		System.out.println("program start");
		int withdraw_amount;
		int deposite_amount;

		// // -- OLD -- asks for the account type you want
		// System.out.println("====================Account Type====================");
		// System.out.println("1. Savings Account ");
		// System.out.println("2. Current Account ");
		// System.out.println("Enter Your Account type :");
		// int Acc_Type = input.nextInt(); // It will take input from user for Account
		// type.

		bankingoptions(); // prints the banking options
		int flag = 0; // flag for exit

		do {
			System.out.println("Enter Your Input :");
			int InputFromUser = input.nextInt();
			bankingoptions(); // prints the banking options

			switch (InputFromUser) {
				case 1: // for show Account Info
					// customer_name, dob, account_no, type_of_account
					obj1.Show_Account_Holder_Info();
					break;

				case 2: // for Deposite
					if (type_of_account == "savings") // Saving Deposit
					{
						System.out.println("Enter an amount you want to deposite = ");
						deposite_amount = input.nextInt();
						obj2.Deposit(deposite_amount);
						break;
					} else // Current Deposite
					{
						System.out.println("Enter an amount you want to deposite = ");
						deposite_amount = input.nextInt();
						obj3.Deposit(deposite_amount);
						break;
					}

				case 3: // for Withdraw
					if (type_of_account == "savings") // Saving Withdraw
					{
						System.out.println("Enter an amount you want to withdraw = ");
						withdraw_amount = input.nextInt();
						obj2.Withdraw(withdraw_amount);
						break;
					} else // current withdraw
					{
						System.out.println("Enter an amount you want to withdraw = ");
						withdraw_amount = input.nextInt();
						obj3.Withdraw(withdraw_amount);
						break;
					}
				case 4: // update balance
					if (type_of_account == "savings") // update balance for saving
					{
						obj2.UpdateBal();
						break;
					} else // update balance for current
					{
						obj3.UpdateBal();
						break;
					}
				case 5: // Interest for Saving Account only
					obj2.Compound_interest();
					break;
				case 6:
					System.out.println("Bye Bye . Thank you");
					input.close();
					flag = 1;
					break;
				default:
					System.out.println("out the if You havent give any Input");
					break;
			}
		} while (flag == 0);
	}

	// function to clear terminal
	static void clear() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	static void intro() {
		// clear();
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

		// clear();
	}

	static void support(String errorcode) {
		System.out.println("It seems like an error occurred :(\n" + "Error code: " + errorcode
				+ "\nPlease contact support @contact.mblais@gmail.com");
	}

	static void bankingoptions() {
		clear();
		System.out.println("====================BANKING OPTION====================");
		System.out.println("1.  Get Your Account Details ");
		System.out.println("2.  Deposit Money ");
		System.out.println("3.  Withdraw Money ");
		System.out.println("4.  Show Balance ");
		System.out.println("5.  Compute Interest "); // only for savings account
		System.out.println("6.  Exit ");
		System.out.println("======================================================");
	}
}