package com.testng.prac;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class pattern1 {
	
  @Test
  public void f() {
	  int row = 5;
		for(int i=1;i<=row;i++) //loop for row
		{
			for(int j=1;j<=i;j++) //loop for column
			{
				System.out.print("* ");
			}
			System.out.println(); // New line
		}
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Started printing stars...!!!!");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Finished printing stars...!!!!");
  }

}
