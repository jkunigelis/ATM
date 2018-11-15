import java.util.Scanner;


public class Account extends User {
	

	private static float balance;
	private static long accountNum = 0;
	private static float withdraw;
	private static float deposit;
	
	public Account(float balance, long accountNum, float withdraw, float deposit, int pin, int phoneNum, String name, int ssn, String address) {
		super(pin, phoneNum, name, ssn, address);
		Account.balance = balance;
		Account.accountNum = accountNum;
		Account.withdraw = withdraw;
		Account.deposit = deposit;
	}
	static Scanner in = new Scanner(System.in);
	//balance
	//account num
	//account owner
	//withdraw
	//deposit
	
	public static void setAccountNum() {
		System.out.println("Please enter account number.");
		accountNum = in.nextLong();
	}
	public static boolean checkAccountNum() {
		if (accountNum != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void setDeposit() {
		System.out.println("Enter amount to deposit.");
		deposit = in.nextFloat();
		balance = balance + deposit;
	}
	public static void setWithdraw() {
		System.out.println("Enter amount to withdraw.");
		withdraw = in.nextFloat();
		balance = balance - withdraw;
	}
	public static void getBalance() {
		System.out.println(balance);
	}
}