package com.class15;

import java.util.Scanner;

public class IQ7 {

	public static void main(String[] args) {
		// Write a Java Program to check wheter a given number is prime or not
		// Prime Number should meet 2 conditions: divisible by 1 and by itself ONLY
		// 2,3,5,7,11,13,17,19,23,29
		
		
		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number to check if it is prime");
		number = input.nextInt();
		boolean prime = true;
		for (int i = 2; i < number; i++) {
			if (number % i != 0) {

			}else {
				prime = false;
				break;
			}
		}
		System.out.println(prime);

	}

}
