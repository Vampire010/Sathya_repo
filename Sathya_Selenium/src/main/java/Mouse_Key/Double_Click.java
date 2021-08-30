package Mouse_Key;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chromedriver.driver", "/Users/girishg/eclipse-workspace/Sathya_Selenium/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver(); 
        
		driver.get("file:///Users/girishg/git/repository8/Sathya_Selenium/src/main/java/Mouse_Key/Db.html");
		
		
		
		WebElement  ele = driver.findElement(By.xpath("//*[@id=\"demo\"]"));
		
		
		Actions act = new Actions(driver);
		
		//Double Click
		Thread.sleep(3000);
		act.doubleClick(ele).perform();
		
		

		//Right CLick
		Thread.sleep(3000);
		act.contextClick(ele).perform();
		
	}

}
