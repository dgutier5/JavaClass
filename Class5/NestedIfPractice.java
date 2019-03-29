package com.Class5;

public class NestedIfPractice {

	public static void main(String[] args) {
		/* 
		 * check if user has a credit card-->
		 * check what is balance. if balance is more than 1000-->pay off now
		 * else "you are safe"
		 */
		boolean creditCard=true; //establishes user does have a credit card
		int balance=1000;
		
		
		
		if(creditCard) {
				System.out.println("Lets check the balance");
				if (balance>=1000) {
				System.out.println("Pay off now");
				}else {
					System.out.println("you are safe");
				}
			
		}else {
			System.out.println("Do you want a credit card");
		}
		
		
	}

}
