package com.Class4;

public class NestedifTwo {
	/*
	 * write a program to check work eligibility
	 * if user is younger than <16--> not allowed to work
	 * otherwise-->allow to work. If user is younger than 64--> got to work
	 * otheerwise -->enjoy ur life
	 */

	public static void main(String[] args) {
		
		int age=18;
		int eligibleAge=16;
		int retirementAge=64;
		
		if(age<eligibleAge) {
			System.out.println("You are too young no work for you");
		}

		/*declare var for gpa and having a diploma
		 * if user has a diplom_>congrats-> if gpa is higher 3.5->higher person or else do not hire.
		 */
		double gpa=3.6;
		double expectedGpa=3.5;
		
		boolean hasDiploma=true;
		
		if(hasDiploma) {
				System.out.println("Congrats");
			    if (gpa>expectedGpa) {
				    System.out.println("You are hired");
			    }else {
				    System.out.println("we cannot hire you");
			    }
			    }else {
				    System.out.println("Please get your degree");
			    }

//ClassTask1:Create a Java program and store variables to store mortgage rate and mortgage price. 
//	First program should check if rate is higher than 4.5 user will not buy a house, 
//	otherwise user will consider buying. Once user decides to buy a house,
//	if price of the house is larger than 200000 than user will take a loan, otherwise user will pay cash.
//		
		double mortgageRate=3.5;
		double expectedMortgage=4.5;
		double mortgagePrice=10000;
		double expMortgageprice=20000;
		
		if (mortgageRate>expectedMortgage) {
			System.out.println("will not buy the house");
		}else {
			System.out.println("buy the house");
		
		 if(mortgagePrice>expMortgageprice) {
			 System.out.println("take a loan");
		 }else {
			 System.out.println("no loan pay in cash");
		 }
		
		
		}
		
		/*Write a program to ask user to enter numbers of worked years and annual salary.
		If user worked for more or equals to 5 years than user is eligible for the bonus, otherwise he is not.
		Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
		*/
		
		
		
		
	}

}
