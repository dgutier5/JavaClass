package com.Class2;

public class VariableChange {
	
	public static void main(String[] args) {
		//values of variables can be changed	
		String name="John";
		String lastName="Smith";
		lastName="Johnson";
		
		char grade='B';
		//char grade='A'; does not work
		grade='A';
		
		//creating a variable & assigning the value
		String city="fairfax";
		//printing the value of city
		System.out.println(city);//fairfax
		//changing value of city from Fairfax to NY
		city="New York";//variable of variable is changed
		//printing new value of city NY
		System.out.println(city);//New York
		System.out.println(lastName);
		
	}
}
