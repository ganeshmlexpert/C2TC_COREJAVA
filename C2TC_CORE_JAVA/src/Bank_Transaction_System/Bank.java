package Bank_Transaction_System;

public class Bank {
	public static int totalAccounts=0;
	public static void incrementAccounts() {
		totalAccounts++;
	}
	public static int getTotalAccounts() {
		return totalAccounts;
	}
}
