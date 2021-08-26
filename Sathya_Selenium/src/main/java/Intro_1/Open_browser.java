package Intro_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Open_browser {

	public static void main(String[] args) 
	{

		

		WebDriver driver = new SafariDriver();
		driver.get("https://www.softwaretestingexperts.com");

	
	}
}
