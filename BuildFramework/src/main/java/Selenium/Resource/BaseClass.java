package Selenium.Resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class BaseClass {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws Exception
	{
	
		prop = new Properties();
		FileInputStream FIS = new FileInputStream("H:\\Git\\MyLocalGit\\BuildFramework\\src\\main\\java\\Selenium\\Resource\\Data.properties");
		
		prop.load(FIS);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			// Execute Chrome Driver
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox"))
		{
			// Execute Firefox Code
		}
		else if (browserName.equals("IE"))
		{
			// Execute IE Code
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
}
