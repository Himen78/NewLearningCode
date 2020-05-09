package selenium.code.webtesting;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class HardAssertionExample {
	
	WebDriver driver;
 
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
  }
  
  @Test
  public void testHardAssertion() {
	  
	  driver.get("https://www.google.com");
	  String titleOfGoogleHomePage = driver.getTitle();
	  String expectedTitleOfGoogleHomePage = "Google";
	  
	  Assert.assertEquals(titleOfGoogleHomePage, expectedTitleOfGoogleHomePage);
	  driver.findElement(By.name("q")).sendKeys("www.udemy.com");
	  driver.findElement(By.name("btnK")).submit();
	  
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  // driver.quit();
  }

}
