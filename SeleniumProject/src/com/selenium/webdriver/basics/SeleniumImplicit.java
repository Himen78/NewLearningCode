package com.selenium.webdriver.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumImplicit {

	public static void main(String[] args) throws InterruptedException {
	
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("himenpatel2011@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Himen@78");
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_3")).submit();
		
		
		
		
		
		
		
		

	}

}
