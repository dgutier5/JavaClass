package com.PracticeIfs;

import java.util.Scanner;

public class ScannerAndTemp {

	public static void main(String[] args) {
		/*Task 3
		 * Ask user to enter city and temp in farenheit
		 * your program should convert Far-->Cel
		 * your program sould say "the temperature in the city ___ is ___c"
		 */
		//formula f->c  (f-32)*5/9=Celsius
		//98.6F
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter city");
		String cityName=scan.nextLine();
		
		System.out.println("Please enter temperature in Farenheit");
		double temp=scan.nextDouble();
		
		double convertedTemp=(temp-32)*5/9;
		System.out.println(convertedTemp);
		
		System.out.println("The temperature in the city "+cityName+" is "+convertedTemp+" C");
		
		
		
		
		
		                
	}

}
