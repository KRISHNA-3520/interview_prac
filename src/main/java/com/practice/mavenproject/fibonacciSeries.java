package com.practice.mavenproject;

import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		int num, a=0,b=0,c=1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of fibonacci series");
		num = in.nextInt();
		for(int i=0;i<=num;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.print(a + " ");
		}


	}

}
