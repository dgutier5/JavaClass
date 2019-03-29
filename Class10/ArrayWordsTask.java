package com.Class10;

public class ArrayWordsTask {

	public static void main(String[] args) {
		/*3.Create an array of words: Java, Saturday, day, coding, is.
		Print the following sentence using element of array: “Saturday is Java coding Day”.
		*/

		
		String[] words= {"Java","Saturday","day","Coding","is"};
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		
		//other way to print:
		//String sentence=words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]
		//System.out.println(sentence);
		
	}

}
