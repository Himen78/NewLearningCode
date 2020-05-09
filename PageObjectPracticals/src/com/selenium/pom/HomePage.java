package com.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;

	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	By Search = By.id("srchword");
//	By Submit = By.xpath("//form[@id='queryTop']//input[@class='newsrchbtn']");
	
	@FindBy(id="srchword")
	WebElement Search;
	
	@FindBy(xpath="//form[@id='queryTop']//input[@class='newsrchbtn']")
	WebElement Submit;
	
	
	public WebElement Search()
	{
		return Search;
	}

	public WebElement Submit()
	{
		return Submit;
	}
}
