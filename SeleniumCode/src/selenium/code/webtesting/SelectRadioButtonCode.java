package selenium.code.webtesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectRadioButtonCode {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Himen\\Downloads\\Selenium Related\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomation.co/webelements/");
		List<WebElement> browserElement = driver.findElements(By.name("browser"));
		browserElement.get(2).click();
		for(WebElement radio : browserElement)
		{
			System.out.println(radio.getAttribute("value"));
		}
		
	}

}
