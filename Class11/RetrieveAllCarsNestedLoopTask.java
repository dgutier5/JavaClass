package com.Class11;
					//HW
public class RetrieveAllCarsNestedLoopTask {
	//Retrieve all values from 2D Array w/Nested Loop
	public static void main(String[] args) {
		// Create an array of cars: american, german, korean, Italian,
		//Then retrieve all values from that array.
		
		String[][]cars= {
							{"Ford","Chevy","Jeep"},//3
							{"Audi","BMW","Porsche","Mercedes"},//4
							{"Kia","Hyundai"},//2
							{"Maserati","Ferrari","Lambo"}//3
																	};
		  
        for (int i=0; i<cars.length; i++) {
            
            for (int j=0; j<cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");
            }
            System.out.println();
		
							
		

	}

}
}
