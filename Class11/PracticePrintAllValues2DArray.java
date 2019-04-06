package com.Class11;

public class PracticePrintAllValues2DArray {

	public static void main(String[] args) {
		int[][] num= {
                {11,12,13,14},//4
                {21,22,23},//3
                {31,32,33,34}//4
        };
		
//      int rows=num.length;         //using Arrayname.length =number of rows
//      System.out.println(rows);   
//      
//      int cols=num[2].length;      //number of columns.[2]->represents the row. find #columns have to goto each row
//      System.out.println(cols);   //**LearningPoint: Columns have dependency on rows!!!
        
		//nestedloop- loop thru each row then inside each row loop thru each column
		
		//Practice:
		
		String[][] food= {//3,4
                {"burger", "fries", "hot dog", "meatloaf"},//1 array or 1 row
                {"lo mein", "fried rice"},
                {"biriyani", "korma", "naan", "chick peas"}
        };

			for(int row=0; row<food.length; row++) {
				for(int col=0; col<food[row].length; col++) {
					System.out.print(food[row][col]+" ");
				}
				System.out.println(" ");
			}
		
		
		
		
		
	}

}
