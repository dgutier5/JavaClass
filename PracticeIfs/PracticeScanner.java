package com.PracticeIfs;

import java.util.Scanner; //import scanner class from JRE library

public class PracticeScanner {

	public static void main(String[] args) {
		////Scanner: a class-allows us to take input from user
		//Strings use nextLine()
		//Numbers use nextInt()
		//Single Character use next().charAt(0)
		
		
//		Scanner Scan=new Scanner(System.in);// allowing user to provide input in console
//		System.out.println("Please enter any number");  //telling user what to do, specifying msg to console
//		int myNumber=Scan.nextInt();                      //line grabs captures user input & restricts to only integers
//		System.out.println("The number you entered is"+myNumber); //line that will get executed
//		
		
	//Task: Scanner
	//ask user for name and print Good morning __name______
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter name");
		String name=scan.nextLine();
		System.out.println("Good morning "+name);
		
		
		
			
	}

}
