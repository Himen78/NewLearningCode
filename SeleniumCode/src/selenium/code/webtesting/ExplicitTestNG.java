package selenium.code.webtesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitTestNG {
	
	WebDriver driver;

	  @BeforeMethod
	  public void beforeMethod() {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		 // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testExplicit() {
		  
		  driver.get("https://testautomation.co/webelements/");
		  WebDriverWait wait = new WebDriverWait(driver,15);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("explibutton")));
		  driver.findElement(By.id("explibutton")).click();
		  
	  }
	  
	  @AfterMethod
	  public void afterMethod() {
		  
		 
	  }

}
