package com.Class17_3;

public class CarMilage {

	public static void main(String[] args) {
		CarMilage milage=new CarMilage();  
		milage.printMilage();	
		
	}
		// 99999
		
		void printMilage() {
		for (int a = 0; a <= 9; a++) {

			for (int b = 0; b <= 9; b++) {

				for (int c = 0; c <= 9; c++) {

					for (int d = 0; d <= 9; d++) {
						System.out.println(a + "" + b + "" + c + "" + d);//0000,0001
					}
				}

			}

		}
	}
}