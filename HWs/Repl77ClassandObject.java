package com.HWs;

public class Repl77ClassandObject {
	
	public static void Main(String carColor, int carModelYear, String carName) {
		
		System.out.println("Car color is "+carColor+" and car model year is "+carModelYear+" and car name is "+carName);
		
	}

	public static void main(String[] args) {
		/*
		 create a class named 'Main' with specific attributes.
		 For you to do

		 Create two object in which you will be assigning the following values.
  		 carColor='Black'
		 carModelYear=2019
		 carName='BMW'

		 carColor='White'
		 carModelYear=2018
		 carName='Toyota'

		 Car color is Black and car model year is 2019 and car name is BMW
		 Car color is White and car model year is 2018 and car name is Toyota
		 
		 */
		
		Repl77ClassandObject car1 = new Repl77ClassandObject();
		car1.Main("Black", 2019, "BMW");
		
		Repl77ClassandObject car2 = new Repl77ClassandObject();
		car2.Main("White", 2018, "Toyota");
		
	}

}
