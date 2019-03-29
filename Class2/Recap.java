package com.Class2;

public class Recap {
	
	public static void main(String[] args) {
		//1.Primitive
		//byte, short, int, long
		byte b=127;
		short s=32767;
		//double, float
		double d=10.02;
		//char
		char c='a';
		char c1='1';
		char c2='$';
		//boolean
		boolean bln=true;
		boolean bln1=false;
		//2.Non-primitive
			
		String s1="Syntax";
		String s2="Syntax Technologies!";
		String s3="100";
		String s4="A";
		
		System.out.println(s2);
		System.out.println("good morning!");
		
		String name="John!!!";
		//need to print good morning John
		System.out.println("good morning "+name);
		
		int day=26;
		//today is august 26
		System.out.println("today is august  "+day);
		
		int q=10;
		int w=20;
		int x=q+w;
		
		String e="Good";
		String r="Morning";
		
		System.out.println(q+w+e+r);//30GoodMorning
		System.out.println(q+e+w+r);//10Good20Morning
		System.out.println(q+e+r+w);//10GoodMorning20
		System.out.println(e+r+q+w);//GoodMorning1020**********TRICKY
		System.out.println(e+r+(q+w));//GoodMorning30**********TRICKY
		System.out.println(e+r+x);//GoodMorning30**************
		System.out.println((e+r)+(q+w));//GoodMorning30********
		
		int i=100;
		String number="100";
		System.out.println(i+number);//100100
		
		
	}
	
	
}
