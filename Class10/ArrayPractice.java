package com.Class10;

public class ArrayPractice {

	public static void main(String[] args) {
		/* 1.Create an array of chars and store grades into it: A,B,C,D,E,F. 
		Then print a grade B (use 2 different ways of creating an array).
		*/
		//2 ways to do this:
		
		//1.
						//0   1   2   3   4   5
		char [] grades= {'A','B','C','D','E','F'};
		
		System.out.println(grades[1]); //B
		System.out.println(grades.length); //6
		
		//2.
		char [] grades1=new char[6];
		
		grades1[0]='A';
		grades1[1]='B';
		grades1[2]='C';
		grades1[3]='D';
		grades1[4]='E';
		grades1[5]='F';
		
		System.out.println(grades1[1]); //B
		
		System.out.println("---------------------------------------");
		
		/*2.Create an array of names and store all names of your group. 
		Then print your name from that array. (use 2 different ways of creating an array).
		 */
	
		//1.
						//	0      1         2         3       4
		String [] names= {"Fabi","Vick","Anastasia","Adrian","Aika"};
							
		System.out.println(names[0]);
		System.out.println(names.length); //5
		
		//2.
		
		String [] names1=new String[5];
		names1[0]="Fabi";
		names1[1]="Vick";
		names1[2]="Anastasia";
		names1[3]="Adrian";
		names1[4]="Aika";
		
		 System.out.println(names1[0]); //Fabi
		
		System.out.println("-------------------------");
		
		/*3.Create an array of words: Java, Saturday, day, coding, is.
		Print the following sentence using element of array: “Saturday is Java coding Day”.
		*/
					//		0         1        2      3       4    
		String [] words= {"Java", "Saturday","Day","coding","is"};
		System.out.println(words.length); //5
		
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		
		
		
		
		
		
		
		
	}

}
