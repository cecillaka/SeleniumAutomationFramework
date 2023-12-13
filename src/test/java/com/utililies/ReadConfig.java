package com.utililies;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class ReadConfig {
	Properties pro;
	
	public ReadConfig() {
		File src = new File(System.getProperty("user.dir")+"\\Configurations\\config.properties");
		
		System.out.println(System.getProperty("user.dir"));
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
	public String getSeleniunServerURl() {
		return pro.getProperty("seleniunServerIP");		
	}
	
	public String getApplicationURL() {
		return pro.getProperty("baseURL");		
	}
	
	public String getUserName() {
		return pro.getProperty("userName");		
	}
	
	public String getPassword() {
		return pro.getProperty("password");		
	}
	
	
	public String getBrowserName() {
		return pro.getProperty("browserName");		
	}


}
