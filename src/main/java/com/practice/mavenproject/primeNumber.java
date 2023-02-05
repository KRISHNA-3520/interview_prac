package com.practice.mavenproject;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		

		int num;
		
		System.out.println("Enter number to check palindrome");
		Scanner in = new Scanner(System.in);
		num=in.nextInt();
		
		if(num==0||num==1)
		{
			System.out.println("Enter number "+num+" is not a prime number");
		}
		if(num%2!=0)
		{
			System.out.println("Enter number "+num+" is  a prime number");
		}
		else
		{
			System.out.println("Enter number "+num+" is not  a prime number");
		}
	}

}
