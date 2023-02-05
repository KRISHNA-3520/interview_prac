package com.practice.mavenproject;

/*
 *  Interfaces specify what a class must do and not how. It is the blueprint of the class.
-- Methods inside interfaces are abstract.
-- With the help of interfaces we can achieve multiple interfaces.

 */

interface fun {

	// public, static and final
	final int a = 10;

	// public and abstract
	void display();
}
// A class that implements the interface.
class InterfaceExample implements fun {

	// Implementing the capabilities of
	// interface.
	public void display(){
	System.out.println("Geek");
	}

	// Driver Code
	public static void main(String[] args)
	{
		InterfaceExample t = new InterfaceExample();
		t.display();
		System.out.println(a);
	}
}
