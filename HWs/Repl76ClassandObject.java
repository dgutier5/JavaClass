package com.HWs;

public class Repl76ClassandObject {
	
	public static void main(String name, int roll_no) {
		
		System.out.println("Name is "+name+" and roll number is "+roll_no);
	}

	public static void main(String[] args) {
		/*  Create a class named 'Main' with String variable 'name' and integer variable 'roll_no'. 

			Creating an object of the class Main and assign value of 2 to roll_no and name 
			as "John"

			Your program should print the following:
			Name is John and roll number is 2
		 
		 */
		
		Repl76ClassandObject ob = new Repl76ClassandObject();
		ob.main("John", 2);
		
		
		
		
	}

}
