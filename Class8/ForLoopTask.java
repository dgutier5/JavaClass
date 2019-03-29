package com.Class8;

public class ForLoopTask {

	public static void main(String[] args) {
		/*1.Print numbers from 1 to 100
		 * 2.Print numbers from 100 to 1
		 * 3. Print odd numbers from 1 to 20
		 * 4. Print even numbers from 20 to 1
		 * 5. Print even numbers from 20 and 50
		 * 6. Print odd numbers between 20 1nd 50
		 */

		//1.
		for (int i=1 ; i<=100;   i++) {
			System.out.println(i);
		}
		System.out.println("------------");
		
		//2.
		for (int a=100 ; a>=1; a-- ) {
			System.out.println(a);
		}
		System.out.println("------------");
		
		//3.Print odd numbers from 1 to 20
		
		for (int b=1 ; b<=20; b++) {
			if (b%2!=0) {
				System.out.println(b);
				
			}	
			
		}
		
		System.out.println("------------");
		
		//4.Print even numbers from 20 to 1
		for (int c=20;  c>=1;  c--) {
			if(c%2==0) {
				System.out.println(c);
			}
		}
		
		System.out.println("------------");
		
		//5. Print even numbers from 20 and 50 :use for loop bc we know starting and ending point
		//1 way
		for (int d=20; d<=50;  d++) {
			if(d%2==0) {
				System.out.println(d);
			}
		}
		System.out.println("------------");
	//2 way:
	//	for (int i=20; i<=50; i+=2){
	//  system.out.println(i);
	//   }
		
		
		//6. Print odd numbers between 20 and 50
		for (int e=20; e<=50; e++) {
			if(e%2!=0) {
				System.out.println(e);
			}
	}

}
	}