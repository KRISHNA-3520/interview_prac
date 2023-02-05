package com.practice.mavenproject;

public class pattern4 {

	public static void main(String[] args) {

		for (int i = 5; i >= 1; i--) { 

			for (int j = 5; j > i; j--) { 

				System.out.print(" "); // Prints Blank space

			}

			for (int k = 1; k <= i; k++) {

				System.out.print("*"); //Prints *

			}

			System.out.println(" "); //Prints blank spaces

		}


	}

}


/*

*  *  *  *  *
   *  *  *  *
      *  *  *
         *  *
            *
*/