package Setup;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class utility implements Paths {
	
	public static String config(String data) throws IOException
	{
		FileInputStream f=new FileInputStream(conf);
		Properties p = new Properties();
		p.load(f);
		String w=p.getProperty(data);
		return w;
	}
	
	public static String Screenshot(WebDriver driver, String screenshot_name) throws Exception
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File sorc=ts.getScreenshotAs(OutputType.FILE);
		String path="System.getProperty(user.dir)+ScreenShots\\screenshot_name+dateName"+".png";
		File des=new File(path);
		Files.copy(sorc, des);
		return path;
		
	}

}
