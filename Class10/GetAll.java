package com.Class10;

public class GetAll {

	public static void main(String[] args) {
		
		
		 				//	0       1      2      3         4     5        6
		String [] names= {"John","Mike","Jane","Talgat", "Olga","Mehmet","Siyar"};
		
		int a=3;
		System.out.println(names[a]);//Talgat
		
		a+=2;
		System.out.println(names[a]);//Mehmet
		
		a-=4;
		System.out.println(names[a]); //Mike
		
		System.out.println("-----------------------");
		
		//use for loop to print all the names:we know we need to loop 7 times
		
		int size=names.length;
		System.out.println(size); //7
		
		for(int i=0; i<size; i++) {
			System.out.println(names[i]);
		}
		
	}

}
