package com.Class4;

import java.util.Scanner;

public class CityAndTemperature {
/*Task 3
 * Ask user to enter city and temp in farenheiht
 * your program should convert Far-->Cel
 * your program sould say" the temperature in the city ___ is ___
 */
	public static void main(String[] args) {
		
//		String cityName;
//		int temp;
//		
//		Scanner myScanner=new Scanner(System.in);
//		System.out.println("Please enter your city");
//		
//		cityName=myScanner.nextLine();
//		System.out.println("Please enter temperature in Farenheight");
//		
//		temp=myScanner.nextInt();
//		//formula (F-32)x 5/9;
//		int convertedTemp=(temp-32)*5/9;
//		
//		System.out.println("The temperature in the city"+cityName+"is"+convertedTemp);
//		
		
		//Task1:ur a loan specialist u need to ask user what is the amt of loan needed.
		//if loan is less than 200,000 then u would lent the money otherwise u 
		//would reject the client
		
		int loan;
		Scanner myScanner2=new Scanner(System.in);
			System.out.println("What is loan amt");	
			loan=myScanner2.nextInt();
			
		if(loan<200000) {
			System.out.println("Lend the money");
		}else {
			System.out.println("Don't lend the money");	
		}
			
		//Task 2 ur a DMV rep and u need to ask cust. their age. if they are 18 and older you will
		//issue a drivers license to them. Otherwise you will offer them to get a learners permit.
	
		

		int age;
		
		Scanner myScanner=new Scanner(System.in);
		System.out.println("Please enter your age");
		
		age=myScanner.nextInt();
		
		if(age>18) {
			System.out.println("Issue a drivers license");
		}else {
			System.out.println("Issue a learners permit");
		}
		
		
		
		
		
	}
	
}
