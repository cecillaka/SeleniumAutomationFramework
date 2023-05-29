package selenium.seleniunFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    	{
        //System.out.println( "Hello World!" );
 
    	//Setting system properties of ChromeDriver
    	System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver.exe");
       	WebDriver driver =new ChromeDriver();
       	driver.get("https://www.browserstack.com/guide/run-selenium-tests-using-selenium-chromedriver");
       	driver.manage().window().maximize();
       	driver.getTitle();
       	driver.findElement(By.id("free-trial-link-anchor")).click();
       
	 Thread.sleep(3000);
	 
	 
     driver.findElement(By.xpath("//input[@placeholder='Full name']")).sendKeys("cecil");  	
     Thread.sleep(5000);
    }
    
    

}
