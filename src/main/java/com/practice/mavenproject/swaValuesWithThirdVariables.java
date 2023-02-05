package com.practice.mavenproject;

import java.util.Scanner;

public class swaValuesWithThirdVariables {

	public static void main(String[] args) {
		int x,y,temp;
		System.out.println("Enter number to swap");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		System.out.println("Values before swapping x: "+x+" y: "+y);
		temp=x;
		x = y;
		y= temp;
		System.out.println("Values after swapping x: "+x+" y: "+y);



	}

}
