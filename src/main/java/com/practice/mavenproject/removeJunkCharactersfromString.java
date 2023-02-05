package com.practice.mavenproject;

public class removeJunkCharactersfromString {

	public static void main(String[] args) {

		String str= "Krishna@1234#Jamadar";   
		System.out.println(str.replaceAll("[^a-zA-Z ]+"," "));
	}

}
