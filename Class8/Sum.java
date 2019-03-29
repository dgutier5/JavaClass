package com.Class8;

public class Sum {

	public static void main(String[] args) {
		
		int sum=0;
		
		for (int i=1; i<=5; i++) {
			
			sum=sum+i; //0+1=1 | 1+2| 3+3| 6+4|10+5 sum
		}
		
		System.out.println(sum);// 15
		
		/*find sum of all even numbers from 1 to 100 */
		
		int sum1=0;
		
		for(int a=1; a<=100; a++) {
			if (a%2==0) {
				sum1=sum1+a;
			}
		}
		System.out.println(sum1);
		
		//-----------------------------watch video for rest of
		int sumAll=0;
		
		for(int y=10; y<=50; y+=10) {
		//	sumAll=sumAll
		}
	}

}
