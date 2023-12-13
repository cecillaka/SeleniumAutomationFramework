package com.testCases;

import java.net.URL;
import com.setup.*;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

import com.pageObjects.LoginPage;
import com.utililies.ReadConfig;

import io.cucumber.java.en.Given;



public class BaseClass  {
	public LoginPage login;  
	public SetUpBrowsers setup;
	private ReadConfig configFile;
	private WebDriver driver;


	@BeforeMethod
	@Parameters("browser")
	public void SetUpMethod(String browser) {
		
		setup =new SetUpBrowsers(browser);
		driver=setup.getDriver();
		configFile=setup.getConfig();
		driver.get(configFile.getApplicationURL());
		driver.manage().window().fullscreen();
		
	}


	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		//driver.quit();
	}


}
