package com.Class4;

import java.util.Scanner;

public class IfStatementStringsCountryV {

	public static void main(String[] args) {
		
		Scanner country=new Scanner(System.in);
		System.out.println("Please enter your country");
		String myCountry=country.nextLine();
		
		//to compare 2 strings we use .equals method 
		if (myCountry.equals("USA")) {
			System.out.println("You love burgers");
		}else if (myCountry.equals("Mexico")) {
			System.out.println("You love tacos");
		}else if (myCountry.equals("China")) {
			System.out.println("You love rice");
		}else if (myCountry.equals("Afghanistan")) {
			System.out.println("kebab");
		}else {
			System.out.println("I dont know what type food you like");
		}
			
	}

}
