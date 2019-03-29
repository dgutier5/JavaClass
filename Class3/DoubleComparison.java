package com.Class3;

public class DoubleComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Task1: Create a Java program and name it Double Comparison. Declare 2 double values and if value 
	//of first variable is higher then print “Double value __ is larger than __ .” and vs	
		double d1=10.01;
		double d2=20.99;
		
		if (d1<d2) {
			System.out.println("double value"+d1+"is less than"+d2);
		}else {
			System.out.println("double value"+d1+"is larger than"+d2);
		}
		
	//Task 2 create var to store temp. program should check if temp is below 32 then it should print
	//" Water will freeze with temp__". otherwise "Water will Not freeze with temp__"
		
		double temp1=10.0;
		double temp2=32.0; 
		
		if (temp1<temp2) {
			System.out.println("water will freeze with temp "+temp1);
		}else {
			System.out.println("water will Not freeze with temp "+temp2);
			
			
		}
				
		
		
		

	}

}
