package com.Class17_3;

public class NestedLoopDemo {

	public static void main(String[] args) {
		
		NestedLoopDemo demo=new NestedLoopDemo();
		demo.printNumber();
		
		
	}
		
		void printNumber() {
		for (int i=1; i<=2; i++) {
			
			for (int y=0;y<=3; y++) {
				
				System.out.println(i+" "+y);
			}
		}
		
			
	}

}
