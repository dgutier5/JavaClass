package com.Class4;

import java.util.Scanner;

public class CompareTwoNumbersV {

	public static void main(String[] args) {
		// ask user to enter 2 numbers and then verify which one is larger 
			//int firstNumber=20; int secondNumber=30
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter first number");
		int firstNumber=scan.nextInt();
		
		System.out.println("Please enter second number");
		int secondNumber=scan.nextInt();
		
		if (firstNumber>secondNumber) {
			System.out.println(firstNumber+" is larger");
		}else if(secondNumber>firstNumber) {
			System.out.println(secondNumber+" is larger");
		}else {
			System.out.println("Numbers are equal");
		}
	}

}
