package com.PracticeIfs;

public class NestedIfCondition {

	public static void main(String[] args) {
		 /*
		 * write a program to check work eligibility
		 * if user is younger than <16--> not allowed to work
		 * otherwise-->allow to work. If user is younger than 64--> go to work
		 * otheerwise -->enjoy ur life
		 */

		int age=18;
		int eligibleAge=16;
		int retirementAge=64;
		
		
		if (age<eligibleAge) {
			System.out.println("No work you too young");
		}else {
			System.out.println("You are allowed to work");
			
		
			if (age<retirementAge) {
				System.out.println("Go to work");
			}else {
				System.out.println("enjoy ur life your old as fuk");
			}
			
		}
		
				

	}

}
