package com.practice.mavenproject;

public class Test_encapsulation {
	public static void main(String[]args)
	{
		//creating instance of the encapsulated class  
		Student_encapsulation s=new Student_encapsulation();  

		//setting value in the name member  
		s.setName("Krishna");  

		//getting value of the name member  
		System.out.println(s.getName());  

	}

}
