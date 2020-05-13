package Selenium.BuildFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

import Selenium.PageObject.LandingPage;
import Selenium.Resource.BaseClass;

public class ValidateTitle extends BaseClass {
	
	
	@Test
	public void getTitlePage() throws Exception
	{
		driver = initializeDriver();
		
		driver.get(prop.getProperty("Url"));
		
		
		// Create new object and Import Get Login method from Landing Page class.
		LandingPage LP = new LandingPage(driver);
		Assert.assertEquals(LP.getTitle().getText(), "FEATURED COURSES");
		Assert.assertTrue(LP.getPageNavigationBar().isDisplayed());
		
}
}