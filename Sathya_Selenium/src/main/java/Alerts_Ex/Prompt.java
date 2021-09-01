package Alerts_Ex;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Prompt
{

	public static void main(String[] args) throws InterruptedException 
	{

		String Url = "https://www.selenium.dev/documentation/webdriver/js_alerts_prompts_and_confirmations/";

		System.setProperty("webdriver.chromedriver.driver", "/Users/girishg/eclipse-workspace/Sathya_Selenium/Drivers/chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(Url);
		
		
			//Click the link to activate the alert
				driver.findElement(By.linkText("See a sample prompt")).click();

			    WebDriverWait wait = new WebDriverWait(driver, 10);		
				//Wait for the alert to be displayed and store it in a variable
				Alert alrt = wait.until(ExpectedConditions.alertIsPresent());
				

				//Type your message
				alrt.sendKeys("Selenium");
				Thread.sleep(3000);

				//Press the OK button
				alrt.accept();
				Thread.sleep(3000);
				driver.quit();

	}

}
