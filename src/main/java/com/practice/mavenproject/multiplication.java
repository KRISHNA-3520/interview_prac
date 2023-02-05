package com.practice.mavenproject;

import java.util.Scanner;

public class multiplication {

	public static void main(String[] args) {
		int a;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number");
		a = in.nextInt();
		System.out.println("Muliplication of "+a);

		for(int i = 1;i<=10;i++)
		{
			System.out.println(a+"x"+i+" = "+a*i);
		}


	}

}
