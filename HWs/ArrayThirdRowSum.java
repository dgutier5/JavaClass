package com.HWs;

public class ArrayThirdRowSum {

	public static void main(String[] args) {
		// Write a program to sum the elements in the third row.
		
		int[][] a = {
				{5,2,3,7},
				{1,5,2,2},
				{1,2,3,4}
			};
			
	     //should print 10
		
	
		int[] row3Sum = new int[a[2].length];
		
		for (int row = 0; row < a.length; row++) {
			
			for (int col = 0; col < a[row].length; col++) {
				System.out.println(a[row][col]+" ");
				if (row == 2) {
					 row3Sum[2] = row3Sum[2]+a[row][col];
				}
			}
		}
		
		

	}

}
