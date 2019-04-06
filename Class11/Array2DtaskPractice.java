package com.Class11;

public class Array2DtaskPractice {

	public static void main(String[] args) {
		
		/*1.Create a 2D array where you will store the following values:
		Mr, Mrs, Ms, Miss and  
		Smith, Jordan, Jackson, Obama.
		After storing values print the following:
		Mrs Smith, Mr Obama, Ms Jackson
	   */	
		
		
		String [][]names = {
								{"Mr","Mrs","Ms","Miss"},
								{"Smith", "Jordan","Jackson","Obama"}					
							};
		
		System.out.println(names[0][1]+" "+names[1][0]);
		System.out.println(names[0][0]+" "+names[1][3]);
		System.out.println(names[0][2]+" "+names[1][2]);
		
		
		/*Create a 2D array that first row will contain 4 names and second row will contain grades.
		Then you program should print name of the students that has as an A and B grade
		*/
		
		String[][]grades= {
							{"Victor","Fabi","Joe","Ned"},
							{"A","A","C","B"},					
						  };
		
		System.out.println(grades[0][0]+" and "+grades[0][1]+" has grade of A");
		System.out.println(grades[0][3]+" has grade of B");
		
		
		
		
		
		
		

	}

}
