package com.Class10;

public class PrintAllValuesFromArrayUseForLoop {

	public static void main(String[] args) {
		//print all values from an array


						//	0       1      2      3         4     5        6
		String [] names= {"John","Mike","Jane","Talgat", "Olga","Mehmet","Siyar"};

		//1. use for loop to print all the names:we know we need to loop 7 times
		
//				int size=names.length;
//				System.out.println(size); //7
//				
//				for(int i=0; i<size; i++) {
//					System.out.println(names[i]);
//				}
//				
//				
				System.out.println("----------------------------");
				
				
			//2.Print all values
				
				char grades[]= {'A','B','C','D','E','F'};
			
				int size=grades.length;
				System.out.println(size); //6
				
				for(int i=0; i<size; i++) {
					System.out.println(grades[i]);
				}
				
				
				System.out.println("----------other way-------------------");
		
			//2.1
				for(int i=0; i<grades.length; i++) {
					System.out.println(grades[i]);
				}
				
				System.out.println("-----oter way w/ equal and -1---------------");
				
			//2.2
				
				for(int i=0; i<=grades.length-1; i++) {
					System.out.println(grades[i]);
				}
				
				//*Learning Point: why we use grades.length-1?
				
				/*                   0   1   2   3   4   5 =Index
				  char grades[]= {'A','B','C','D','E','F'};
				
				grades.length--> gives u size 6
				
				how many indexes do we have?-->5
				index # will always be size-1
				grades.length is equal to 6 so if you dont add -1 ur 
				i at 6th iteration in loop will become =6. condition will check to be true 
				i less or equal to six --> so inside loop it will try to access element 
				stored at index 6. And we dont have index 6.
				so to make this condition: i<=grades.length not to go over index 
				boundary of 5 we add in -1
				*/
	}
		
}
		
		
		
		
	
