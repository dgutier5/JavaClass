package com.Class3;

public class ConcatAndOperator {

	public static void main(String[] args) {
		String a="Hello";
		String b="Bye";
		
		int x=10;
		int y=20;
		
		System.out.println(x+y+a+b);//30HelloBye
		System.out.println(x+a+y+b);//10Hello20Bye
		System.out.println(x+a+b+y);//10HelloBye20
		System.out.println(a+b+x+y);//HelloBye1020
		System.out.println(a+b+(x+y));//HelloBye30
		
		

	}

}
