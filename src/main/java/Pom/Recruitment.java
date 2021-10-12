package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Recruitment 
{
	Select s;
	
	@FindBy(xpath="//li/a/b[text()='Recruitment']")
	WebElement recruitment;
	
	@FindBy(xpath="//li/a[text()='Candidates']")
	WebElement candidate;
	
	@FindBy(xpath="//input[@name='btnAdd']")
	WebElement addbtn;
	
	@FindBy(xpath="//input[@name='addCandidate[firstName]']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@name='addCandidate[lastName]']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@name='addCandidate[email]']")
	WebElement email;
	
	@FindBy(xpath="//select[@id='addCandidate_vacancy']")
	WebElement jobvaccancy;
	
	@FindBy(xpath="//input[@id='addCandidate_resume']")
	WebElement resume;
	
	@FindBy(xpath="//img[@class='ui-datepicker-trigger']")
	WebElement calendar;
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	WebElement month;
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	WebElement year;
	@FindBy(xpath="//a[text()='10']")
	WebElement date;
	
	@FindBy(xpath="//input[@class='checkbox']")
	WebElement ckdata;
	
	@FindBy(xpath="//input[@id='btnSave']")
	WebElement savebtn;
	
	
	
	public Recruitment(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void recrtment()
	{
		recruitment.click();
	}
	
	public void candidt()
	{
		candidate.click();
	}
	
	public void add_btn()
	{
		addbtn.click();
	}
	
	public void first_name(String fname)
	{
		firstname.sendKeys(fname);
	}
	
	public void last_name(String lname)
	{
		lastname.sendKeys(lname);
	}
	
	public void emailid(String mail)
	{
		email.sendKeys(mail);
	}
	
	public void job_vaccancy()
	{
		s= new Select(jobvaccancy);
		s.selectByVisibleText("Software Engineer");
	}
	
	public void resume_()
	{
		resume.sendKeys("C:\\Users\\user\\Downloads\\file1.DOCX");
	}
	
	public void cal()
	{
		calendar.click();
		s=new Select(month);
		s.selectByVisibleText("Sep");
		s=new Select(year);
		s.selectByValue("2020");
		date.click();
	}
	
	public void ck_data()
	{
		ckdata.click();
	}
	
	public void save_btn()
	{
		savebtn.click();
	}
	

}
