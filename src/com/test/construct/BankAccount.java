package com.test.construct;

public class BankAccount {
	
	private Long accountNumber;
	private double totBalance;
	private String customerName;
	private String email;
	private String phoneNumber;
	
	
	
	
	public BankAccount() {
		System.out.println("Empty Constructor");
	}
	
	public BankAccount(Long accountNumber, double totBalance, String customerName, String email, String phoneNumber) {
		super();
		System.out.println("Construct with Field");
		this.accountNumber = accountNumber;
		this.totBalance = totBalance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}


	public double getTotBalance() {
		return totBalance;
	}

	public void setTotBalance(double totBalance) {
		this.totBalance = totBalance;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Double dipositFund(Long accountNumber,double balance) {
		if(isValidAccount(accountNumber)) {
			this.totBalance += balance;
			System.out.println("Total Balance After Diposit For Account Number  "+ accountNumber  + " is : " + this.totBalance);
		}else {
			System.out.println("Invalid Account Number +  " + accountNumber);
		}
		return this.totBalance;
	}
	public Double withdrawFund(Long accountNumber,double withdrawlBalance) {
		if(isValidAccount(accountNumber)) {
			if(this.totBalance >= withdrawlBalance) {
				this.totBalance -= withdrawlBalance;
				System.out.println("Total Balance After withdrawl For Account Number  "+ accountNumber  + " is : " + this.totBalance);
			}else {
				System.out.println("You cannot withdrawl;Insufficent Fund For account: " +accountNumber+ " total balance is : " + this.totBalance);
			}
		}else {
			System.out.println("Invalid Account Number  : " + accountNumber);
		}
	return this.totBalance;
	}
	private boolean isValidAccount(Long accountNumber) {
		return (accountNumber != null && accountNumber> 0);
	}

}
