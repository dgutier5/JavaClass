package com.HWs;

import java.util.Scanner;

public class ArrayIntScanner {

	public static void main(String[] args) {
		/* Create an int array with the size of 5 and input values with Scanner. 
		 * Print out each element of the array multiplied by ten, one element per line. 
		 * Create a loop and enter values into one loop, the second loop print the values 
		 * and it must be multiplied by 10.
		 * 
		 */

		int[] arr= new int [5];
		Scanner sc;

		
		sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
		System.out.println("Please enter an integer to put into array");
		arr[i] = sc.nextInt(); 
		}
		for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]+" Multiplied by 10 is "+(arr[i]*10));
		}
		
		
		
		
	}

}
