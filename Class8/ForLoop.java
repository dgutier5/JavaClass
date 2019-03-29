package com.Class8;

public class ForLoop {

	public static void main(String[] args) {
		// initialize    condition:testCondition   increment/decrement
         for (int i=0  ;  i<=5      ;               i++)  {
        	 
        	 System.out.println( "Good morning "+i);
         }
         
         /*I want to print numbers from 10 to 1*///
         //if we know how many times ur code needs to get executed: use forloop
         
         for (int i=10; i>=1; i--) {
        	 
        	 System.out.println(i);
         }
         
         /*I want to print numbers from *///
         
         for (int a=0; a<=20; a+=2) {
        	 System.out.println(a);
         }
         for (int b=1; b>=50; b+=5) {// wont work bc condition not true 1 is not greater than 50
        	 System.out.println(b);
         }
         
         
         
	}

}
