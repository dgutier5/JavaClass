package com.Class7;

import java.util.Scanner;

public class ScannerAndLoopTask {

	public static void main(String[] args) {
		/* Prompt user to ask the name 3 times and print"You are doing great __name___"*/

		Scanner scan; //declaring scanner
		String name;  
		
		scan=new Scanner(System.in);
		int a=1; //count variable
		
		while(a<=3) {//check condition its true so goes inside while loop
			
			System.out.println("Please enter your name");
			name=scan.nextLine();// capture
			
			System.out.println("You are doing great"+name);
			
			a--;
		}
	

  
	}

}
