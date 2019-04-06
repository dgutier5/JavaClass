package com.Class11;

public class TasksPractice {

	public static void main(String[] args) {
		//1. Create an array of cars and store 6 elements into it
		//Using 2 different loops. Print all values from that array.
		//Then retrieve all values from that array.
		
		
		String [] cars= {"BMW","Jeep","Honda","Toyota","Ford","Maserati"};
		System.out.println("--------foreachloop-------");
		//1.for each loop
			for(String rides:cars) {
				System.out.println(rides);
			}
		System.out.println("------forloop--------");
		//2.for loop
			for(int i=0; i<cars.length; i++) {
				System.out.println(cars[i]);
				
			}
			
			
		
	/*Create an array of countries. 
	* While retrieving all values from an array print capital for each country.
	*  (use 2 different loops).
	*/
			System.out.println("-----forLoop-----");
	//1.for loop & array literal 
			//**For string dont use == always use .equals 
			
			String [] array= {"USA","Russia","Turkey","Spain"};
			for(int i=0; i<array.length; i++) {
				if(array[i].equals("USA")) {
					System.out.println("Washington DC");
				}else if(array[i].equals("Russia")) {
					System.out.println("Moscow");
				}else if(array[i].equals("Turkey")) {
					System.out.println("Andara");
				}else if(array[i].equals("Spain")) {
					System.out.println("Madrid");
				}	
					
			}
			
			
		System.out.println("---ForEach-----");
		//2.for each loop & array literal & switch case-> only use to check for equality
		
		   String[] countries = { "USA", "Afghanistan", "Kazakhstan", "Ukraine" };
	       for(String country:countries) {
	    	   switch(country) {
	    	   case "USA":
	    		   System.out.println("Washington DC");
	    		   break;
	    	   case "Afghanistan":
	    		   System.out.println("Kabul");
	    		   break;
	    	   case "Kazakhstan":
	    		   System.out.println("Astana");
	    		   break;
	    	   case "Ukraine":
	    		   System.out.println("Kiev");
	    		   break;
	    	   }
	    	   
	       }
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
				
				
				 		
		}
	}
