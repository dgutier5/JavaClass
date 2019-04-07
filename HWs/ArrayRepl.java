package com.HWs;

public class ArrayRepl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int[][] a= {
                {5,2,3,7},
                {1,5,1,1},
                {8,3,1,2},
                           };
    
    //should be 8 write a prog that prints the highest value in the array
		int[][] num = {
                {5,2,3,7},
                {1,5,1,1},
                {8,3,1,2}
            };
        int largest=num[0][0];
        for( int i=0; i<num.length; i++) {
            for(int y=0; y<num[i].length; y++) {
                if ( num[i][y]>largest) {
                    largest=num[i][y];}}}
            System.out.println(largest);
            }
        
		
		
		
		
		
		
		


}
