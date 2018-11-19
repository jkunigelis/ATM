import java.util.Scanner;

public class User {
	//pin
	//phone #
	//name 
	//ssn
	//address
	static Scanner in = new Scanner(System.in);
	private static int pin = 0;
	private static int phoneNum;
	private static String name;
	private static int ssn;
	private static String address;
	
	public User(int pin, int phoneNum, String name, int ssn, String address) {
		
	}
	public static void setPin() {
		System.out.println("Please enter pin.");
		pin = in.nextInt();
	}
	public static boolean checkPin() {
		if (Integer.toString(pin).length() != 4) {
			return false;
		}
		else if (pin != 0){
			return true;
		}
		else {
			return false;
		}
	}
	public int getPhoneNum() {
		return phoneNum;
	}
	public static void setName() {
		System.out.println("Please enter name.");
		name = in.nextLine();
	}
	public static String getName() {
		return name;
	}
	public int getSsn() {
		return ssn;
	}
	public String getAddress() {
		return address;
	}
}