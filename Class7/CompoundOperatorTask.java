package com.Class7;

public class CompoundOperatorTask {

	public static void main(String[] args) {
	/* 1. Declare variable and increase by 100 using shorthand operator
    * 2. Declare variable and decrease by 67 using shorthand operator
    * 3. Declare variable cakePiece=11 and divide cakePiece between 4 people using shorthand operator
    * each person should get an equal piece of cake
    *
    * 4. Declare variable cakePiece=25 and divide cakePiece between 7 people
    * using shorthand operator found out how many pieces of cake left after it was distributed equally among 7 people
	*/
		
		//1.
		int a=10;
		a+=100; //a=a+100
		System.out.println(a);
		
		//2.
		 int d=20;
	     d-=67;//d=d-67;
	     System.out.println(d);
	     
	     //3.
	     int cakepiece=11;
	     cakepiece/=4;//cakepiece=cakepiece/4
	     System.out.println("Every person got "+cakepiece);
	     
	     //4.
	     int cakePiece=25;
	     cakePiece%=7;
	     System.out.println("The leftover is "+cakePiece);
	     
	}

}
