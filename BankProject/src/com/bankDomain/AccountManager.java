package com.bankDomain;

public class AccountManager {
		BankAccount[] bankAccount = new BankAccount[10];
		int acc = -1;
		AccountManager() {}
		
		public void createAccount(BankAccount ba) {  
			System.out.println("Account Created!!");
			ba.showDetails();
			this.acc++;
			this.bankAccount[acc] = ba;
		}
		
		public void deleteAccount() {
			
		}
		
		public void depositeAmount() {
			
		}
		public void withdrawAmount() {
			
		}
		
		public void showDetails() {
			 System.out.println("Show all Accounts:");
			 for(int i=0; i<=acc; i++) {				 	
					bankAccount[i].showDetails();
				}
		}
		
}
