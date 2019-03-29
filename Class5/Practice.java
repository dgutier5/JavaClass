package com.Class5;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		 /* task 2
		Write a program that will read three inputs of scores (quiz, mid term, and final scores)
		 and determine the grade based on the following rules:
		if the average score >=90 =>grade=A
		if the average score >= 70 and <90 => grade=B
		if the average score>=50 and <70 =>grade=C
		if the average score<50 =>grade=F
		 */
       //  avgScore=(quiz+midterm+final scores)/3

//		Scanner var=new Scanner(System.in);
//		System.out.println("Please enter your quiz score");
//		int quiz=var.nextInt();
//		System.out.println("Please enter your midterm score");
//		int midTerm=var.nextInt();
//		System.out.println("Please enter your final score");
//		int finalScore=var.nextInt();
//		
//		int averageScore=(quiz+midTerm+finalScore)/3;
//		System.out.println("Average score is "+averageScore);
//		
//		if (averageScore >=90) {
//			System.out.println("Your grade is A");
//		}else if(averageScore>=70 && averageScore<90) {
//			System.out.println("Your grade is B");
//		}else if(averageScore>=50 && averageScore<70) {
//			System.out.println("Your grade is C");
//		}else if (averageScore<50) {
//			System.out.println("Your grade is F");
//		}
//		
		/*Task1:Prompt the user to enter person heights in feet.
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




