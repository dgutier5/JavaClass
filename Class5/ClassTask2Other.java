 package com.Class5;

import java.util.Scanner;

public class ClassTask2Other {

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
		
//		Scanner scan;
//		int quiz;
//		int midTerm;
//		int finalScore;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your quiz score");
		int quiz = sc.nextInt();
		System.out.println("Please enter your mid term score");
		int midTerm = sc.nextInt();
		System.out.println("Please enter your final score");
		int finalScore = sc.nextInt();
		
		int avgScore = (quiz+midTerm+finalScore)/3;
		System.out.println("Average score is "+avgScore);
         
		
		
		if (avgScore>=90) {
			System.out.println("Your grade is A");
		}else if (avgScore >=70 && avgScore>90) {
			System.out.println("Your grade is B");
		}else if (avgScore >=50 && avgScore<70 ) {
			 System.out.println("Your grade is C");
		}else if (avgScore<50)	 {
			System.out.println("Your grade is F");
		}
	 }
}


