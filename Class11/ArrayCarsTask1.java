package com.Class11;

public class ArrayCarsTask1 {
		//GET ALL
	public static void main(String[] args) {
		// Create an array of cars and store 6 elements into it. 
		//Using 2 different loops print all values from the array
		
		//1.literal 
		String[] cars= {"honda","Jaguar","Jeep","Mazda","Toyota","Tesla"};
		
		
		for (int i=0; i<cars.length;i++) {
			System.out.println(cars[i]);
			
		}
		System.out.println("============================");
		
		//2:Advanced loop
		for(String element:cars) {		//element is just a label u put
			System.out.println(element);
		}

	}

}
