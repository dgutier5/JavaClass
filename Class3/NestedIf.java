package com.Class3;

public class NestedIf {
	public static void main(String[] args) {
		
	//compare age.If age is <18-->you are not allowed to work. If age>18 and if age<64 -->you are working.
	// if age>64--> you are retired.	
	  
		int age=21;
		if(age<18) {
			System.out.println("You are teenager, please dont work");
		}else {
			System.out.println("You are older than 18");
			
			if(age<64) {
				System.out.println("you are eligible to work");
			}else {
				System.out.println("enjoy your life");
			}
		
		
		
		
		
		}	
	}
}
