package com.practice.mavenproject;


public class pattern1 {


	public static void main(String[] args) {
	
		int row = 5;
		for(int i=1;i<=row;i++) //loop for row
		{
			for(int j=1;j<=i;j++) //loop for column
			{
				System.out.print("* ");
			}
			System.out.println(); // New line
		}
		System.out.println("Delete this line");
	}
 }


/*
 
*
* *
* * *
* * * *
* * * * * 

*/
