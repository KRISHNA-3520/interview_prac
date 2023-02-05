package com.testng.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class groupTest {
  
	WebDriver driver;
    // Saving the expected title of the Webpage
    String title = "ToolsQA";
    
   
    @Test
    public void starting_point(){
    	System.out.println("This is the starting point of the test");
    	//Initialize Chrome Driver
    	//driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
    	 driver = new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.get("https://www.toolsqa.com/");
    	 
    }
    
    
    @Test(groups = {"demo"})	
    public void checkTitle() {	
       String testTitle = "Free QA Automation Tools For Everyone";
       String originalTitle = driver.getTitle();
      Assert.assertEquals(originalTitle, testTitle);
    }	
    
    @Test(groups = {"demo"})	
    public void click_element() {	
       driver.findElement(By.xpath("/html/body/header/nav/div/div/div[3]/div/div[1]/ul/li[1]/a")).click();
        System.out.println("Home is clicked");	
    }
}
