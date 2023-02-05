package com.testng.prac;

import org.testng.annotations.Test;

public class testngpriorities {
	@Test(priority=1)
	 public void b_method(){
	    System.out.println("B Method");
	  }

	@Test(priority=1)
	 public void a_method(){
	    System.out.println("A method");
	 }
	
	@Test
	public void d_method() {
		System.out.println("This is D Method");
	}
		
	@Test
	public void c_method() {
		System.out.println("This is C Method");
	}
}
