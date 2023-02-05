package com.practice.mavenproject;

import java.util.Scanner;

public class swapValuesWOthirdVariables {

	public static void main(String[] args) {
		int x,y;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter numbers to swap");
		x = in.nextInt();
		y=in.nextInt();

		System.out.println("Values before swapping  x: "+x+" y: "+y);
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("Values after swapping  x: "+x+" y: "+y);


	}

}
