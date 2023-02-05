package com.practice.mavenproject;

/* ​A class which is declared with the abstract keyword is known as an abstract
class in Java.
-- Abstraction is a process of hiding the implementation details and showing only
functionality to the user.

 */

abstract class Bike{  
	abstract void run();  
}  
class abstract1 extends Bike{  

	void run(){
		System.out.println("running safely");
	}  
	public static void main(String args[]){

		Bike obj = new abstract1();  
		obj.run();  
	}  
}  

