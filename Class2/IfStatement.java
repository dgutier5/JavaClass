package com.Class2;

public class IfStatement {
	
	public static void main(String[] args) {
		
		
		//only if a is equal to 10  print "Value of a=10"
		//= assignment operator
		//== compare
		//Initialize variable
		int a=10;
		//Print
		System.out.println(a);
		//Compare
		if (a==10) {
			System.out.println("a is equal to 10");
		}
		//if b is more than 11 then print b is greater than 11
		
		int b=12;
		
		if(b>11) {
			System.out.println("the value of b is greater than 11");
		}else {
			System.out.println("the value of b is less than 11");
			
		}
		
		//Compare 2 numbers
		int x=35;
		int y=40;
		if(x<y) {
			System.out.println("x is less than y");
		}else {
			System.out.println("y is greater than x");
		}
		
		//Compare 2 double value 
		double a2=4.67;
		double d2=5.0;
		
		if(a2==d2) {
			System.out.println("a2 is equal to d2");
		}else {
			System.out.println("a2 is not equal to d2");
		}
		
		//Compare 2 double value and identify which is greater
		
		if (a2<d2) {
			System.out.println("a2 is less than d2");
		}else {
			System.out.println("a2 is greater than d2");
		}
		
		//Task:Check if number is positive or negative
		//        -1________<________0_______>___________1
		
		int f=10;
		
		if (f<0) {
			System.out.println("f is a negative number"); 
		}else {
			System.out.println("f is a positve number");
		}	
		
		
	}
}

