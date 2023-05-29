package com.testCases;

import java.net.Socket;
import java.net.SocketException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.pageObjects.*;
import com.utililies.ReadConfig;

public class LoginTestCase_001 {
	public WebDriver driver;
	public LoginPage login;  
	public ReadConfig cofigFile ;
	
// creating logs for the test cases
// private static final Logger logger = LogManager.getLogger(LoginTestCase_001.class);

@BeforeMethod
@Parameters("browser")
public void SetUpMethod(String browserName) {
	
	//create new objects
	cofigFile = new ReadConfig();
			
//chrome
if(browserName.equalsIgnoreCase("chrome")) {
	System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	driver = new ChromeDriver();
	
}
//firefox
else if(browserName.equalsIgnoreCase("firefox")) {
	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
	driver = new FirefoxDriver();

}
//microsoft edge
else if(browserName.equalsIgnoreCase("edge")) {
	
	 System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"//Drivers//msedgedriver.exe");
	 driver = new EdgeDriver();
				
}

else {
	System.out.println("No Browser to open");
}
	
    driver.get(cofigFile.getApplicationURL());
    driver.manage().window().fullscreen();
  //create new objects
    login = new LoginPage(driver);
	
	
	
}

@Test
public void logInTest() {
	login.insertUsername(cofigFile.getUserName());
	login.insertPassword(cofigFile.getPassword());
	login.clickLoginBtn();

}

@AfterTest
public void tearDown() throws InterruptedException {
	Thread.sleep(3000);	
	driver.quit();
}

}
