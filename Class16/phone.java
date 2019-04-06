package com.Class16;

public class phone {
	
	//defining attributes-variables:
		boolean touchScreen,keyboard;
		int memory;
		String os,model;
		
		public static void main(String[] args) {
			//ClassName variableName=new ClassName();

			//1st Object
			   phone iPhone=new phone();   //->Classname variable//new Computer creates an object 
			   iPhone.touchScreen=true;
			   iPhone.keyboard=true;
			   iPhone.memory=64;
			   iPhone.os="IOS";
			   iPhone.model="X";
			   
			   phone Android=new phone();
			   Android.touchScreen=true;
			   Android.keyboard=true;
			   Android.memory=128;
			   Android.os="Android";
			   Android.model="Pixel";
			  

		
		
		
   }
}
