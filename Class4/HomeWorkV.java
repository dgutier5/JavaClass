package com.Class4;

import java.util.Scanner;

public class HomeWorkV {

	public static void main(String[] args) {
		
	
		//1. ask user to enter 2 double values and capture it. Once values are captured, 
		//identify which one is the largedt number and print message saying which number is the 
		//largest
		
		//2.Ask use to entr their country and capture it. Once values are captured print 
		//which language user speaks.(Scanner & Switch)
	    // answers video4 5:08
		
		
//		Scanner userInput=new Scanner(System.in);
//		System.out.println("Enter your country");
//		String country=userInput.nextLine();
//		
//		switch(country.toLowerCase()) {
//		case "USA":
//			System.out.println("You speak english");
//		case "JAPAN":
//			System.out.println("You speak japanese");
//		break;
//		
//		}
//		
		

	/*3. Ask user to enter a total amount they want to buy a car for
	 * Ask what is the interest rate they agree to pay?
	 * Ask for how many years they want to finance.
	 * Based on user inputs calculate how much will be the monthly payments? 
	 * $40/hr daily-> 40*40=1600, monthly->1600*4=6400, daily->6400/30
	 */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter total amount");
		double amount=scan.nextDouble();
		
		System.out.println("Enter interest rate");
		double rate=scan.nextDouble();
		
		System.out.println("Enter finance years");
		int years=scan.nextInt();
		
		double monthPayment=amount*rate*(years*12)/30;
		
		
		
	}
}
	
	