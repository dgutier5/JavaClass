package com.Class11;

public class IQArrayIntegerTask3 {
		//INTERVIEW QUESTION Asel Solution
	public static void main(String[] args) {
		//Create an array of integers and find largest number 
		
		  int[] numbers = {200,20,13,499,65}; 
		  
	      int largest=numbers[0]; //*assume first element  200 of array is the largest just starting at beggining
	      
	       for(int i=0; i<numbers.length;i++) { //syso outside this loop 
	    	   
	    	   if (numbers[i]>largest) {
	    		   largest=numbers[i]; //here largest changes to 499 reassigned
	    	   }
	       }      //end of for loop syso outside of here
	       
	       System.out.println("The largest number is "+largest); //here
			  
	}
}

//***Note Rule: also when solving for smallest. Always assume first element at index 0 is
//the smallest and assign it to smallest

/*Learning point: why do we use the very first element to assume its the smallest/largest?
 * that way it will loop thru each one starting at the BEGGINING!!!. that way if u have a million
 * numbers you dont have to look thru to find which is the biggest/smallest.
 */
		
