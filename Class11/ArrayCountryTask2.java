package com.Class11;

public class ArrayCountryTask2 {
/*Create an array of countries. 
 * While retrieving all values from an array print capital for each country. (use 2 different loops).
 */
	public static void main(String[] args) {
		
		//1. for loop
		 String[] array = { "USA", "Russia", "Turkey", "Spain" };
	        for (int i = 0; i < array.length; i++) {
	            if (array[i].equals("USA")) {
	                System.out.println("Washington DC");
	            } else if (array[i].equals("Russia")) {
	                System.out.println("Moscow");
	             } else if (array[i].equals("Turkey")) {
	                System.out.println("Ankara");
	            } else if (array[i].equals("Spain")) {
	                System.out.println("Madrid");
	            }
	        }
	        System.out.println("===========================");
	        
	        
	        //2.for each loop
	        
	        String[] contries = { "USA", "Afghanistan", "Kazakhstan", "Ukraine" };
	        for (String country : contries) {
	            switch (country) {
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