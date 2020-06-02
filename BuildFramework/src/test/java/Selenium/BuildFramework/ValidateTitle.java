package Selenium.BuildFramework;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Selenium.PageObject.LandingPage;
import Selenium.Resource.BaseClass;

public class ValidateTitle extends BaseClass {
	
	public WebDriver driver;
	
	@Test
	public void getTitlePage() throws Exception
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("Url"));
		
		
		// Create new object and Import Get Login method from Landing Page class.
		LandingPage LP = new LandingPage(driver);
		Assert.assertEquals(LP.getTitle().getText(), "FEATURED COURSES123");
		Assert.assertTrue(LP.getPageNavigationBar().isDisplayed());	
}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}