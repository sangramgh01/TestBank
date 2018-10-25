package com.test.construct;

public class VipCustomer {
	
	private String name;
	private double creditLimit;
	private String emailAddress;
	
	
	
	public VipCustomer() {
		this("default vip customer",1000d,"default@xyz.com");
		System.out.println("Default vip constructor");
	}
	
	public VipCustomer(String name,double creditLimit) {
		this(name,creditLimit,"defailt2@xyz.com");
	}
	
	public VipCustomer(String name, double creditLimit, String emailAddress) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
		System.out.println("Default values name: " + name + " credit limit amount : " + creditLimit + " email Address: " + emailAddress);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	

}
