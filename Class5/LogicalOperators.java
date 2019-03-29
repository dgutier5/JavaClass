package com.Class5;

public class LogicalOperators {

	public static void main(String[] args) {
		
		//logical operators in Java
				//1. AND &&
				// true AND true= true
				//true AND false=false
				//false AND true=false
				//false AND false=false
				
				//2. OR ||
				// true OR true=true
				//true OR false=true
				//false OR true= true
				//false OR false=false
		
		/*if number is between 1-10 -->number is small
		 * if number is between 11-100-->number is medium
		 * if number is between 101-1000-->number is large
		 * have multiple scenarios so use if.elseif.else
		 */
		
		int num=15;//declare variale
		
		if(num>=1 && num<=10) { //true & fale =false
			System.out.println("number is small");
		}else if(num>=11 && num<=100) { //true & true= true
			System.out.println("number is medium");
		}else if(num>101 && num<=1000) {  //false & true=false
			System.out.println("number is large");
		}else {
			System.out.println("number is not in range");
		}
				
			

	}

}
