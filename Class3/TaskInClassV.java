package com.Class3;

public class TaskInClassV {

	public static void main(String[] args) {
		//COMPARE THREE NUMBERS
		
  //Task1: Write a program to find largest of three double values using if-else..if
		//find out biggest number from 3 numbers:	
		     //Logic:
		//compare d1 to d2 and d1 to d3
		//compare d2 to d1 and d2 to d3
		//compare d3 to d1 and d3 to d2
		//if numbers are equal
		
		double d1= 5.21;
		double d2=2.21;
		double d3= 3.32;
		if((d1>d2)&&(d1>d3)){
			System.out.println("d1 is the largest number");
		}else if ((d2>d1)&&(d2>d3)) {
			System.out.println("d2 is the largest number");
		}else if ((d3>d1)&&(d3>d2)) {
			System.out.println("d3 is the largest number");
		}else {
			System.out.println("numbers are all equal");
		}
		

//Task2. Program to find largest number amoung three numbers using nested if
		//Logic:
		//1. compare a to b--> if condition is true(that a is bigger than b --> 
		//in if condition: compare a number to c-->if a>c then a-is the largest else b will be largest.
	int a=120;
	int b=720;
	int c=620;
	
	if(a>b) {
		if(a>c) {
			System.out.println("A is the biggest number");
		}else { //if c>a 
			System.out.println("C is the biggest number");
		}
	}else { //if a<b
		if (b>c) {
			System.out.println("B is the largest number");
		}else {
			System.out.println("C is the lagest number");
		}
	}
	
	
	
	
	
	
	}
}

//Task3.(Interview Question!!) Program to check Even or Odd number
	



