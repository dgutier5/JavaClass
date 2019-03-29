package com.PracticeIfs;

public class NestedIfGpa {

	public static void main(String[] args) {

		/*declare var for gpa and having a diploma
		 * if user has a diplom_>congrats-> if gpa is higher 3.5->higher person or else do not hire.
		 */
		
		double gpa=3.6;
		double expectedGpa=3.5;
		
		boolean hasDiploma=true;
		
		if (hasDiploma) {
			System.out.println("congrats");
			if(gpa>expectedGpa) {
				System.out.println("You are hired");
			}else {
				System.out.println("No dont hire");
			}
		}else {
			System.out.println("Please get degree");
		}
			
		
		
		
		}
		
}


