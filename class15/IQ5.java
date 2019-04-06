package com.class15;

public class IQ5 {

	public static void main(String[] args) {
		//5. Write a java program to reverse String? Reverse a string word by word?
		
		String sentence ="The master is speaking";
		String reverse = "";
		for (int a = sentence.length()-1; a >= 0; a--) {
			reverse = reverse+sentence.charAt(a);
		}
		System.out.print(reverse);
		
		System.out.println();
		
		String[] word = reverse.split(" ");
		for(int i = word.length-1; i>=0; i--) {
			System.out.print(word[i]+" ");
		}
		
		
	}

}
