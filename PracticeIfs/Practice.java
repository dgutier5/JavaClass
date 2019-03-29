package com.PracticeIfs;

public class Practice {

	public static void main(String[] args) {
		// If Else Practice
		//1.declare price and if price is higher than allowed price-->I will not buy. 
		//if price is lower than allowed proce i will buy
		
		double shoesPrice=29.99;
		double allowedPrice=31.99;
		
		if(shoesPrice>allowedPrice) {
			System.out.println("I will not buy");
		}else {
			System.out.println("I will buy");
		}
		
		
		System.out.println("========================");
		
		
		
		//If Else Practice
		//2. Create a java program and name it Double Comparison. Declare 2 double values and 
		//if value of first variable is higher then print "Double value__ is larger than__."
		
		double a=11.99;
		double b=5.00;
		if (a>b) {
			System.out.println("Double value "+a+" Is larger than Double value "+b);
		}else {
			System.out.println("Double value "+a+" Is smaller than Double value "+a);
		}
		
		System.out.println("===========================");
		
		//Temperature check, temp less than 32 will freeze
		double temp1=22;
		double temp2=32;
		
		if(temp1<temp2) {
			System.out.println("Water will freeze with temperature "+temp1);
		}else {
			System.out.println("Water will not freeze with temperature "+temp2);
		}
		
		System.out.println("=====================================================");
		
		//Practice If.. else if...else
		
		
		int num1=23;
		int num2=14;
		
		  if (num1>num2) {
			System.out.println("num1 is larger than num2");
		  }else if (num1==num2){
			  System.out.println("num1 is equal to num2");
		  }else {
			  System.out.println("num1 is smaller than num2");
		  }
		
		  System.out.println("=========================================================");
		  
		  /*
		   * Create a java program and declare int variable that will hold a day.
		   * Based on valure of the variable ur program should print the name of the day.
		   */
		
		
		int day=5;
		
		if (day==1) {
			System.out.println("Monday");
		}else if(day==2) {
			System.out.println("Tuesday");
		}else if(day==3) {
			System.out.println("Wednesday");
		}else if(day==4) {
			System.out.println("Thursday");
		}else if(day==5) {
			System.out.println("Friday");
		}else if(day==6) {
			System.out.println("Saturday");
		}else if (day==7){
			System.out.println("Sunday");
		}else {
			System.out.println("I don't know the day");
		}
		
		System.out.println("========================================================");
		
		//if..else if..else task
		//declare int variable that will hold a month. Based on the value of the variable ur 
		//program should print the name of the month.
		
		int month=9;
		
		if(month==1) {
			System.out.println("January");
		}else if(month==2) {
			System.out.println("February");
		}else if(month==3) {
			System.out.println("March");
		}else if(month==4) {
			System.out.println("April");
		}else if(month==5) {
			System.out.println("May");
		}else if(month==6) {
			System.out.println("June");
		}else if(month==7) {
			System.out.println("July");
		}else if(month==8) {
			System.out.println("August");
		}else if(month==9) {
			System.out.println("September");
		}else if(month==10) {
			System.out.println("October");
		}else if(month==11) {
			System.out.println("November");
		}else if(month==12) {
			System.out.println("December");
		}else {
			System.out.println("Don't know what month it is");
		}
		
		
		System.out.println("=============================================================");
		
		//Task Interview:
		//Write a Java Program to check whether number is Even or Odd
		////if number is divisible by two then that means there is no remainder so its even
		//if there is a remainder then its odd
		
		//Logic use if.else statement
			
		int num=10;
		
		if (num%2==0) {
			System.out.println(num+" is even");
		}else {
			System.out.println(num+ " is odd");
		}
		
		
		System.out.println("=================================");
		
	
		//TaskV:Compare three numbers
		//Write a program to find largest of three double values using if-else..if
		//find out biggest number from 3 numbers:	
		     //Logic:
		//compare d1 to d2 and d1 to d3
		//compare d2 to d1 and d2 to d3
		//compare d3 to d1 and d3 to d2
		//if numbers are equal
		
		double d1=5.21;
		double d2=2.21;
		double d3=3.32;
		
		if ((d1>d2) && (d1>d3)){
			System.out.println(d1+" is the largest number");
		}else if ((d2>d1)&&(d2>d3)){
			System.out.println(d2+" is the largest number");
		}else if ((d3>d1)&&(d3>d2)) {
			System.out.println(d3+"ia the largest number");
		}else {
			System.out.println("numbers are all equal");
		}
		
		
		System.out.println("===============================================");
		
		 //IF.ELSE IF....ELSE: Find the biggest number
		 // Possible scenarios are j>k, k>j, j=k	
		
		int j=300;
		int k=20;
		
		if(j>k) {
			System.out.println("J is bigger");
		}else if(k>j) {
			System.out.println("K is bigger");
		}else {
			System.out.println("j and k are equal");
		}
		
	System.out.println("==============================================================");
	
	
	//declare boolean variable isRaining, and if true-->stay home
	//logic if.else
	//Side note can assign boolean 2 ways:
	//boolean isRaining=false --> assign variable and declare true or false 
	//boolean result=4<5 --> use operational assignment that will be true or false
	
	boolean isRaining=true;
	if (isRaining) {
		System.out.println("stay home");
	}else { 
		System.out.println("go out");
	}
		
	System.out.println("======================================================");
	
	//Write a program to check whether the number is POSITIVE or NEGATIVE
	//Logic: number greater than zero is positive. number less than zero is negative
	//    -______________________0______________________________+
	//             number  <0				number>0
	
	int num3=5;
	
	if(num3>0) {
		System.out.println(num3+" is positive number");
	}else if(num3<0) {
		System.out.println(num3+" is negative number");
	}else {
		System.out.println("neither positive or negative");
	}
		
	System.out.println("==============================================================");
	
	//Scanner: a class-allows us to take input from user
	//Strings use nextLine()
	//Numbers use nextInt()
	//Single Character use next().charAt(0)
	
	
		
		
		
	
	
	
		
		
	}

}
