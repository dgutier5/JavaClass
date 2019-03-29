package com.Class6;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Write a program that prints out if it is good weather to go for any activity.
		if the temp is between 40 degree and 80 degrees inclusive & no rain--> we will go hiking
		otherwise -->we will not go hiking
		if temp is between 25 and 40 inclusive &snowing-->going snowboarding otherwise 
		we are not going snowboarding
		if temp is more than 80 & sunny-->go to beach
		otherwise --> not go to the beach
		*/
		//raining snowing sunny us e boolean temp also from user check temp first 
		
		Scanner scan;
		boolean snow, rain, sunny;
		int temp;
		String activity;//no value for act here or =null or =""
		
		scan=new Scanner(System.in);
		System.out.println("Please enter a temperature");
		temp=scan.nextInt(); 
	
		
		if (temp>=40 && temp<=80) {
			System.out.println("Is it raining");//expecting users boolean input
			rain=scan.nextBoolean();//var rain holds either true or false
			
				if (rain) {
					activity="Watch a movie";//here at all activity, assigning value to variable activity
				}else {
					activity="go hiking";
				}
			
			
		}else if (temp>=25 && temp<=40) {
			System.out.println("Is it snowing");//ask user boolean question
			snow=scan.nextBoolean();
			
				if(snow) {
					activity="Snowboarding";
				}else {
					activity="Lets code";
				}
				
		}else if (temp>=80){
			System.out.println("Is it sunny");//exp users input
			sunny=scan.nextBoolean();
			
				if(sunny) {
					activity="Go to the beach";
				}else {
					activity="Do more coding";
				}
				
		}else {
			System.out.println("Please enter diff temp");
			activity="Unknow";
		}
		
		System.out.println("My activity for today is "+activity);
		
		
		}
		
		
		
	

}
