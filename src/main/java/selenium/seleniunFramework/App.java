package selenium.seleniunFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException, MalformedURLException
    	{
     
    	DesiredCapabilities  desiredCapabilities=new DesiredCapabilities();
    	desiredCapabilities.setBrowserName("chrome");
    	desiredCapabilities.setPlatform(desiredCapabilities.getPlatform());
        WebDriver driver =new RemoteWebDriver(new URL("http://192.168.18.21:4444"),desiredCapabilities);
        
        driver.get("https://www.browserstack.com/guide/run-selenium-tests-using-selenium-chromedriver");
    	driver.manage().window().maximize();
    	
    	System.out.println(driver.getTitle());
    
    	
    	
    }
    
    

}
