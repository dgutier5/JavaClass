package com.Class6;

import java.util.Scanner;

public class TaskTwoScannerCountrySwitch {

	public static void main(String[] args) {
	
		/*Task1. Ask user to enter their country and capture it.
		Once values are captured print which language user speaks
		*/

		Scanner scan;
		String country;
		String language="";
		
	    scan=new Scanner(System.in);
		System.out.println("Please enter country");
		country=scan.nextLine();
		
		switch(country) {
		case "USA":
			language="English";
			
		case "France":
			 language="French";
		}
		 
		System.out.println("You speak: "+language);
		
		/* OR
		
		Scanner userInput=new Scanner(System.in);
		System.out.println("Please enter country");
		String myCountry=userInput.nextLine();//captures the variable and restricts to string. Var myCountry is what user will type in console
		
		*/
		
		
	}
}


