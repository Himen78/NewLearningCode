package selenium.code.firsrcode;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver driver;
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();  
  }
  
  @Test
  public void radioTest() {
	  
	  driver.get("https://testautomation.co/webelements/");
		List<WebElement> browserElement = driver.findElements(By.name("browser"));
		browserElement.get(2).click();
		for(WebElement radio : browserElement)
		{
			System.out.println(radio.getAttribute("value"));
		}
  }

  @AfterTest
  public void afterTest() {
  }

}
