package com.Class5;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {

		//COMPARE THREE NUMBERS
		
		  //Task1: Write a program to find largest of three double values using if-else..if
		  //provided by a user (numbers must be distinct)
		
				//find out biggest number from 3 numbers:	
				     //Logic:
				//compare d1 to d2 and d1 to d3
				//compare d2 to d1 and d2 to d3
				//compare d3 to d1 and d3 to d2
				//if numbers are equal
				
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter your first double value");
			double d1 = sc.nextDouble();
			System.out.println("Please enter your second double value");
			double d2 = sc.nextDouble();
			System.out.println("Please enter your third double value");
			double d3 = sc.nextDouble();
				if((d1>d2)&&(d1>d3)){
					System.out.println("d1 is the largest number");
				}else if ((d2>d1)&&(d2>d3)) {
					System.out.println("d2 is the largest number");
				}else if ((d3>d1)&&(d3>d2)) {
					System.out.println("d3 is the largest number");
				}else {
					System.out.println("numbers are all equal");
				}
	}
	

}