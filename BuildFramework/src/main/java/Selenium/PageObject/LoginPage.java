package Selenium.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By EmailId = By.id("user_email");
	By Password = By.id("user_password");
	By loginButton = By.name("commit");
	
	public WebElement getEmail()
	{
		return driver.findElement(EmailId);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(Password);
	}
	
	public WebElement clickLogin()
	{
		return driver.findElement(loginButton);
	}

}
