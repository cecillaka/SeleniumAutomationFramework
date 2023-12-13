package com.utililies;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenShot {
	
	public String captureBase64ScreenShot(WebDriver driver) {
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		String base64=scrShot.getScreenshotAs(OutputType.BASE64);
		return base64;
	}
	

}
