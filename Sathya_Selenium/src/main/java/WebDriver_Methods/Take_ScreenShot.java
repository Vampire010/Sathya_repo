package WebDriver_Methods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Take_ScreenShot 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chromedriver.driver", "/Users/girishg/eclipse-workspace/Sathya_Selenium/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver(); 
        
		driver.get("https://parabank.parasoft.com/");
        
        
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        Files.copy(scrFile, new File("/Users/girishg/git/repository8/Sathya_Selenium/Images/image.png"));
        
        driver.quit();
        
	}

}
