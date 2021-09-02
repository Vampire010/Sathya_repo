package IFrames_Ex;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class IFrame_Ex1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "/Users/girishg/git/repository8/Sathya_Selenium/Drivers/geckodriver");

		// Create a driver object for  browser.
		   WebDriver driver = new FirefoxDriver(); 
		
		   // Maximize the web browser. 
		   driver.manage().window().fullscreen();
	
		   // Store the URL in a variable of type String. 
		   String URL = "file:///Users/girishg/git/repository8/Sathya_Selenium/src/main/java/IFRMES_HTML/SCENARIO_1.html"; 
		
		   // Call get() method and pass the URL as a parameter. 
		   driver.get(URL); 
		   
		// Wait for some time to load web page completely. 
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 

		// Locate iframe and switch driver context to first iframe by value of name attribute. 
		   System.out.println("Switching to first frame from main web page"); 
		   //Select Frame By Frameindex
		   driver.switchTo().frame(0); 
		  
		   driver.findElement(By.xpath("//*[@id=\"Fname1\"]")).sendKeys("Frame 1"); 
		   Thread.sleep(3000);

		   
		// Switch to main web page from iframe by using defaultContent() method. 
		   System.out.println("Switching to main web page from first frame"); 
		   driver.switchTo().defaultContent();
		   
	
		   //Select Frame By Frame Name
		   driver.switchTo().frame("Frame2"); 
		  
		   driver.findElement(By.xpath("//*[@id=\"Fname2\"]")).sendKeys("Frame 2"); 

		   driver.switchTo().defaultContent(); 

		   //Select Frame By Frame Name
		   WebElement Frame_3 = driver.findElement(By.xpath("//*[@id=\"Frame3\"]"));
		   driver.switchTo().frame(Frame_3); 
			  
		   driver.findElement(By.xpath("//*[@id=\"Fname3\"]")).sendKeys("Frame 3"); 
		   driver.switchTo().defaultContent(); 
		   
		   Thread.sleep(3000);
		   driver.quit(); 

	}

}
