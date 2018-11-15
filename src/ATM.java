import java.util.Scanner;

public class ATM extends Account{
	
	public ATM(float balance, long accountNum, float withdraw, float deposit, int pin, int phoneNum, String name, int ssn, String address) {
		super(balance, accountNum, withdraw, deposit, pin, phoneNum, name, ssn, address);
	}

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		//account
		//validate (login)
		//dispense
		//menu
		//deposit
		//withdraw
		//show balance
		
		
		menu();
		in.close();
	}
	//menu
	public static void menu() {
		Account.setAccountNum();
		if (Account.checkAccountNum() == true) {
			User.setPin();
			if (User.checkPin() == true) {
				System.out.println("Login Success...");
				System.out.println("\nWhat do you want to do?");
				char choice = 'z';
				while(choice != 'e') {
					System.out.println("\nEnter 'd' to deposit. Enter 'w' to withdraw. Enter 'b' to show balance. Enter 'e' to exit.");
					String temp = in.nextLine();
					choice = temp.charAt(0);
					switch (choice) {
					case 'd':
						Account.setDeposit();
						break;
					case 'w':
						Account.setWithdraw();
						break;
					case 'b':
						Account.getBalance();
						break;
					case 'e':
						break;
					default:
						System.out.print("Please enter valid command.");
					}
				}
			}
		}
	}
}