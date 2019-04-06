package com.Class16;

public class Car {
	//Attributes
	
	String make, model, color; 
	int door, wheels;
	
	public static void main(String[] args) {
		// ClassName variableName=new ClassName();
		
		//1st Object
		   Car car1=new Car();    //new Car creates an object 
		   car1.make="Honda";
		   car1.model="Civic";		//objects have acces to all features we specify 
		   car1.color="Black";
		   car1.door=4;
		   car1.wheels=4;
		   //car honda has 4 wheels
		   System.out.println("Car "+car1.make+" has "+car1.wheels+" wheels");
		   //define behavior
		   car1.drive();  //drive, reverse, stop are methods
		   car1.reverse();
		   car1.stop();
		   
		   System.out.println("----------------------Second Object--------------------");
		   //2nd Object
		   Car car2=new Car(); //new car creates object
		   car2.make="Tesla";
		   car2.model="X";
		   car2.color="Blue";
		   car2.door=4;
		   car2.wheels=4;
		   //My car is blue Tesla
		   System.out.println("My car is "+car2.color+" "+car2.make);
			car2.drive();
			car2.reverse();
			car2.stop();
	}
	//define behavior using method. create methos & name it
	
	void drive() {
		System.out.println("Car can drive");
	}
	
	void reverse() {
		System.out.println("Car can reverse");
	}
	void stop() {
		System.out.println("Car can stop");
	}
	
	
}
