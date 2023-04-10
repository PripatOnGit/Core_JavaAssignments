package com.bankDomain;

public class Bank {
		public static void main(String[] args) {
			AccountManager am = new AccountManager();
			BankAccount ba1 = new BankAccount(1, 1000, "Priyanka");
			BankAccount ba2 = new BankAccount(2, 2000, "Abhijeet");
			BankAccount ba3 = new BankAccount(3, 3000, "Arjun");
			BankAccount ba4 = new BankAccount(4, 4000, "Shubham");
			am.createAccount(ba1);
			am.createAccount(ba2);
			am.createAccount(ba3);
			am.createAccount(ba4);
			System.out.println("------------------------------------");
			am.showDetails();
			}
}
