package com.Class6;

import java.util.Scanner;

public class TaskTwoScannerGradeSwitch {

	public static void main(String[] args) {
		
	/*Allow user to enter grade and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad, 
	any other grade --> Not Acceptable.
	At the end your program should print which grade was entered by a user with explanation.
	*/
		Scanner scan;
		char grade;
		String explanation="";
		
		scan=new Scanner(System.in);
		System.out.println("Please enter grade");
		grade=scan.next().charAt(0);
		
		 switch (grade) {// specifying variable(grade) on which i will be providing diffrent values
	        
	        case 'A':
	            explanation="excellent";
	            break;	
	            
	        case 'B':
	        	explanation="Good";
	        	break;
	        
	        case 'C':
	        	explanation="Average";
	        	break;
	        	
	        case 'D':
	        	explanation="Bad";
	        	break;
	        	
	        default:
	        	explanation="Not acceptable";
	                 
	         
		 }
		 System.out.println( "Your grade is "+grade+" "+explanation);

		 
	}

}
