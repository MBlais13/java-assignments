
// Grade 11, Computer Science, Assignment 1
import java.util.Scanner;
import java.io.IOException;
import java.text.NumberFormat;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import java.io.*;
import java.net.URL;
import java.net.*;

class Accounts {
	String customer_name;
	int account_no;
	double balance = 2000; // Initial Balance
	String type_of_account;
	int withdraw_amount;
	int deposite_amount;
	NumberFormat money = NumberFormat.getCurrencyInstance();

	// Method to show Account Information
	//
	// TODO - put the account information info an encrypted document instead of
	// being pre-filled in the script.
	// refer to this webpage for how to encrypt json data
	// https://stackoverflow.com/questions/69632602/best-way-to-store-aes-encrypted-data
	// refer to line one for TODO...
	void Show_Account_Holder_Info() {
		customer_name = "Michael Blais";
		account_no = 000001;
		type_of_account = "Saving Account";

		System.out.println("Cusomer Name = " + customer_name);
		System.out.println("Cusomer Account No = " + account_no);
		System.out.println("Cusomer Balance = " + balance);
		System.out.println("Cusomer Account Type = " + type_of_account);
	}

	// Method for Update Balance
	void UpdateBal() {
		System.out.println("Updated Balance  = " + money.format(balance));
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
	double Compound_interest_rate = 2.49; // Interest Rate

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
			balance = balance - withdraw_amount;
			UpdateBal();
		} else {
			System.out.println("You do not have any balance. you can not withdraw.");
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
public class bank_application extends Accounts {

	public static void main(String[] args) throws Exception {

		// String ipAddress = "172.217.165.3";
		// sendPingRequest(ipAddress);

		// URL path = filetest.class.getResource("account.json");
		// File f = new File(path.getFile());

		// System.out.println("this is the file path: " + f);
		// // parsing file "JSONExample.json"
		// Object ob = new JSONParser().parse(new FileReader(f));

		// // typecasting ob to JSONObject
		// public static JSONObject js = (JSONObject) ob;
		// String namep = (String) js.get("name");
		// String dobp = (String) js.get("dob");
		// String balancep = (String) js.get("balance");
		// String account_nop = (String) js.get("account_no");
		// String type_of_accountp = (String) js.get("type_of_account");

		//
		//

		clear();
		int withdraw_amount;
		int deposite_amount;
		Scanner s1 = new Scanner(System.in);
		System.out.println("********************Account Type********************");
		System.out.println("1.  Saving Account ");
		System.out.println("2.  Current Account ");
		System.out.println("Enter Your Account type :");

		int Acc_Type = s1.nextInt(); // It will take input from user for Account type.

		//bankingoptions(); // prints the banking options
		int flag = 0; // flag for exit

		// Objects
		Accounts obj1 = new Accounts();
		Saving_Account obj2 = new Saving_Account();
		Current_Account obj3 = new Current_Account();

		do {
			System.out.println("Enter Your Input :");
			int InputFromUser = s1.nextInt();
			bankingoptions(); // prints the banking options

			switch (InputFromUser) {
				case 1: // for show Account Info
					obj1.Show_Account_Holder_Info();
					break;

				case 2: // for Deposite
					if (Acc_Type == 1) // Saving Deposite
					{
						System.out.println("Enter A amount you want to deposite = ");
						deposite_amount = s1.nextInt();
						obj2.Deposit(deposite_amount);
						break;
					} else // Current Deposite
					{
						System.out.println("Enter A amount you want to deposite = ");
						deposite_amount = s1.nextInt();
						obj3.Deposit(deposite_amount);
						break;
					}

				case 3: // for Withdraw
					if (Acc_Type == 1) // Saving Withdraw
					{
						System.out.println("Enter A amount you want to withdraw = ");
						withdraw_amount = s1.nextInt();
						obj2.Withdraw(withdraw_amount);
						break;
					} else // current withdraw
					{
						System.out.println("Enter A amount you want to withdraw = ");
						withdraw_amount = s1.nextInt();
						obj3.Withdraw(withdraw_amount);
						break;
					}
				case 4: // update balance
					if (Acc_Type == 1) // update balance for saving
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
					flag = 1;
					break;
				default:
					System.out.println("out the if You havent give any Input");
					break;
			}
		} while (flag == 0);
	}

	static void clear() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	static void bankingoptions() {
		System.out.println("********************BANKING OPTION********************");
		System.out.println("1.  Get Your Account Details ");
		System.out.println("2.  Deposit Money ");
		System.out.println("3.  Withdraw Money ");
		System.out.println("4.  Show Balance ");
		System.out.println("5.  Compute Interest ");
		System.out.println("6.  Exit ");
		System.out.println("*******************************************************");
	}
}

// class pingclass {
// 	// Sends ping request to a provided IP address
// 	public static void sendPingRequest(String ipAddress) throws UnknownHostException, IOException {
// 		InetAddress geek = InetAddress.getByName(ipAddress);
// 		System.out.println("Sending Ping Request to " + ipAddress);
// 		if (geek.isReachable(5000))
// 			System.out.println("Host is reachable");
// 		else
// 			System.out.println("Sorry ! We can't reach to this host");
// 	}

// 	// Driver code
// }