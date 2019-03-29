package com.Class7;

public class LoopsV {
//for loops:
	public static void main(String[] args) {
		//print good morning 5 times (vickclass5 @51:45)
		
//		System.out.println("Good Morning");
//		System.out.println("Good Morning");
//		System.out.println("Good Morning");
//		System.out.println("Good Morning");
//		System.out.println("Good Morning");
//		
		//3 things needed in loop
		//1. Initialization
		//2.Condition
		//3. Incerement/decrement operator
		
		//++ increment
		//-- decrement
		
	//	int a=10;
		
		//a=a+1 same as a++ //post increment
		//a+a-1 same as a--//post decrement
		
		/* for (initialization;condition;increment/decrement) {
		 	block of code
		  }
		  
		 */
		//Print 10 times
		//for (int i=1; i<=10; i++) {
			//System.out.println("Good morning");
		//}
	//System.out.println("-----------------------------");
	
		//Print numbers from 1 to 10
		//for (int z=1; z<=10; z++) {
			//System.out.println(z);
		//}
		
		//Print numbers 1-10, but print only 1,3,5,7,9
		
		//for(int b=1; b<=10; b+=2) {
		//	System.out.println(b);
		//}
		
		//Print numbers 1-10, but print only 2,4,6,8,10
		
		//for(int i=2; i<=10; i+=2) {
		//	System.out.println(i);
	//	}
		
		
		
	//	 Print numbers from 1-100
	//	 for(int y=1; y<=100; y++) {
	//		System.out.println(y);
	//	 }
		
	//	System.out.println("==============================================");
		
		 //Print numbers from 100 to 1
		// for(int j=100; j>=1; j--) {
		//	 System.out.println(j );  
		// }
		
		
	//Print even numbers between 20 and 50
		
//		 for( int c=20; c<=50; c+=2) {
//			System.out.println(c);   
//		 }
		
//		for(int c=20; c<50; c++) {
//			if (c%2==0) {
//				System.out.println(c);
//			}
//		}
		
		//Print odd numbers between 20 and 50

		for (int i = 21; i <= 50; i += 2) {
			System.out.println(i);
		}

		for (int i = 20; i <= 50; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

}
