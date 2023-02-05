package com.practice.mavenproject;

// program to sort the odd numbers in ascending order while 
//leaving the even numbers at their original positions.

public class sortingArray {

	public static void main(String[] args) {
int[] a = {5, 8, 6, 3, 4};
		
		System.out.println("Original Array : ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	
		for(int i=0; i < a.length; i++) 
		{
			
			if (a[i]%2 != 0) {
				
				int toPlace = i;
				
				for(int j=i+1; j < a.length; j++) 
				{
					
					if (a[j]%2!=0 && a[i] > a[j]) 
					{
						toPlace = j;
					}
				}
				
				int temp = a[toPlace];
				a[toPlace] = a[i];
				a[i] = temp;
			}
		}

		System.out.println();
		System.out.println("Array after sorting only odd numbers");	
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}


	}

}
