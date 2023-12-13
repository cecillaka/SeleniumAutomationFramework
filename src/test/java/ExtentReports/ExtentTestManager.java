package ExtentReports;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

public class ExtentTestManager implements ITestListener {

	
    private static ExtentReports extent = ExtentManager.createExtentReports();
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
    
	

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());
        test.set(extentTest);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.get().pass("Test passed");
    } 

    @Override
    public void onTestFailure(ITestResult result) {
        test.get().fail(result.getThrowable());
     
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test.get().skip(result.getThrowable());
    }
    

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
 
}
