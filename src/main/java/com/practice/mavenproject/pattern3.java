package com.practice.mavenproject;

public class pattern3 {
	
	public static void main(String args[]) { {

		int i, j;

		for (i = 0; i < 5; i++) {  

			for (j = 2 * (5 - i); j >= 0; j--) { //For Loop for Row

				System.out.print(" "); // Print Spaces

			}

			for (j = 0; j <= i; j++) { //For Loop for col

				System.out.print("* "); // Print Star

			}

			System.out.println();

		}
	}

	}

}


/*
        * 
      * * 
    * * * 
  * * * * 
* * * * * 
*/