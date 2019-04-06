package com.Class11;

public class IQLargestNumberTask {
		//interview question
	public static void main(String[] args) {
		//Create an array of integers and find the largest number
		
		//1.
		int[] numbers = {200,20,13,4,65}; 

		int biggest=200;
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]>biggest) {
				biggest=numbers[i];
			}
		}
		System.out.println(biggest);
		
		
		
		
		System.out.println("==========");
		
		//2. interview pkt:
		int [] numArray= {12,13,12,15,0,-1};
		
		int largest=15;
		for(int i=0; i<numArray.length; i++) {
			if(numArray[i]>largest) {
				largest=numArray[i];
			}
		}
		System.out.println(largest);
		
		
	}

}
