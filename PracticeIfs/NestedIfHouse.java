package com.PracticeIfs;

public class NestedIfHouse {

	public static void main(String[] args) {
//		
		//(Nested) if: if inside another if
		//only when first condition is true/satisfied--> only then inside if/2nd if will be executed

		/*
		 * store variables to store mortgage rate and mortgage price.
		 * first program should check if rate is higher tha 4.5
		 * >4.5 user will not buy a house
		 * otherwise user will consider buying house
		 * Once user decides to buy a house,
		 * if price of the house is larger than 2000000
		 * then user will take a loan
		 * otherwise user will pay cash
		 */
		//I am trying to buy a house:
		//1.If interest rate<4.5-->I will consider buying Else I won't buy
		//if the amt >200,000 --> then I will take a loan Else I will pay cash.
		
		
		double mortgageRate=4.5;
		int mortgagePrice=200000;
		
		if (mortgageRate>4.5) {
			System.out.println("I am not buying house");
		}else {
			System.out.println("I will consider buying house");
			if(mortgagePrice>200000) {
				System.out.println("Take a loan");
			}else {
				System.out.println("pay in cash");
			}
		
		}
		
		
		
		
		
		
		
		
		
		

	}

}
