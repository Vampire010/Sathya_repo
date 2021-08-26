package Intro_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Chromebrsw
{

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chromedriver.driver", "/Users/girishg/eclipse-workspace/Sathya_Selenium/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.softwaretestingexperts.com");
	}

}
