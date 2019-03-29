package com.Class1;

public class StringConcatenation {

	public static void main(String[] args) {

		
//		int a=10;
//		int b=20;
//		System.out.println(a+b);
		
//		String x="Syntax";
//		String y="Technologies";
//		System.out.println(x+" "+y);
//		//How to print 'syntax technologies 10'
//		System.out.println(x+" is "+y+" "+10);
//	
//		int a=10;
//		int b=20;
//		
//		if(a<b) { 
//			System.out.println("a less than b");//a less than b
//			//10 is less than 20;
//			System.out.println(10+"is less than"+20);
//			System.out.println(10+" "+"is less than"+" "+20);
//		}
		

		int x=10;
		int y=20;
		
		
		String a ="100";
		String b="200";
		
		System.out.println(x+y); //30
		System.out.println(a+b); //100200 b/c in string + does not do math only combines together strings
		System.out.println(x+y+a); //30100
		System.out.println(x+y+a+x);//3010010
				
		
	}

}
