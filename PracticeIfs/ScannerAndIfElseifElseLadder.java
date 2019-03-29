package com.PracticeIfs;

import java.util.Scanner;

public class ScannerAndIfElseifElseLadder {

	public static void main(String[] args) {
		////take 2 numbers from the user and compare those numbers
		//Logic:use if.else if.else Ladder

		int num1, num2;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter first number");
		num1=scan.nextInt();
		
		System.out.println("Please enter second number");
		num2=scan.nextInt();
		
		if(num1>num2) {
			System.out.println(num1+" is larger than"+num2);	
		}else if(num2>num1) {
			System.out.println(num1+" is smaller than"+ num2);
		}else {
			System.out.println("numbers are equal");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
