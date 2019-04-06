 package com.Class11;

public class RetrievingAllVAlues {

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
		//****Remember: NestedLoop: 
		//*****First inner loop has to finish iteration. And then it will go to outer Loop!!!!!
		
		
        for (int row=0; row<num.length; row++) {    //this allows to loop thru each row.
        											//the num.length gives number of rows					
            
            for (int col=0; col<num[row].length; col++) { //loops thru each column
                System.out.print(num[row][col]+" ");
            }
            System.out.println(); //prints rows on separate lines
        }
        
        
        System.out.println("----------------------------------------------------------");
        
        String[][] food= {//3,4
                {"burger", "fries", "hot dog", "meatloaf"},//1 array or 1 row
                {"lo mein", "fried rice"},
                {"biriyani", "korma", "naan", "chick peas"}
        };
        
        for (int i=0; i<food.length; i++) {
            
            for (int j=0; j<food[i].length; j++) {
                System.out.print(food[i][j]+" ");
            }
            System.out.println();
        }
    }









	}


