package com.Class6;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		/* Using scanner class create calculator.Allow user to enter 2 numbers and operator(+,-,*,/). 
		 * Based on operator provide the result to user. 
		 */

		Scanner scan;
		int num1, num2;
		char operator;
		int result=0;
		
		
	    scan=new Scanner (System.in);
	    System.out.println("Please enter first number");
		num1=scan.nextInt();
		
		System.out.println("Please enter second number");
		num2=scan.nextInt();
		
		System.out.println("Please enter operator");
		operator=scan.next().charAt(0);
		
		switch(operator) {
		case '+':
		result=num1+num2;
		break;
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}
}