package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver.driver", "/Users/girishg/eclipse-workspace/Sathya_Selenium/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver(); 
        
		driver.get("https://parabank.parasoft.com/");
       
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		
		
        
       WebElement ele = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")); 
       
       
       
       boolean isdisp = ele.isDisplayed();
       
       System.out.println("iS Element Displayed ? "+ isdisp);
       
       
       
       boolean isEnb = ele.isEnabled();
       
       System.out.println("iS Element Enabled? " + isEnb);
       driver.quit();
       
	}

}
