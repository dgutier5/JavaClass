package com.Class5;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {
		
		/*Task1:Prompt the user to enter person heights in inches.
		 *  Person should be classified as one of the following:
		• short (under 5 feet)
		• medium(5 to 6 feet)
		• tall (6 feet and over)
		*/
		
        
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your height");
		int height=sc.nextInt();
		if(height<5) {
			System.out.println("short");
		}else if (height==5 && height<=6) {
			System.out.println("medium");
		}else if (height>=6) {
			System.out.println("tall");
		}else {
			System.out.println("Please enter valid height");
	}	
		
 }
}
		
     
		
	
