package com.Class3;

public class TaskInClass {

	public static void main(String[] args) {
		
	//Task1-(ifELSE..ELSEif)used to test multiple conditions
	//declare int variable that will hold a month. Based on the value of the variable ur 
	//program should print the name of the month.
		
		int month=9;
		
		if(month==1) {
			System.out.println("January");
		}else if(month==2) {
			System.out.println("February");
		}else if(month==3) {
			System.out.println("March");
		}else if(month==4){
			System.out.println("April");
		}else if(month==5){
			System.out.println("May");
		}else if(month==6){
			System.out.println("June");
		}else if(month==7){
			System.out.println("July");
		}else if(month==8){
			System.out.println("August");
		}else if(month==9){
			System.out.println("September");
		}else if(month==10){
			System.out.println("October");
		}else if(month==11){
			System.out.println("November");
		}else if(month==12){
			System.out.println("December");			
		}else {
			System.out.println("I do not know the month");
		}	
		
					
	//Task2: Write a java prog to check whether number is even or odd
	//if number is divisible by two then that means there is no remainder so its even
	//if there is a remainder then its odd
		
		 int num1=10;
		
		 if(num1 % 2 == 0) {
	        System.out.println(num1 + " is even");
		 }else {
	        System.out.println(num1 + " is odd");
		 }
		 
	//Check if number is positive or negative
	     int z=20;
	     if(z>0) {
	    	 System.out.println("number is positive"); 
	     }else {
	    	 System.out.println("number is negative");
	     }
	     
	     //find out if a number is even or odd
	     //please display Even if the number is even and Odd if number is odd
	     
	     int num2=11;
	      if(num2%2==0) {
	    	  System.out.println(num2+"  is even"); 
	      }else {
	    	   System.out.println(num2+" is odd");
	      }
	      
	      int num3=10;
	       if(num3%2==0) {
	    	   System.out.println(num3+" is even");
	       }else {
	    	   System.out.println(num3+" is odd");
	       }
				
		//write a program to check whether number is positive or negative
	       int c=20;
		     if(c>0) {
		    	 System.out.println("number is positive"); 
		     }else {
		    	 System.out.println("number is negative");
		     }
		//OR
		     int num=0;
		     if(num>0) {
		    	 System.out.println("number is positive"); 
		     }else if (num<0){
		    	 System.out.println("number is negative");
		     }else {
		    	 System.out.println("The value of num is equals to "+num);
		     }
	       
	       
	       
	}

}
