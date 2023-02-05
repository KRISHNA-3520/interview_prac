package com.practice.mavenproject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;


public class CalculatorTest {

	static AppiumDriver driver;
	//static AndroidDriver driver;
	public static void main(String[] args) {
		try {
			openCalculator();
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			System.out.println(exp.getStackTrace());
		}
	}

	public static void openCalculator() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName","Galaxy F12");
		cap.setCapability("udid","RZ8R912P9CT");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","13");
		cap.setCapability("appPackage","com.sec.android.app.popupcalculator");
		cap.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver(url,cap);

		System.out.println("Application started....");
		//2
		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_02")).click();
		
		//+
		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add")).click();
		
		//3
		driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_03")).click();
		
		String result = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_tv_result")).getText();
		
		System.out.println("Result = "+result);
		
		driver.quit();
		
	}
}
