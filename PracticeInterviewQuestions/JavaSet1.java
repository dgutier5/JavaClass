package com.PracticeInterviewQuestions;

public class JavaSet1 {
	
	public static void main(String[] args) {
	
	// 1. Write a program to ->swap 2 numbers without a temporary variable? 
	// 1.1 Swap  2 strings without a temporary variable?
		//cannot use a=b; or c=a; or b=a;
		
		//1.Swap 2 numbers: want a=20 and b=10
		int a = 10;
		int b = 20; 
	
	  
		a=a+b; //a=10+20 ->a=30
		b=a-b; //b=30-20 ->b=10 *
		a=a-b; //a=30-10 ->a=20 *
		
		System.out.println(a);//10
		System.out.println(b);//20
		
System.out.println("------------------------------------------");

		//1.1 Swap 2 strings: want x=Welcome and y=Hello
		
		String x="Hello";	//4 length
		String y="Welcome"; //7 length
		
		x=x+y;  //HelloWelcome   //x is 11 length
		y=x.substring(0,x.length()-y.length());  //11-7=4 now y=Hello
		x=x.substring(y.length()); //now x=Welcome
		
		System.out.println(y);
		System.out.println(x);
		
		
	
	// 2.Write a java program to find the second largest number in the array? 
	// Maximum and minimum number in the array?

			
	
	
	// 3. Find out how many alpha characters present in a string?

			
	
	
	// 4.How to find out the part of the string from a string? 
	// What is substring? Find number of words in string?

			
	
	
	//5. Write a java program to reverse String? Reverse a string word by word?

		
	}	
}
