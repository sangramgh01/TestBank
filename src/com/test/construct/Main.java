package com.test.construct;

public class Main {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.setAccountNumber(12123l);
		account.setCustomerName("xyz");
		account.setEmail("abc@xxx.com");
		account.setTotBalance(313123);
		
		account.withdrawFund(100l, 50);
		account.dipositFund(100l, 50);
		account.withdrawFund(100l, 10);
		account.dipositFund(0l, 50);
	}

}
