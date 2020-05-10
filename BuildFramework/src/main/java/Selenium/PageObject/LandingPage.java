package Selenium.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By signIn = By.xpath("//span[contains(text(),'Login')]");
	
	public WebElement getLogin()
	{
		return driver.findElement(signIn);
	}

}
