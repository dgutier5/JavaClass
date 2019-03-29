package com.Class4;

import java.util.Scanner;

public class ScannerClassV {

	public static void main(String[] args) {

			//Scanner Class- class,allows to get user input
			//ctrl+shift+o=it will import
		
//				INTEGER EX:
//	Scanner myScanner=new Scanner(System.in);
//	System.out.println("Enter your age");
//	int age=myScanner.nextInt();//this line captures the value i put in console & restricts user to enter specific datatype in this case only integer vslues
//	System.out.println("You are "+age+" years old");
			
				//String EX:
			Scanner userInput=new Scanner(System.in); 
			System.out.println("Please enter your name");
			
			String name=userInput.nextLine();
			
			System.out.println("You name is "+name);
			
		
		
		
	}

}
