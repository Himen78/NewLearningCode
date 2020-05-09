package Selenium.BuildFramework;

import org.testng.annotations.Test;

import Selenium.Resources.BaseClass;

public class HomePage extends BaseClass {
	
	@Test
	public void basePageNavigation() throws Exception
	{
		driver = initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
	}
	

}
