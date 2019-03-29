package com.Class12;

public class ForEachIn2D {

	public static void main(String[] args) {
		/*Create a grocery list: fruits{}
		 * 						 veggies{}
		 * 						 dairy{}
		 * Retrieve all values using 2 diffrent loops
		 */
		
		String[][] groceryList= {
							{"Apples","Pears","Orange","Grapes","Banana"},
							{"Lettuce","Carrots","Celery"},
							{"Milk","Yogurt"},
																			};
//		for(int row=0; row<list.length;row++) {
//			for(int col=0;col[row] < list)
//		}
		
		//Advanced
		for(String[] list:groceryList) {
			for(String item:list ) {
				System.out.println(item);
			}
		}
		
		
		

	}

}
