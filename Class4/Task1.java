package com.Class4;

public class Task1 {
	public static void main(String[] args) {
	/* Create a Java program and store variables to store mortgage rate and mortgage price                           
	 * First program should check if rate is higher than 4.5 user will not buy a house, otherwise user will 
	 * consider buying. 
	 * Once user decides to buy a house, if price of the house is larger than 200000 than user will take a loan,
	 *  otherwise user will pay cash. */
		
		
//(Nested) if: if inside another if
//only when first condition is true/satisfied--> only then inside if/2nd if will be executed

//declare interest rate and amount;
//I am trying to buy a house:
//1.If interest rate<4.5-->I will consider buying Else I won't buy
//if the amt >200,000 --> then I will take a loan Else I will pay cash.

		double rate=4.5;
		int amt=200000;

	if(rate<4.5) { //this is the first conditon!!Only when this first cond. is true, second if will execute
	System.out.println("I will consider buying");
	
	if(amt>200000) { //the 2nd if, only executes if the first condition is satisfied
		System.out.println("I will take a loan");
		}else {
			
			System.out.println("I will pay with cash");	
		}
	
		}else {
			System.out.println("I won't buy");
		}


	}
}






















	
		
		
		
	


	
		
		
		
		


