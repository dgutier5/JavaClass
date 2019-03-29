package com.Class6;

import java.util.Scanner;


public class HomeworkScannerCalculatorIfElseIf {

	public static void main(String[] args) {
		 /* Using scanner class create calculator.Allow user to enter 2 numbers and operator(+,-,*,/). 
		 * Based on operator provide the result to user. 
		 */
		Scanner userInput=new Scanner(System.in);
		System.out.println("Please enter first number");
		double firstNum=userInput.nextDouble();
		 
		System.out.println("Please enter operator: +,-,*,/");
		String operator=userInput.next();
		
		System.out.println("Please enter second number");
		double secondNumber=userInput.nextDouble();
		
		
		if (operator.equals("+")){
			System.out.println(firstNum+secondNumber);
		}else if(operator.equals("-")) {
			System.out.println(firstNum-secondNumber);
		}else if(operator.equals("*")) {
			System.out.println(firstNum*secondNumber);
		}else if(operator.equals("/")) {
			System.out.println(firstNum/secondNumber);
			
		}
	}

}
