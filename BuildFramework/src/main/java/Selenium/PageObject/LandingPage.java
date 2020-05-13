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
	By featuredTitle = By.xpath("//h2[contains(text(),'Featured Courses')]");
	By pageNavigation = By.xpath("//ul[@class='nav navbar-nav navbar-right']");
	
	public WebElement getLogin()
	{
		return driver.findElement(signIn);
	}
	
	public WebElement getTitle()
	{
		return driver.findElement(featuredTitle);
	}
	
	public WebElement getPageNavigationBar()
	{
		return driver.findElement(pageNavigation);
	}

}
