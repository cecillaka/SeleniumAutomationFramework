package com.setup;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.utililies.ReadConfig;

public class SetUpBrowsers {

	public DesiredCapabilities desiredCapabilities;
	private ReadConfig configFile;
	private WebDriver driver;

	public SetUpBrowsers(String browserName) {

		desiredCapabilities = new DesiredCapabilities();
		configFile = new ReadConfig();
		// chrome
		if (browserName.equalsIgnoreCase("chrome")) {
			try {

				desiredCapabilities.setBrowserName("chrome");
				desiredCapabilities.setPlatform(Platform.ANY);

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}

		}
		// firefox
		else if (browserName.equalsIgnoreCase("firefox")) {
			try {
				desiredCapabilities.setBrowserName("firefox");
				desiredCapabilities.setPlatform(Platform.ANY);

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}

		}
		// microsoft edge
		else if (browserName.equalsIgnoreCase("edge")) {
			try {

				desiredCapabilities.setBrowserName("MicrosoftEdge");
				desiredCapabilities.setPlatform(Platform.ANY);

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}

		}

		else {
			System.out.println("No Browser to open");
		}

		try {
			driver = new RemoteWebDriver(new URL(configFile.getSeleniunServerURl()), desiredCapabilities);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public WebDriver getDriver() {
		return driver;
	}

	public ReadConfig getConfig() {
		return configFile;
	}

}
