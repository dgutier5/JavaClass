package com.Class10;

public class ArrayCreation {

	public static void main(String[] args) {
		
		//another way to create & intialize the array:
					//  0, 1, 2, 3 :index
		int [] array= {10,20,30,40};
		
		//access:
		System.out.println(array[2]); //30
		
		//To find size of an array:*for length count starts from 1
		
		System.out.println(array.length); //4 
		
		//Create String of 5 names
		 				//	0       1      2      3         4 index
		String [] names= {"John","Mike","Jane","Talgat", "Olga"};
		
		System.out.println("There are "+names.length+" values in my array of names");//5 size of array
		
		//Print Jane:
		System.out.println(names[2]);
		
		//*Rule when creating array in this way using curly brackets has to be all on the same line
		//this wont work:   int[] numbers;
		//					numbers={10,20,30};
		
		
		
		
		
		
		
		
		
	}
}