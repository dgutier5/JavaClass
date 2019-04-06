package com.Class11;

public class IQPractice {

	public static void main(String[] args) {
		//Create an array of integers and find largest number 
		
		  int[] numbers = {200,20,13,499,65}; 
		  int largest=numbers[0];
		  for(int i=0; i<numbers.length; i++) {
			  if(numbers[i]>largest) {
				  largest=numbers[i];
			  }
		  }
		  System.out.println("The largest number is "+largest);
		  
		  
		  System.out.println("---Smallest Num-------");
		   
		  int smallest=numbers[0];
		  for(int i=0; i<numbers.length; i++) {
			  if(numbers[i]<smallest) {
				  smallest=numbers[i];
			  }
		  }
		  
		  System.out.println("The smallest number is "+smallest);
		  
		  
	}

}
