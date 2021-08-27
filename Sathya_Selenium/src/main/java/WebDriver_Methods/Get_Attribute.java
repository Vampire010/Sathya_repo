package WebDriver_Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Attribute {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver.driver", "/Users/girishg/eclipse-workspace/Sathya_Selenium/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		
			driver.get("https://www.softwaretestingexperts.com");
			
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
			
        
        for(WebElement link:alllinks )
        {
        	System.out.println(link.getAttribute("href"));
        }
        
        driver.quit();
		
		
	}

}
