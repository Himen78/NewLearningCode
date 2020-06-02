package Selenium.BuildFramework;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Selenium.PageObject.LandingPage;
import Selenium.PageObject.LoginPage;
import Selenium.Resource.BaseClass;

public class HomePage extends BaseClass {
	
	public WebDriver driver;
	
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String emailId, String Password) throws Exception
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("Url"));
		
		// Create new object and Import Get Login method from Landing Page class.
		LandingPage LP = new LandingPage(driver);
		LP.getLogin().click();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.getEmail().sendKeys(emailId);
		loginPage.getPassword().sendKeys(Password);
		loginPage.clickLogin().click();
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		// 1. Dataset 1 - Username and Password
		// 2. Dataset 2 - Username and Password
		// 3. Dataset 3 - Username and Password
		
		Object[][] dataSet = new Object[2][2]; // 3 - Data Set, 2 - Data i.e : UID, Pass
		
		// 1. Dataset 1
		dataSet[0][0] = "abc@gmail.com";
		dataSet[0][1] = "DataSetFirstPassword";
		
		// 2. Dataset 2
		dataSet[1][0] = "xyz@gmail.com";
		dataSet[1][1] = "DataSetSecondPassword";
		
		return dataSet;
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
