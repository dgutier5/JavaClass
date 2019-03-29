package com.Class4;

public class RecapSwitchV {

	public static void main(String[] args) {
		
		// (Switch case); testing multiple conditions: if-else-if
		//switch works with byte, short, int, String,char
		
		//Declare grade. Based on the grase I will print messages
		//A-excellent, B-good,C-average,D-fair, anything else:"go back and study";
		
		char grade='A';
		switch (grade) {//specify variable with diffrent conditions here
		case'A':
			System.out.println("Excellent");
			break;
		case'B':
			System.out.println("Good");
			break;
		case'C':
			System.out.println("Average");
			break;
		case'D':
			System.out.println("Fair");
			break;
		default:
			System.out.println("go back and study");
		}
		
		//(Nested) if: if inside another if
		//only when first condition is true/satisfied--> only then inside if/second if will be executed

		//declare interest rate and amount;
		//I am trying to buy a house: 1.If interest rate<4.5-->I will consider buying Else I won't buy
		//if the amt >200,000 --> then I will take a loan Else I will pay cash.
		
		double rate=4.5;
		int amt=200000;
		
		if(rate<4.5) { //this is the first conditon
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
