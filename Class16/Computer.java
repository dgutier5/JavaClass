package com.Class16;

public class Computer {
	
	//defining attributes-variables:
	boolean mouse,keyboard;
	int screen,ram;
	String os,brand;
	
	
	public static void main(String[] args) {
		//ClassName variableName=new ClassName();

		//1st Object
		   Computer comp1=new Computer();   //->Classname variable//new Computer creates an object 
		   comp1.os="Windows";
		   comp1.mouse=true;
		   comp1.keyboard=true;		//objects have access to all features we specify 
		   comp1.screen=2;
		   comp1.ram=8;
		   comp1.brand="HP";
		   
		   //define behavior of object
		   comp1.watchMovie();
		   comp1.doJavaCoding();
		   comp1.playMusic();
		   
		   //2nd Object
		   Computer comp2=new Computer(); //new Computer creates object
		   comp2.os="Mac OS";
		   comp1.mouse=false;
		   comp2.keyboard=false;
		   comp2.screen=4;
		   comp2.ram=6;
		   comp2.brand="Apple";
		   
		   //behavior
		   comp2.watchMovie();
		   comp2.doJavaCoding();
		   comp2.playMusic();
	}   
		   void watchMovie() {
			   System.out.println("We can watch a movie on a computer "+brand);
		   }
		   void doJavaCoding() {
			   System.out.println("We can do Java coding on our computer "+brand);
		   }
			void playMusic() {
				System.out.println("We can play music on our computer "+brand);
			}
		}
	