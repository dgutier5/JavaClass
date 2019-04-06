package com.Class11;

public class Practice {

	public static void main(String[] args) {
				
		//Create array using new keyword:
		String [] names1=new String [6];
		
		names1[0]="Cindy";
		names1[1]="Georgie";
		names1[2]="Oni";
		names1[3]="Agi";
		names1[4]="Sam";
		names1[5]="Ross"; 
		
		for(int i=0; i<names1.length; i++) {
			System.out.println(names1[i]);
			
			}
		
		
		//2. Create array using array literal
		
		String [] studentNames= {"Shaban","Bilal","Mehmet","Zaki","Samir","Frank"};
		System.out.println("----------ForLoop-----------");
		for(int i=0; i<=studentNames.length-1; i++) {
			System.out.println(studentNames[i]);
		}
	
		
		System.out.println("------Advanced for each loop---------");
		/*Retrieve values using: advanced for loop/for each loop/enhanced for loop
		Can use: only when we work with arrays or later with collections
		SYNTAX: 
		*/
		
		for(String student:studentNames) {
		System.out.println(student);
		}
		
		
		
		
		
	}
	
}
