package com.PracticeIfs;

import java.util.Scanner;

public class ScannerIfElseDmv {

	public static void main(String[] args) {
		//Task 2 ur a DMV rep and u need to ask cust. their age. if they are 18 and older you will
		//issue a drivers license to them. Otherwise you will offer them to get a learners permit.
		

		int age;
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter age");
		age=scan.nextInt();
		
		if(age>=18) {
			System.out.println("Issue drivers license");
		}else {
			System.out.println("Offer learners permit");
		}
		
		
		
		
		
		
	}

}
