package com.Class11;

public class Array2DNamesTask {

	public static void main(String[] args) {
		//Create a 2D array that first row will contain 4 names and second row will contain grades.
		//Then you program should print name of the students that has as an A and B grade

		String[][]names= {
							{"Fabi ","Vic ","Mike ", "kate "},
							{"A","B","C","D"},
														};
		System.out.println(names[0][0]+"has grade of "+names[1][0]);
		System.out.println(names[0][1]+"has grade of "+names[1][1]);
		}
	}


