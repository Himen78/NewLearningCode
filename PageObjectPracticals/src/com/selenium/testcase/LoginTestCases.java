package com.selenium.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.selenium.pom.HomePage;
import com.selenium.pom.LoginPage;

public class LoginTestCases {
	
	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		LoginPage LP = new LoginPage(driver);
		LP.EmailId().sendKeys("Email");
		LP.Password().sendKeys("Password");
		LP.Submit().click();
		LP.homePageClick().click();
		
		HomePage HP = new HomePage(driver);
		HP.Search().sendKeys("Rediff");
		HP.Submit().click();
	}

}