package com.practice.mavenproject;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String original,reverse="";
		int length;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter string or number");
		original = in.nextLine();
		length = original.length();

		for(int i=length-1;i>=0;i--)
		{
			reverse = reverse + original.charAt(i);
		}
		if(original.equals(reverse))
		{
			System.out.println("entered string or number is palindrome");
		}
		else
		{
			System.out.println("Entered string or number is not palindrome");
		}
	}


}
