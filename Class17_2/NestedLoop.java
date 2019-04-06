package com.Class17_2;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
         * for (initialization; condition; increment/decrement) {code c;
         *      for (initialization condition; increment/decrement) {code d;
         *  }
         * }
         * 
         * for (int i=0; i<3, i++) {
         *  System.out.println(i)} 
         * 
         *      for (int y=0; y<3; y++) {
         *          System.out.println(y)}
         *  }
         * }
         * 
         * first 0 will print from the outer loop
         * second 0 will print from inner loop
         * third 1 will print from inner loop
         * fourth 2 will print from inner loop
         * fifth 1 will print from outer loop
         * sixth 0 will print from inner loop
         * 
         */
        
        for (int i=0; i<3; i++) {
            System.out.println("--------I am outter loop---------");
            
                for (int y=0; y<3; y++) {
                    System.out.println("I am inner loop");
                }
  	
	}

	}
}
