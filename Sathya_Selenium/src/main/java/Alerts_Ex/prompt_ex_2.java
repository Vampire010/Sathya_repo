package Alerts_Ex;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class prompt_ex_2 {

	public static void main(String[] args) throws InterruptedException 
	{
		String Url = "file:///Users/girishg/git/repository8/Sathya_Selenium/src/main/java/Alerts_Ex/prompt_ex.html";

		System.setProperty("webdriver.chromedriver.driver", "/Users/girishg/eclipse-workspace/Sathya_Selenium/Drivers/chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(Url);
		
		
			//Click the link to activate the alert
				driver.findElement(By.xpath("/html/body/button")).click();

			    WebDriverWait wait = new WebDriverWait(driver, 10);		
				//Wait for the alert to be displayed and store it in a variable
				Alert alrt = wait.until(ExpectedConditions.alertIsPresent());
				

				//Type your message
				alrt.sendKeys("C");
				Thread.sleep(3000);

				//Press the OK button
				alrt.accept();
				Thread.sleep(3000);
				driver.quit();
	}

}
