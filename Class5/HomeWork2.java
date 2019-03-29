package com.Class5;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		//HW2. Program to find largest number amoung three numbers using nested if
		//provided by a user (numbers must be distinct)
		//Logic:
		//1. compare a to b--> if condition is true(that a is bigger than b --> 
		//in if condition: compare a number to c-->if a>c then a-is the largest else b will be largest.
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Please input first number ");
//		int a=sc.nextInt();
//		System.out.println("Please input second number");
//		int b=sc.nextInt();
//		System.out.println("Please input third number");
//		int c=sc.nextInt();
//	
//	if(a>b) {
//		if(a>c) {
//			System.out.println("A is the biggest number");
//		}else { //if c>a 
//			System.out.println("C is the biggest number");
//		}
//	}else { //if a<b
//		if (b>c) {
//			System.out.println("B is the largest number");
//		}else {
//			System.out.println("C is the lagest number");
//		}
//	}
//	
	//Task - Compare 3 job salaries, 3 users will provide their salaries and its your job to compare 
	// the salaries and declare which salary is the largest.
	
	Scanner vb=new Scanner(System.in);
	System.out.println("Please input salary one");
	double salaryOne=vb.nextDouble();
	System.out.println("Please input salary two");
	double salaryTwo=vb.nextDouble();
	System.out.println("Please input salary three");
	double salaryThree=vb.nextDouble();
	
	if (salaryOne>salaryTwo && salaryOne>salaryThree) {
		System.out.println("Salary one  is largest");
	}else if(salaryTwo>salaryOne && salaryTwo>salaryThree) {
		System.out.println("Salary Two is largest");
	}else{
		System.out.println("Salary three is largest");
	}
  
	}

}
