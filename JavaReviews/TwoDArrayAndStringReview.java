package com.JavaReviews;

public class TwoDArrayAndStringReview {

	public static void main(String[] args) {
	
		
//      Write a program to print the length of each array.
		int[][] ar = { { 1, 2, 3 },
					   { 4, 5, 6, 9 },
					   { 7, 8 } 
					 };
		
		
		//one way: not efficient			   					};
		System.out.println(ar[0].length);
		System.out.println(ar[1].length);
		System.out.println(ar[2].length);
		
		System.out.println("===================================================");
 
		//for loop : efficient way
		
		for (int i=0; i<ar.length; i++) {
			System.out.println("the lenght of row "+(i+1)+"="+ar[i].length );
		}
		
		System.out.println("=====================================================");
		
		//for each loop:
		for(int[] inner:ar) {
			System.out.println("the lenght of row = "+inner.length );
		}
		
		System.out.println("==========================================================");
		
		
		//writa a program to print all elements of the second array using a for loop and for each loop
//		int[][] ar = { { 1, 2, 3 },
//				       { 4, 5, 6, 9 },
//				       { 7, 8 } 
//					 };
		
		//for loop way:
		 for (int i = 0; i < ar.length; ++i) {
	           for (int j = 0; j < ar[i].length; ++j) {
	               System.out.println(ar[i][j]);
	           }
	       }
		 
		 System.out.println("--------------------------------------------------------------");

		 //each loop way:
	       for (int[] innerArray : ar) {
	           for (int data : innerArray) {
	               System.out.println(data);
	           }
	       }

		System.out.println("----------------------------------------------------------------");
	//Write a program to find the average of row 2.
		//      2 6 9 3 7
		//      1 7 9 4 8
		//      0 4 6 2 5
		//      0 1 2 3
		
		int[][] rating = { { 2, 6, 9, 3, 7 }, { 1, 7, 9, 4, 8 }, { 0, 4, 6, 2, 5 }, { 0, 1, 2, 3 } };	
		
		double sum=0;
		double average;
		for(int i=0; i<rating[1].length; i++) {
			sum+=rating[1][i];
			
		}
		average=sum/5;
		System.out.println(average); //5.8
		
		System.out.println("==============================================================");
		
		//for same array above: find the number of values above the value of 7
				//		2 6 9 3 7
				//      1 7 9 4 8
				//      0 4 6 2 5
				//      0 1 2 3
				
//int[][] rating = { { 2, 6, 9, 3, 7 }, { 1, 7, 9, 4, 8 }, { 0, 4, 6, 2, 5 }, { 0, 1, 2, 3 } };	
		//use for each
		
		int count=0;
		
		for(int [] inner:rating) {
			for(int element: inner) {
				if(element>7) {
					count++;
				}
			}
		}
		System.out.println("the number of elements above 7 is "+count); //3
		
		
		
		System.out.println("-----------------------------------------------------------------");
		
		
		//Print the average of values in column 3
		int sum2=0;
		
		for (int i=0; i<rating.length; i++) {
			sum2+=rating[i][2] + rating[i][1];		//i is row, row is changing
		}
		System.out.println(sum2/rating.length);
		
		
		System.out.println("===================================================================");
		
		
		
		
			
			
			
			
			
		
		
	}

}
