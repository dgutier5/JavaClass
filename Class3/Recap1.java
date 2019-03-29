package com.Class3;

public class Recap1 {

	public static void main(String[] args) {
		 //IF.ELSE IF....ELSE: Find the biggest number
		 // Possible scenarios are a>b, b>a, a=b	
		
		int a=300;
		int b=20;
		
//		if (a>b) {
//			System.out.println("a is bigger");
//		}else if(b>a) {
//			System.out.println("b is bigger");
//		}else {
//			System.out.println("numbers are equal");
//		}
		
		//NESTED IF:EX-first check if numbers are not equal, and only then if they are not equal COMPARE them.
			
			if(a!=b) { 
				System.out.println("numbers are not equal. Now i can compare them");
				
				if (a>b) {
					System.out.println("a  is bigger number");
				}else {
					System.out.println("b is bigger number");
				}	
				
			}else {
				System.out.println("numbers are equal");
			}
			
			int age=18;
			double gpa=3.5;
			//first verify age->then if age is >18-->then compare gpa.
			// and if age is less than 18 I wont do anthing
			
			if (age>18) {
				
				System.out.println("you are old enough to go to college");
				
				if(gpa>3.5) {
					System.out.println("you are elible for scholarship");
				}else {
					System.out.println("you should study harder");
				}
				
			}else {
				System.out.println("you are too young for college ");
			}
			
	//find out biggest number from 3 numbers:	
	//compare x to y and x to z 
	//compare y to x and y to z
	//compare z to x and z to y
	//if numbers are equal
			
		int x=300;
		int y=200; 
		int z=100;
		
		//logical operators in Java
		//1. && And
		// true AND true= true
		//true AND false=false
		//false AND true=false
		//false AND false=false
		
		//2. OR ||
		// true OR true=true
		//true OR false=true
		//false OR true= true
		//false OR false=false
		
		if ((x>y)&&(x>z)) {
			System.out.println("X is the largest number");
			
		}else if ((y>x)&&(y>z)) {
			System.out.println( "y is the largest number");
			
		}else if ((z>x)&&(z>y)) {
			System.out.println("z is the largest number" );
		}else {
			System.out.println("numbers are equal");
		}
	
//Task1 comparing 3 doubles using if else
		// compare 3 numbers using nested if
		
		
			
			
			
			
			
			
	}

}
