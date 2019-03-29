package com.Class2;

public class TasksStringConcatenation {

	public static void main(String[] args) {
		
		/*Print:
		My name is___ and my last name is_____
		I am a___student
		I live in city of ____ in a state of__
		My phone number is _______
		*/
		
		String name="John";
		String lastName="Smith";
		char grade='A';
		String city="fairfax";
		String state="VA";
		long phoneNumber=5712761712l;
		
		System.out.println("My name is " +name+ " and my last name is "+lastName);
		System.out.println("I am a "+grade+" student");
		System.out.println("I live in city of "+city+" in a state of "+state);
		System.out.println("My phone number is "+phoneNumber);
		//Spaces MATTER INSIDE the quotes, not outside the quotes
		
	}

}
