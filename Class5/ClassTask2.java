package com.Class5;

import java.util.Scanner;

public class ClassTask2 {

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
		
			Scanner scanner;
			int quiz;
			int midTerm;
			int finalGrade;
			int average;
                
            scanner = new Scanner(System.in);
            System.out.println("Please enter quiz score: ");
             quiz = scanner.nextInt(); //capturing user input for quiz
            
            System.out.println("Please enter mid term score: ");
            midTerm = scanner.nextInt();
            
            System.out.println("Please enter final score: ");
            finalGrade = scanner.nextInt(); 
            
             average = (quiz+midTerm+finalGrade)/3;
             
             System.out.println("Average score is "+average);
            
            if(average >= 90) {
                System.out.println("Your Grade is A");
            } else if(average >= 70 && average < 90) {
                System.out.println("Your Grade is B");
            } else if(average >= 50 && average < 70) {
                System.out.println("Your Grade is C");
            } else if (average <50) {
                System.out.println("Your Grade is F");
            }
		
	}

}

		
		
		
		
		
		
		
	


