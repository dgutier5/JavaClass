package com.HWs;

import java.util.Scanner;

public class ArrayIntScannerReversed {

	public static void main(String[] args) {
		// Write an array with size of 5. Use a loop to input values to the array. 
		// Then print out all the elements you have created in the first loop in reverse order. 
		
	Scanner sc = new Scanner(System.in);
	
	int [] arr = new int [5];
	int reverse = 0;
	
	for (int i = 0; i < arr.length; i++) {
		System.out.println();
		arr[i] = sc.nextInt();
	}
	
	for (int i = arr.length-1; i >= 0; i-- ) {
		reverse = arr[i];
		System.out.println(reverse);
	}

	}

}
