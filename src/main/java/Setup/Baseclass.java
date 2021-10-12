package Setup;

//import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Baseclass extends utility implements Paths {
	
	public static ExtentReports extent;
	public static WebDriver driver;
	public static ExtentTest Logger;
	
	static
	{
		System.setProperty(Chrome_key, Chrome_value);
		System.setProperty(gecko_key, gecko_value);
	}
	
	@BeforeSuite
	public void extentreport()
	{
		ExtentSparkReporter htmlreporter= new ExtentSparkReporter("./Reports/extent.html");
		extent= new ExtentReports();
		extent.attachReporter(htmlreporter);
	}
	
	@BeforeMethod
	public void browser_invoke() throws Exception
	{
		if(config("browser").equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			System.out.println("Chrome browser open successfully");
		}
		else
		{
			driver=new FirefoxDriver();
			System.out.println("Firefox browser open successfully");
		}
		
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void Teardown(ITestResult result) throws Exception
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Logger.log(Status.FAIL,"Testcase Failed is" +result.getName());  //to add name in extent report
			Logger.log(Status.FAIL,"Tescase failed is"+result.getThrowable());  //to add error/exception in extent report
			
			String p = utility.Screenshot(driver, result.getName());
			Logger.fail(result.getThrowable().getMessage(),MediaEntityBuilder.createScreenCaptureFromPath(p).build());
			Logger.log(Status.FAIL, "Credential enter are Invalid");
		    System.out.println("Credential enter are Invalid");

		}
	}
	
	
	
	@AfterTest
	public void close()
	{
		driver.close();
		extent.flush();
	}
	
	
	
	

}
