package com.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By Username = By.xpath("//input[@id='login1']");
	By Password = By.name("passwd");
	By Submit = By.name("proceed");
	By HomePage = By.linkText("rediff.com");
	
	public WebElement EmailId()
	{
		return driver.findElement(Username);
	}
	
	public WebElement Password()
	{
		return driver.findElement(Password);
	}
	
	public WebElement Submit()
	{
		return driver.findElement(Submit);
	}
	
	public WebElement homePageClick()
	{
		return driver.findElement(HomePage);
	}
}
