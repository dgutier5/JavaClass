package com.Class4;

import java.util.Scanner;

public class SwitchCaseCountryV {

	public static void main(String[] args) {
		// ask user to say their country and then based on the country will provide their favorite food
		
		Scanner country=new Scanner(System.in);
		System.out.println("Please enter your country");
		
		String myCountry=country.nextLine();
		
		switch(myCountry) {
		 
		case "USA":
			System.out.println("You love burgers");
			break;
		case "Mexico":
			System.out.println("You love  tacos");
			break;
		case "China":
			System.out.println("You love fried rice");
			break;
		case "Afghanistan":
			System.out.println("You love kebab");
			break;
		default:
			System.out.println("I don't know what type of food you like");
		}
		
	}

}
