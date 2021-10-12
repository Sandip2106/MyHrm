package Logic;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Pom.Recruitment;
import Setup.Baseclass;
import Setup.utility;

public class recruitmentTest extends Baseclass 
{
	
	@Test
	 public void recrt() throws Exception
	 {
		admloginTest.adminlogin();
		Logger=extent.createTest("verifying Recruitment");
		Recruitment rt= new Recruitment(driver);
		rt.recrtment();
		rt.candidt();
		Thread.sleep(1000);
		rt.add_btn();
		Thread.sleep(1000);
		rt.first_name(utility.config("fname"));
		Thread.sleep(1000);
		rt.last_name(utility.config("lname"));
		Thread.sleep(1000);
		rt.emailid(utility.config("mail"));
		Thread.sleep(1000);
		rt.resume_();
		rt.job_vaccancy();
		Thread.sleep(1000);
		rt.cal();
		Thread.sleep(1000);
		rt.ck_data();
		Thread.sleep(1000);
		rt.save_btn();
		Logger.log(Status.PASS, "Employee added successfully");
		 
	 }
}