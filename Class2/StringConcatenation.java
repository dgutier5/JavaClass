package com.Class2;

public class StringConcatenation {

	public static void main(String[] args) {
		/*
		String name="John";
		my name is John:
		System.out.println("My name is"+ " "+name);
		
		String day="Sunday";
		//Sunday is a coding day
		System.out.println(day+"is a coding day");
		
		//The value of num1 is___ and the value of num2 is ___.
		int num1=12;
		int num2=13;
		System.out.println("the value of num1 is"+ num1+" and the value of num2 is"+num2+".");
		*/
		
		String name="John";
		String lastName="Smith";
		char grade='B';
		String city="fairfax";
		String state="VA";
		long phoneNumber=5712761712l;
		
		/*Print:
		My name is___ and my last name is_____
		I am a___student
		I live in city of ____ in a state of__
		My phone number is _______
		*/
		System.out.println("My name is " +name+ " and my last name is "+lastName);
		System.out.println("I am a "+grade+" student");
		System.out.println("I live in city of "+city+ " in a state of "+state);
		System.out.println("My phone number is "+phoneNumber);
		
		
	}

}
