package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import Logic.admloginTest;

public class adm_login  {
	
	// 1. Declaration
	
		//Username text field
	    @FindBy(xpath="//input[@id='txtUsername']")
	    WebElement username;
	    
	    //Password text field
	    @FindBy(xpath="//input[@id='txtPassword']")
	    WebElement password;
	    
	    //Login button
	    @FindBy(xpath="//input[@class='button']")
	    WebElement login;
	    
	    // 2.initialization
	    
	    public adm_login(WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    }
	    
	    // 3. Utilization
	    
	    public void Uname(String un) throws Exception
	    {
	    	username.sendKeys(un);
	    }
	    
	    public void Pwd(String pw) throws Exception
	    {
	    	password.sendKeys(pw);
	    }
	    
	    public void Lclick() throws Exception
	    {
	    	login.click();
	    }
	
	

}
