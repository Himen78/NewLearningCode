package Selenium.BuildFramework;

import org.testng.annotations.Test;

import Selenium.PageObject.LandingPage;
import Selenium.PageObject.LoginPage;
import Selenium.Resource.BaseClass;

public class HomePage extends BaseClass {
	
	@Test
	public void basePageNavigation() throws Exception
	{
		driver = initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		
		// Create new object and Import Get Login method from Landing Page class.
		LandingPage LP = new LandingPage(driver);
		LP.getLogin().click();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.getEmail().sendKeys("abc@gmail.com");
		loginPage.getPassword().sendKeys("password");
		loginPage.clickLogin().click();
	}
	

}
