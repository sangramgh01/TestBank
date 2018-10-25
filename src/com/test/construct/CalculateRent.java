package com.test.construct;

public class CalculateRent {
	
	public static void calculateRentYearly(int year,int currentRent,int increasePercent){
		int totalAmountY =currentRent*12;
		int x = currentRent;
		int yearlyTotalamount = 0;
		System.out.println("Year : "+ 0 + " currentRent : " + currentRent);
		System.out.println("Year : "+ 0 + " yearlyTotalamount : " + totalAmountY);
		for(int i=1;i<year;i++) {
			yearlyTotalamount = (currentRent+ currentRent*increasePercent/100)*12;
			currentRent = yearlyTotalamount/12;
			System.out.println("Year : "+ i + " currentRent : " + currentRent);
			totalAmountY =totalAmountY+yearlyTotalamount;
			System.out.println("Year : "+ i + " yearlyTotalamount : " + yearlyTotalamount);
		}
		System.out.println("Total rent for   "+ year + " years with current rent " +x +  " is " + totalAmountY);
	}
	
	public static void main(String[] args) {
		calculateRentYearly(7, 16000, 5);
	}

}
