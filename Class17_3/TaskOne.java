package com.Class17_3;

import java.util.Scanner;

public class TaskOne {

	public static void main(String[] args) {
		
		/* 1. Write a program that reads a range of integers (start and end point),
		 *  provided by a user and then from that range prints the sum of the even and odd integers.
		 * *Scanner will take an input from user
		 */  
		 
		//startRange= first user input;
		//endRange=Second user input;
		
		 Scanner scan=new Scanner(System.in);
		System.out.println("Please enter start point");
		 int start=scan.nextInt();
		 
		 System.out.println("Please enter end point");
		 int end=scan.nextInt();
		 
		 int sumEven=0;
		 int sumOdd=0;
		 
		 
		 for(int i=start; i<end; i++) {
			 if (i%2==0) {
				 i+=sumEven; 
				  if (i%2!=0) {
					  i+=sumOdd;
				  }
				 System.out.println(sumEven+sumOdd);
			 }
		 }
		 
	}
}
