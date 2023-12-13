package com.testCases;

import java.net.Socket;
import java.net.SocketException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;

import com.pageObjects.*;
import com.setup.SetUpBrowsers;
import com.utililies.ReadConfig;

public class LoginTestCase_001 extends BaseClass  {
	
@Test(priority=0)
public void login() {
	System.out.println("run test");
}




}
