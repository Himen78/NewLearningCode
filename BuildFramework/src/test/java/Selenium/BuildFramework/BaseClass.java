package Selenium.BuildFramework;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public WebDriver driver;
	
	public WebDriver initializeDriver() throws Exception
	{
	
		Properties prop = new Properties();
		FileInputStream FIS = new FileInputStream("C:\\Users\\Himen\\Documents\\Eclipse Work Station\\BuildFramework\\src\\test\\java\\Selenium\\BuildFramework\\Data.properties");
		
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
