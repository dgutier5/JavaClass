package com.Class2;

public class ArithmeticOperators {
	
	public static void main(String[] args) {
		//declare 2 int variables and then we perform:
		//addition, subtraction, multiplication, division
		
		/*int a=30;
		int b=15;
		
		System.out.println(a+b); //45
		System.out.println(a-b); //15
		System.out.println(a*b); //450
		System.out.println(a/b); //2
		
		int sum=a+b;
		int sub=a-b;
		int mult=a*b;
		int div= a/b;
		
		System.out.println(sum); //45
		System.out.println(sub); //15
		System.out.println(mult); //450
		System.out.println(div); //2
		
		//print: the ___of 2 numbers is___
		System.out.println("the addition of 2 numbers is "+ sum);
		System.out.println("the subtraction of 2 numbers is "+sub);
		System.out.println("the multiplication of 2 numbers is "+mult);
		System.out.println("the division of 2 numbers is "+div);
		*/
		
		/*task 1:Write a Java program to add,subtract,multiply and divide 2 decimal values.
		Yourprogram should say. “The _______ of 2numbers ___ and ___ is equal to _____”*/
		
		double d1=2.0;
		double d2=2.4;
	
		double sum=d1+d2;
		double sub=d1-d2;
		double mult=d1*d2;
		double div= d1/d2;
		
		System.out.println("the addition of 2 numbers "+d1+" and "+d2+" is equal to "+sum);
		System.out.println("the substraction of 2 numbers "+d1+" and "+d2+" is equal to"+sub);
		System.out.println("the multiplication of 2 numbers"+d1+" and d2"+"is equal to"+mult);
		System.out.println("the division of 2 numbers "+d1+" and d2"+"is equal to"+div);
		
		/*task2:Write a program to find the square of the number 3.9. You program should say “The
		square of the ____ is ____" */

		double d3=3.9;
		double area=d3*d3;
		System.out.println(area);//15.209999
		System.out.println("The square of the number 3.9"+" is "+area);
		
		/*task3:Write a program to print the area and perimeter of a rectangle with width = 5 and height = 8. 
		Your program should say. “The perimeter of a rectangle with width ___ and
		height ____ is equal to _____ and the area is __”*/
		
		int width=5;
		int height=8;
		int area1=width*height;
		int perimeter=2*(width*height);
		System.out.println("The perimeter of a rectangle with width "+width+" and height "+height+" is equal to "+perimeter+" and the area is "+area1);
		
		
		
	}
}
