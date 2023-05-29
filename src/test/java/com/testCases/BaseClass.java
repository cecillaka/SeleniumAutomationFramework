package com.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;


public class BaseClass {
	WebDriver driver;
	@BeforeMethod
	public void SetUpMethod(WebDriver driver, String browser) {
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+"Configurations//Drivers//chromedriver.exe");
			driver = new ChromeDriver();

		}
		else if(browser.equalsIgnoreCase("firefox")) 
		{
			driver = new ChromeDriver();
		}
		
		
		
	}
	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	

}
