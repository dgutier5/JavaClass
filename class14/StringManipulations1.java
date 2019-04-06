package com.class14;

public class StringManipulations1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Saturday";
		
		char [] array = str.toCharArray();
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		
		System.out.println();
		
		//for each loop (Advanced Loop)
		for (char c: array) {
			System.out.println(c);
		}
		
	}

}
