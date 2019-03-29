package com.PracticeIfs;

import java.util.Scanner;

public class ScannerIfElseLoan {

	public static void main(String[] args) {
		//Task1:ur a loan specialist u need to ask user what is the amt of loan needed.
		//if loan is less than 200,000 then u would lent the money otherwise u 
		//would reject the client
		//Logic use if.Else statement 

		int loan;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter loan amount");
		loan=scan.nextInt();
		
		if (loan<200000) {
			System.out.println("give loan");
		}else {
			System.out.println("don't give loan");
		}
		
		
		
		
		
		
		
	}

}
