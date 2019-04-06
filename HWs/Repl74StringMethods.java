package com.HWs;

import java.util.Scanner;

public class Repl74StringMethods {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter any programming language");
         String language = sc.nextLine();
         
         String lang1="Java";
         String lang2="C";
         String lang3="C++";
         String message;
         
         if (lang1.equals(language)) {
             message="Java is a programming language";
         }else if (lang2.equals(language)){
             message="C is a procedural programming language";
            
         }else if (lang3.equals(language)) {
             message="C++ is a middle-level programming language";
         }else {
             message="Doesn't match any programming language";
         }
         System.out.println(message);
        
      

	}

}
