package com.Class7;

public class BooleanLoopTask {

	public static void main(String[] args) {
		/*create a boolean variable workDay and assign true
	    * create int variable day and assign it to 1
	    * as long as it is workDay print--> "I need a day off" and increment day
	    * day once day is 6 --> your condition for your loop should become false 
		*/
		
		boolean workDay=true;
		int day=1;
		 while(workDay) {
			 
			 if (day==6) {
				 workDay=false;
				 System.out.println("I do not need a day off");
			 }else {
				 System.out.println("I need a day off");
			 }
			 day++;
		 }

	}
}


