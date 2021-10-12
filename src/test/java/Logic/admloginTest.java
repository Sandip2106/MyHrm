package Logic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Setup.Baseclass;
import Setup.utility;
import Pom.adm_login;

public class admloginTest extends Baseclass 
{

	
		@Test
//		@Test(dataProvider="getdata")
	    public static void adminlogin() throws Exception
//	    public static void adminlogin(String username,String password) throws Exception
	    {
	    	Logger = extent.createTest("Login Verification");
	    	adm_login l = new adm_login(driver);
	    	Thread.sleep(2000);
	    	l.Uname(utility.config("username"));
	    	l.Pwd(utility.config("password"));
//	    	l.Uname(username);
//	    	l.Pwd(password);
	    	l.Lclick();
	    	Logger.log(Status.PASS, "Admin login is successful");
	    	//System.out.println(driver.getTitle());
//	    	String exp="OrangeHRM";
//	    	Assert.assertEquals(driver.getTitle(), exp);
//	    	Logger.log(Status.PASS, "Login done sucessfully");
	    	
//	    	WebElement logo = driver.findElement(By.xpath("//a/img[@alt='OrangeHRM']"));
//	    	if(logo.isDisplayed())
//			{
//				System.out.println("website is successfully login");
//				Logger.log(Status.PASS, "Credential enter are Valid");
//			}
//			else 
//			{
//			    System.out.println("website is not successfully login");
//			    Assert.fail();
//			}
//	    }
//		
//		@DataProvider
//		public Object[][] getdata()
//		{
//			Object[][] data= new Object[2][2];
//			//0th row
//			data[0][0]="admin";
//			data[0][1]="admin123";
//			//1st row
//			data[1][0]="adm";
//			data[1][1]="a123";
//			return data;
//			
//		}

		
	    }
}

	


