package com.HWs;

public class Repl78ClassandObject {
	
	public static void DogClass(String breed, String name, String color) {
		
	}	
	
	public static void bark(String breed) {
		System.out.println(breed+" can bark");
		
	}
	
	public static void run(String breed) {
		System.out.println(breed+" can run");
	}
	
	public static void play(String breed) {
		System.out.println(breed+" can play");
	}
	
	public static void main(String[] args) {
		/*
		 Create a Class main that should be a template for the DogClass. 
		 In this class you should specify the following attributes: 
		 breed, name, color and following behaviors: bark(), run(), play().
		 Create 3 different objects of it: Husky, Bulldog, Labrador  with 
		 specific  attributes and behaviors.

		 The output of the program should be as following:
 
		 Husky can bark
		 Husky can run
		 Husky can play
		 Bulldog can bark
		 Bulldog can run
		 Bulldog can play
		 Labrador can bark
		 Labrador can run
		 Labrador can play
		 */

		Repl78ClassandObject Husky = new Repl78ClassandObject();
		
		String breed = "Husky";
		
		Husky.DogClass(breed, "Balto", "Grey/Blue/White");
		Husky.bark(breed);
		Husky.run(breed);
		Husky.play(breed);
		
		Repl78ClassandObject Bulldog = new Repl78ClassandObject();
		
		String breed2 = "Bulldog";
		
		Bulldog.DogClass(breed2, "Luis", "Gold/White");
		Bulldog.bark(breed2);
		Bulldog.run(breed2);
		Bulldog.play(breed2);
		
		Repl78ClassandObject Labrador = new Repl78ClassandObject();
		
		String breed3 = "Labrador";
		
		Labrador.DogClass(breed3, "Charlie", "Golden");
		Labrador.bark(breed3);
		Labrador.run(breed3);
		Labrador.play(breed3);
		
	}

}
